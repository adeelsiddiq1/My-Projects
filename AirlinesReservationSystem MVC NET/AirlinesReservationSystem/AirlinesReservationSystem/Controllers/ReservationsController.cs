using AirlinesReservationSystem.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Data.Entity;
using System.Configuration;
using System.Data.SqlClient;
using System.Net;

namespace AirlinesReservationSystem.Controllers
{
    public class ReservationsController : Controller
    {
        private Entities db = new Entities();
        // GET: Reservations
        public ActionResult Index()
        {
            var ticket = db.Tickets.Include(t => t.Flight).Include(t => t.Payment).Include(t => t.Schedule).Where(t => t.UserId == User.Identity.Name);
            return View();
        }

        // GET: Reservations/Details/5
        public ActionResult Details(int id)
        {
#pragma warning disable CS0472 // The result of the expression is always the same since a value of this type is never equal to 'null'
            if (id == null)
#pragma warning restore CS0472 // The result of the expression is always the same since a value of this type is never equal to 'null'
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Ticket ticket = db.Tickets.Find(id);
            if (ticket == null)
            {
                return HttpNotFound();
            }
            return View(ticket);
        }

        [Authorize]
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Book(int sid, int fid, DateTime doj, string name, string Tclass)
        {

            Ticket model = new Ticket()
            {
                flightId = fid,
                scheduleId = sid,
                dateOfJourney = doj.Date,
                travelclass = Tclass
            };
            ViewBag.flightname = name;

            return View(model);
        }

        [Authorize]
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult CompleteBooking([Bind(Include = "paymentMode,totalAmount,bankDetails")] Payment payment)
        {
            if (ModelState.IsValid)
            {
                db.Payments.Add(payment);
                db.SaveChanges();
            }

            Ticket ticket = TempData["Ticket"] as Ticket;
            ticket.UserId = User.Identity.Name;
            ticket.paymentId = payment.paymentId;

            db.Tickets.Add(ticket);
            db.SaveChanges();

            Schedule schedule = db.Schedules.Find(ticket.scheduleId);
            if (ticket.travelclass.Contains("First"))
            {
                schedule.FCseats--;
            }
            else if (ticket.travelclass.Contains("Business"))
            {
                schedule.BCseats--;
            }
            else
            {
                schedule.ECseats--;
            }
            db.Entry(schedule).State = EntityState.Modified;
            db.SaveChanges();
            return RedirectToAction("Index");
        }
        [Authorize]
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Payment([Bind(Include = "flightId,scheduleId,dateOfJourney,passengerName,gender,phoneNumber,address,emergencyContact,travelclass")] Ticket ticket)
        {
            TempData["Ticket"] = ticket;

            ticket.seatNo = db.Tickets.Include(t => t.ticketId).Where(t => t.travelclass == ticket.travelclass).Count() + 1;
            Payment payment = new Payment()
            {
                totalAmount = getcostofticket(ticket.scheduleId, ticket.travelclass)
            };

            return View(payment);
        }

        private double getcostofticket(int scheduleId, string travelclass)
        {
            double cost = 0.00;
            Schedule s = new Schedule();
            var query = "SELECT cost" + travelclass + " FROM Schedule where scheduleId=" + scheduleId;
            string cString = ConfigurationManager.ConnectionStrings["ConnString"].ConnectionString;
            using (SqlConnection c = new SqlConnection(cString))
            {
                c.Open();
                using (SqlCommand cmd = new SqlCommand(query, c))
                {
                    using (SqlDataReader rdr = cmd.ExecuteReader())
                    {
                        while (rdr.Read())
                        {
                            cost = rdr.GetDouble(rdr.GetOrdinal("cost" + travelclass));
                        }
                    }
                }
            }
            return (cost);
        }

        // GET: Reservations/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Ticket ticket = db.Tickets.Find(id);
            if (ticket == null)
            {
                return HttpNotFound();
            }
            ViewBag.flightId = new SelectList(db.Flights, "flightId", "flightName", ticket.flightId);
            ViewBag.paymentId = new SelectList(db.Payments, "paymentId", "paymentMode", ticket.paymentId);
            ViewBag.scheduleId = new SelectList(db.Schedules, "scheduleId", "source", ticket.scheduleId);
            return View(ticket);
        }


        // GET: Reservations/Delete/5
        public ActionResult CancelTicket(int id)
        {

            Ticket ticket = db.Tickets.Find(id);
            if (ticket == null)
            {
                return HttpNotFound();
            }
            return View(ticket);
        }

        // POST: Reservations/Delete/5
        [HttpPost, ActionName("CancelTicket")]
        [ValidateAntiForgeryToken]
        public ActionResult CancelConfirmed(int id)
        {
            Ticket ticket = db.Tickets.Find(id);
            db.Tickets.Remove(ticket);
            db.SaveChanges();
            Schedule schedule = db.Schedules.Find(ticket.scheduleId);
            if (ticket.travelclass.Contains("First"))
            {
                schedule.FCseats++;
            }
            else if (ticket.travelclass.Contains("Business"))
            {
                schedule.BCseats++;
            }
            else
            {
                schedule.ECseats++;
            }
            db.Entry(schedule).State = EntityState.Modified;
            db.SaveChanges();

            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }
    }
}

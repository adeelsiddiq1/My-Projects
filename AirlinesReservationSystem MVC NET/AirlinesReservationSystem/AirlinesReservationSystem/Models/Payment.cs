//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace AirlinesReservationSystem.Models
{

    [Table("Payment")]
    public class Payment
    {
        [Key]
        public int paymentId { get; set; }
        public string paymentMode { get; set; }
        public string bankDetails { get; set; }
        public double totalAmount { get; set; }

        public virtual ICollection<Ticket> Ticket { get; set; }
    }
}

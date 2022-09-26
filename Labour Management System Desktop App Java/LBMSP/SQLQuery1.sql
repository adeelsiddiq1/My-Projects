create database lbsys
use lbsys

create table Add_Worker(
id int identity primary key,
name varchar(30),
ref_by varchar(40),
age int,
experience varchar(20),
salary bigint,
Adress varchar(100),
Contact varchar (15),
Statuss varchar(20),
height varchar(10),
weightt varchar(10)
 
)



select* from Add_Worker



create table attendence (
id int foreign key references Add_Worker(id),
name varchar(30),
statuss varchar(10),
time_in varchar(10),
time_out varchar(10),
datee date,
dayss varchar(10),
shifts int,
building varchar(50),
)


create table weekly_salary(
id int foreign key references Add_Worker(id),
name varchar(30),
date_from date,
date_to date,
salary bigint
)

create table users (
username varchar(20),
password varchar(20),


)

insert into users values('admin','admin')
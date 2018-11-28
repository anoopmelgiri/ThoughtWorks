# ThoughtWorks
Code challenge (Nov2018)

Below are the Manual Test cases for the overlapping date ranges


1. Happy path scenarios -

(01-01-2018, 20-01-2018)

(30-01-2018, 02-02-2018)

(10-10-2018, 24-11-2018)

(01-01-2018, 28-02-2018)
(10-03-2018, 13-04-2018)


2. Invalid inputs (negative senarios) -
*All invalid inputs can be classified as critical ones 

//Start date is ahead of end date 
(20-01-2018, 01-01-2018)

//Invalid day
(20-01-2018, 32-01-2018)

//Non numeric / empty values
(xx-01-2018, 02-xx-2018)
( -01-2018, 10- -2019)

//Non leap year vs leap year
(01-02-2018, 29-02-2018)

//Wrong format
(2018-12-01, 2018-12-31)
(10-31-2018, 11-05-2018)


3. Boundary values scenario -

//Just above the minimum value
(01-01-2018, 20-01-2018)
(21-01-2018, 12-02-2018)
*Important

//Checking the end date exclusive logic -
(10-10-2018, 11-11-2018)
(11-11-2018, 22-11-2018)
*Important

//Date ranges across different years
(01-12-2018, 22-01-2019)
(20-12-2018, 10-01-2019)

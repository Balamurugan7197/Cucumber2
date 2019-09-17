Feature: AddCustomers Steps

#Scenario:

#Given User should be in the Telecom home page
##And User click on Addcustomer button
#When user enters the datas in the particular feild
#And user click on submit button
#Then User should be displayed customer id generated  



#Scenario:

#Given User should be in the Telecom home page
#And User click on Addcustomer button
#When user enters the datas in the particular feilds
#|Bala|Murugan|bala@gmail.com|Madurai|7418360467|
#And user click on submit button
#Then User should be displayed customer id generated  



Scenario:

Given User should be in the Telecom home page
And User click on Addcustomer button
When user enters the data in the particular feilds
|fname   |  Ajith           |
|lname   |  Kumar           |
|mail    |  ajitha@gmail.com|
|address |  Madurai         |
|phno	 |  7418360467      |
And user click on submit button
Then User should be displayed customer id generated  
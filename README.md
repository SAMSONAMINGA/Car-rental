RentalAgency.java
Class Description
The RentalAgency class represents a rental agency that manages a fleet of cars and a list of customers. It provides methods to add cars and customers, rent cars to customers, and return rented cars.

Variables
cars: A list of Car objects representing the fleet of cars available for rent.
customers: A list of Customer objects representing the customers who can rent cars.
rentals: A list of Rental objects representing the current rentals.
Methods
addCar(Car car)
Adds a new car to the fleet.

Parameters:
car: The Car object to be added.
Returns: None
addCustomer(Customer customer)
Adds a new customer to the list of customers.

Parameters:
customer: The Customer object to be added.
Returns: None
rentCar(Customer customer, Car car)
Rents a car to a customer.

Parameters:
customer: The Customer object renting the car.
car: The Car object being rented.
Returns: None
returnCar(Car car)
Returns a rented car to the fleet.

Parameters:
car: The Car object being returned.
Returns: None
getAvailableCars()
Returns a list of available cars.

Returns: A list of Car objects representing the available cars.
getRentals()
Returns a list of current rentals.

Returns: A list of Rental objects representing the current rentals.
Car.java
Class Description
The Car class represents a car that can be rented.

Variables
licensePlate: A string representing the license plate number of the car.
isAvailable: A boolean indicating whether the car is available for rent.
Methods
getLicensePlate()
Returns the license plate number of the car.

Returns: A string representing the license plate number.
isAvailable()
Returns whether the car is available for rent.

Returns: A boolean indicating whether the car is available.
setAvailable(boolean isAvailable)
Sets whether the car is available for rent.

Parameters:
isAvailable: A boolean indicating whether the car is available.
Returns: None
Customer.java
Class Description
The Customer class represents a customer who can rent cars.

Variables
name: A string representing the name of the customer.
Methods
getName()
Returns the name of the customer.

Returns: A string representing the name of the customer.
Rental.java
Class Description
The Rental class represents a rental of a car to a customer.

Variables
customer: A Customer object representing the customer renting the car.
car: A Car object representing the car being rented.
Methods
getCustomer()
Returns the customer renting the car.

Returns: A Customer object representing the customer.
getCar()
Returns the car being rented.

Returns: A Car object representing the car.

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;

    public RentalAgency() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentCar(Customer customer, Car car) {
        if (car.isAvailable()) {
            car.setAvailable(false);
            Rental rental = new Rental(customer, car);
            rentals.add(rental);
            System.out.println("Car rented successfully!");
        } else {
            System.out.println("Car is not available for rent.");
        }
    }

    public void returnCar(Car car) {
        for (Rental rental : rentals) {
            if (rental.getCar().equals(car)) {
                rentals.remove(rental);
                break;
            }
        }
        car.setAvailable(true);
        System.out.println("Car returned successfully!");
    }

    public List<Car> getAvailableCars() {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.isAvailable()) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    public List<Rental> getRentals() {
        return rentals;
    }
}

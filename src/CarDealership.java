import java.util.ArrayList;

public class CarDealership {
    private ArrayList<Car> carsForSale = new ArrayList<>();

    public void addCar(Car car) {
        carsForSale.add(car);
    }

    private Boolean canGetCarByAge(Customer customer) {
        return 18 <= (2023 - customer.getBirthYear());
    }

    public Boolean sellCar(Car car, Customer customer) {
        if (canGetCarByAge(customer) && (carsForSale.remove(car))) {
            customer.buyCar(car);
            return true;
        }
        return false;
    }


    public ArrayList<Car> getCarsForSale() {
        return this.carsForSale;
    }

    public Boolean returnCar(Car car, Customer customer) {
        if (customer.returnCar(car)) {
            carsForSale.add(car);
            return true;
        }
        return false;
    }

}






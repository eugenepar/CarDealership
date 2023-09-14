import java.util.ArrayList;

public class CarDealership {
    private ArrayList<Car> carsForSale = new ArrayList<>();

    public void addCar(Car car){
        carsForSale.add(car);
    }
    public Boolean sellCar(Car car,Customer customer){
        if (carsForSale.remove(car)){
            customer.buyCar(car);
            return true;
        }
        return false;
    }

}


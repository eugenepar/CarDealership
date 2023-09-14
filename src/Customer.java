import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String phoneNumber;
    private ArrayList<Car> listOfBoughtCars;

    Customer(String name,String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Car> getListOfBoughtCars(){
        return this.listOfBoughtCars;
    }
    public void buyCar(Car car){
        listOfBoughtCars.add(car);
        System.out.println("Congrats on buying a new car: " + car.getBrand());
    }
    public Boolean returnCar(Car car){
       return listOfBoughtCars.remove(car);
    }



}

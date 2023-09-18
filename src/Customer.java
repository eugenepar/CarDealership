import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String phoneNumber;

    private int birthYear;
    private ArrayList<Car> listOfBoughtCars = new ArrayList<>();

    Customer(String name,String phoneNumber,int birthYear){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public ArrayList<Car> getListOfBoughtCars(){
        return this.listOfBoughtCars;
    }
    public void buyCar(Car car) {
        if (listOfBoughtCars.contains(car)) {
            System.out.println("You have already bought this car earlier!");
        } else {
            listOfBoughtCars.add(car);
            System.out.println("Congrats on buying a new car: " + car.getBrand());
        }
    }

    public Boolean returnCar(Car car){
       return listOfBoughtCars.remove(car);
    }



}

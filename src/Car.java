import java.util.ArrayList;

public class Car {
    private String make;
    private String brand;
    private int year;
    private int price;
    private int id;

    Car(String make,String brand,int year,int price,int id){
        this.make = make;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.id = id;
    }

    public String getMake(){
        return this.make;
    }
    public String getBrand(){
        return this.brand;
    }
    public Integer getYear(){
        return this.year;
    }
    public Integer getPrice(){
        return this.price;
    }
    public Integer getId(){
        return getId();
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}

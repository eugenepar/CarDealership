import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Phaser;

public class Main {
    private static CarDealership carDealership = new CarDealership();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        setUp();

        boolean goThroughTheLoop = true;
        while (goThroughTheLoop) {
            System.out.println("---------------------Welcome to Our Car Dealership---------------------");
            System.out.println("1. Get the full list of cars: ");
            System.out.println("2. Add Car: ");
            System.out.println("3. Sell Car: ");
            System.out.println("4. Exit: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println(carDealership.getCarsForSale());
                    break;
                case 4:
                    System.out.println("Exit");
                    goThroughTheLoop = false;
                    break;
                case 2:
                    addCar();
                    break;
                case 3:
                    sellCar();
                    break;
            }
        }
    }

    public static void setUp() {
        Car car = new Car("convertable", "Porsche", 2015, 100000, 11);
        Car car1 = new Car("truck", "Volvo", 2001, 50000, 12);

        carDealership.addCar(car);
        carDealership.addCar(car1);
    }

    public static void addCar() {

        System.out.println("Enter make of car: ");
        String make = scanner.nextLine();

        System.out.println("Enter brand of car: ");
        String brand = scanner.nextLine();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        System.out.println("Enter id: ");
        int id = scanner.nextInt();

        System.out.println("Enter price: ");
        int price = scanner.nextInt();
        scanner.nextLine();

        Car car = new Car(make, brand, year, price, id);
        carDealership.addCar(car);
    }

    public static void sellCar() {
        System.out.println("Enter car id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Car car = null;
        ArrayList<Car> fullListOfCars = carDealership.getCarsForSale();
        for (int i = 0; i < fullListOfCars.size(); i++) {
            if (id == fullListOfCars.get(i).getId()) {
                car = fullListOfCars.get(i);
            }
        }

        if (car == null) {
            System.out.println("We don't have this car");
        } else {
            System.out.println("Enter customer name: ");
            String name = scanner.nextLine();

            System.out.println("Enter phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Enter birthYear: ");
            int birthYear = Integer.parseInt(scanner.nextLine());
            Customer customer = new Customer(name, phoneNumber, birthYear);
            carDealership.sellCar(car, customer);
        }
    }
}
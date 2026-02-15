import java.util.scanners;

class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    // Constructor to initialize fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}class Car extends Vehicle {
    private String fuelType;

    // Constructor initializing both inherited and new fields
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Calls the Vehicle constructor
        this.fuelType = fuelType;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calls the parent method for brand, model, and year
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Showroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter Car Brand: ");
        String brand = input.nextLine();

        System.out.print("Enter Car Model: ");
        String model = input.nextLine();

        System.out.print("Enter Manufacturing Year: ");
        int year = input.nextInt();
        input.nextLine(); // Consume the leftover newline character

        System.out.print("Enter Fuel Type (Petrol/Diesel/Electric): ");
        String fuel = input.nextLine();

        // Instantiate the Car object
        Car myCar = new Car(brand, model, year, fuel);

        // Display the details
        System.out.println("\n--- Car Details in Showroom ---");
        myCar.displayDetails();

        input.close();
    }
}
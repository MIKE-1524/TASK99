        class Vehicle{

            protected String make;
            protected String model;
            protected int year;

            public Vehicle(String make, String model, int year){
                this.make = make;
                this.model = model;
                this.year = year;

            }

        }
        class Car extends Vehicle{
            private int numberofDoors;

            public Car(String make, String model, int year, int numberofDoors){
                super(make, model, year);
                this.numberofDoors = numberofDoors;
            }
            public void displayDetails(){

                System.out.println("Car Details: ");
                System.out.println("Make: " + make);
                System.out.println("Model: " + model);
                System.out.println("Year: " + year);
                System.out.println("Number of Doors: " + numberofDoors);
            }
        }

        public class Task13{

            public static void main(String[] args) {
                Car car = new Car("Toyota", "Camry", 2022, 4);
                car.displayDetails();
            }
        }
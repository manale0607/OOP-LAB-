public class Phone {
        String brand;
        String model;
        double price;

        Phone(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        Phone() {
            this("Unknown", "Not Specified", 0.0);
        }

        Phone(String brand) {
            this(brand, "Standard Model", 10000);
        }

        void display() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
            System.out.println("-------------------");
        }
    }

        public void main(String[] args) {

            Phone m1 = new Phone();
            Phone m2 = new Phone("Samsung");
            Phone m3 = new Phone("Apple", "iPhone 15", 350000);

            m1.display();
            m2.display();
            m3.display();
        }

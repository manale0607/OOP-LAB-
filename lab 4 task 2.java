public class Employee {
        int id;
        String name;
        double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        Employee(Employee e) {
            this.id = e.id;
            this.name = e.name;
            this.salary = e.salary;
        }

        void display() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("-------------------");
        }
    }

        public void main(String[] args) {

            Employee emp1 = new Employee(101, "Ali", 50000);

            Employee emp2 = new Employee(emp1);

            emp2.name = "Ahmed";
            emp2.salary = 60000;

            emp1.display();
            emp2.display();
        }

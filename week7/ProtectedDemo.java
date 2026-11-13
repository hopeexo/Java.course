package week7;

class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
}

class Manager extends Employee {

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    // Access protected variables directly
    public void printNameDirectly() {
        System.out.println("Direct access to name: " + name);
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

public class ProtectedDemo {

    public static void main(String[] args) {

        Manager manager = new Manager("Fortune", 50000);

        manager.printNameDirectly();
        manager.displayDetails();
    }
}
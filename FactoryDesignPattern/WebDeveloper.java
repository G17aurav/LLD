package FactoryDesignPattern;

public class WebDeveloper implements Employee {

    @Override
    public double getSalary() {
        // Provide a default implementation for getSalary
        System.out.println("Web Developer Salary: $7000");
        return 7000.0;
    }
    
}

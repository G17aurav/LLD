package FactoryDesignPattern;

public class AndroidDeveloper implements Employee{

	@Override
	public double getSalary() {
		// Provide a default implementation for getSalary
        System.out.println("Android Developer Salary: $8000");
        return 8000.0;
	}
}

package FactoryDesignPattern;

public class Developer {
    public static void main(String[] args) {
        EmployeeFactory.getEmployee("AndroidDeveloper").getSalary();
        EmployeeFactory.getEmployee("WebDeveloper").getSalary();
    }
}

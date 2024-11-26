package Restaurant_Management_System_Project;

import java.util.Scanner;

public class Employee extends Person {
    private int employeeId;
    private double salary;

    Employee() {
        super();
        employeeId = 0;
        salary = 0.0;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void setter() {
        super.setter();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee id: ");
        employeeId = input.nextInt();

        System.out.println("Enter salary: ");
        salary = input.nextDouble();
    }

    @Override
    public void update(){
        super.update();
        Scanner input = new Scanner (System.in);

        System.out.println("Enter new employee id: ");
        employeeId = input.nextInt();

        System.out.println("Enter new salary: ");
        salary = input.nextDouble();        
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Employee id: " + employeeId);
        System.out.println("Salary: " + salary);
    }

}

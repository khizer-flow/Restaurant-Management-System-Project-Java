package Restaurant_Management_System_Project;

import java.util.Scanner;

public class Customer extends Person {
    private int customerId;

    Customer() {
        super();
        customerId = 0;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setter() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer id: ");
        customerId = input.nextInt();

        super.setter();
    }

    public void update(){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter new customer id: ");
        customerId = input.nextInt();

        super.update();
    }

    public void display() {
        System.out.println("Customer id: " + customerId);
        super.display();
    }
}

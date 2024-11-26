package Restaurant_Management_System_Project;

import java.util.Scanner;

public abstract class Person implements Displayable {

    private String name;
    private int age;
    private String address;
    private String phoneNo;

    Person() {
        name = null;
        age = 0;
        address = null;
        phoneNo = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public void setter() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name:");
        name = input.nextLine();

        System.out.println("Enter age: ");
        age = input.nextInt();

        System.out.println("Enter address: ");
        address = input.nextLine();

        System.out.println("Enter phone number: ");
        phoneNo = input.nextLine();
    }

    @Override
    public void update() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter new name:");
        name = input.nextLine();

        System.out.println("Enter new age: ");
        age = input.nextInt();

        System.out.println("Enter new address: ");
        address = input.nextLine();

        System.out.println("Enter new phone number: ");
        phoneNo = input.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNo);

    }

}

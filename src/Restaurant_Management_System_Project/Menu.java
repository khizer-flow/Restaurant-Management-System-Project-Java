package Restaurant_Management_System_Project;

import java.util.Scanner;

public class Menu implements Displayable {
    private int itemId;
    private String name;
    private double price;

    Menu() {
        itemId = 0;
        name = null;
        price = 0.0;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setter () {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter item id: ");
        itemId = input.nextInt();

        System.out.println("Enter name: ");
        name = input.nextLine();

        System.out.println("Enter price: ");
        price = input.nextDouble();

    }

    public void update() {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter new item id: ");
        itemId = input.nextInt();

        System.out.println("Enter new name: ");
        name = input.nextLine();

        System.out.println("Enter new price: ");
        price = input.nextDouble();
    }

    public void display() {
        System.out.println("Item id: " + itemId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

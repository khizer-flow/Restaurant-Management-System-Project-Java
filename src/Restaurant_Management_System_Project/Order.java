package Restaurant_Management_System_Project;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList <Integer> quantity;
    private double totalPrice;
    private Customer customer;
    private ArrayList <Menu> menu;

    Order () {
        menu = new ArrayList<>();
        orderId = 0;
        quantity = new ArrayList<>();
        totalPrice = 0.0;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(ArrayList<Integer> quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ArrayList<Menu> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Menu> menu) {
        this.menu = menu;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setter(ArrayList <Customer> availabCustomer, ArrayList <Menu> availabeMenu) {

    }

    public void update (ArrayList <Customer> availaCustomer, ArrayList <Menu> availabMenu) {

    }

    public void display() {
        
    }

    
    


    
    
}

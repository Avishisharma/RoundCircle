package oopsAssignment;

import java.util.List;

class Order {
    private int orderID;
    private User user;
    private List<Product> products;
    private double totalAmount;
    private ShippingInformation shippingInformation;

    public Order(int orderID, User user, List<Product> products, ShippingInformation shippingInformation) {
        this.orderID = orderID;
        this.user = user;
        this.products = products;
        this.shippingInformation = shippingInformation;
        calculateTotalAmount();
    }

   //order id
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    //user
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //which products
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // total amount
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    //information
    public ShippingInformation getShippingInformation() {
        return shippingInformation;
    }

    public void setShippingInformation(ShippingInformation shippingInformation) {
        this.shippingInformation = shippingInformation;
    }

     
    private void calculateTotalAmount() {
        totalAmount = products.stream().mapToDouble(product -> product.calculateTotalPrice(1)).sum();
    }
}

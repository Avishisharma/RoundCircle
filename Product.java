package oopsAssignment;

class Product {
    private String name;
    private String description;
    private double price;
    private int quantity;

    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //total price
    public double calculateTotalPrice(int quantity) {
        return price * quantity;
    }
}
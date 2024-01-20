package oopsAssignment;

import java.util.ArrayList;
import java.util.List;

class OnlineShoppingSystem {
    private List <Product> products;
    private List <User> users;
     private List<Discount> discounts;

    public OnlineShoppingSystem() {
    	
        this.products = new ArrayList <>();
        this.users = new ArrayList< >();
        this.discounts = new ArrayList<>( );
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void applyDiscount(Discount discount) {
        discounts.add(discount);
    }

    public Order processOrder(User user, List<Product> selectedProducts, ShippingInformation shippingInformation) {
        Order order = new Order(1, user, selectedProducts, shippingInformation);
         user.addOrder(order);
        return order;
    }

    public double calculateShippingCost(Order order) {
        // what is the shipping cost 
       // returning a fixed value 20
        return order.getShippingInformation().getShippingCost();
    }
}

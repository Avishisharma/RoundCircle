package oopsAssignment;

import java.util.ArrayList;
import java.util.List;

public class Main {

	  public static void main(String[] args) {
	        OnlineShoppingSystem shoppingSystem = new OnlineShoppingSystem();

	        
	        
	        // Create Multiple products.
	        Product laptop = new Product("Laptop", "High-performance laptop", 100000.0, 10);
	        shoppingSystem.addProduct(laptop);

	        Product SmartPhone = new Product("Smartphone", "High-performance smartphone", 30000.0, 10);
	        shoppingSystem.addProduct(SmartPhone);
	        
	        Product SmartWatch = new Product("SmartWatch", "Water proof SmartWatch", 7000.0, 9);
	        shoppingSystem.addProduct(SmartWatch);
	        
	        
	        
	        // Create multiple users.
	        User user1 = new User("Person1", "password123", "person1@gmail.com");
	        shoppingSystem.registerUser(user1);
	        
	        User user2 = new User("Person2", "password456", "person2@gmail.com");
	        shoppingSystem.registerUser(user2);
	        
	        User user3 = new User("Person3", "password789", "person3@gmail.com");
	        shoppingSystem.registerUser(user3);

	        
	        
	        // Adding products to array list.
	        List<Product> selectedProducts = new ArrayList<>();
	        selectedProducts.add(laptop);
	        


	       // we can add multiple shipping informations. for simplicity just adding one.
	        ShippingInformation shippingInformation1 = new ShippingInformation(20.0, "123 Main Street");

	        // we can create multiple orders. for now creating just one.
	        Order order = shoppingSystem.processOrder(user1, selectedProducts, shippingInformation1);

	        
	        
	        
	        System.out.println("Order ID: " + order.getOrderID());
	        System.out.println("Total Amount: " + order.getTotalAmount());
	        System.out.println("Ordered Products: " + order.getProducts().get(0).getName());
	        System.out.println("Shipping Cost: " + order.getShippingInformation().getShippingCost());

}
}


package oopsAssignment;

import java.util.ArrayList;
import java.util.List;

class User {
    private String username;
    private String password;
    private String email;
    private List<Order> orderHistory;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.orderHistory = new ArrayList<>();
    }

    //User name
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //order history
    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }

    // for adding orders
    public void addOrder(Order order) {
        orderHistory.add(order);
    }
}
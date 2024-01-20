package oopsAssignment;

class ShippingInformation {
    private double shippingCost;
    private String deliveryAddress;

    public ShippingInformation(double shippingCost , String deliveryAddress) {
        this. shippingCost = shippingCost;
        this .deliveryAddress = deliveryAddress;
    }

    //Shipping cost
    public double  getShippingCost() {
        return  shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    // delivery address
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void     setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress  = deliveryAddress;
    }
}
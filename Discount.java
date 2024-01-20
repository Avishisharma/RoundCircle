package oopsAssignment;

class Discount {
    private String type;
    private double value;

    public Discount(String type, double value) {
        this.type = type;
        this.value = value;
    }

    // which discount
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //value
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
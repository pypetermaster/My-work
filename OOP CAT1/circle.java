public class Circle {
    private double radius = 4.0;
    private String color = "yellow";

    // Default constructor
    public Circle() {
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with radius    and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters and setters
    public double getRadius() {
        return    radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString() method
    public String toString()    {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

    // getArea() method
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
public class CircleTest {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);
        Circle circle3 = new Circle(3.0, "blue");

        // Print information about the circles
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        // Calculate and print the area of circle3
        System.out.println("Area of circle3: " + circle3.getArea());
    }
}


public class rectangle {
    private float length;
    private float width;

    public rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getters and setters
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // Calculate the area of the rectangle
    public float getArea() {
        return length * width;
    }

    // Calculate the perimeter of the rectangle
    public float getPerimeter() {
        return 2 * (length + width);
    }
}
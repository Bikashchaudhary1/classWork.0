package Inheritance2;

// Cuboid class, inheriting from Rectangle
public class Cuboid extends Rectangle {
    private double height;

    // Constructor
    public Cuboid(double length, double width, double height) {
        super(length, width);  // Call the constructor of the base class (Rectangle)
        this.height = height;
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return super.calculateArea() * height;
    }
}
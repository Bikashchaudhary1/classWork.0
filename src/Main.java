import Inheritance.Circle;
import Inheritance.Cylinder;

public class Main{
    public static void main(String[] args) {
        double circleRadius = 5.0;
        double cylinderRadius= 3.0;
        double cylinderHeight = 7.0;

        Circle circle = new Circle(circleRadius);

        System.out.println("Circle properties:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println();

        Cylinder cylinder = new Cylinder(circleRadius,  cylinderHeight);

        System.out.println("Cylinder properties:");
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Area: "+ cylinder.calculateArea());
        System.out.println("Volume: "+ cylinder.calculateVolume());
    }
}
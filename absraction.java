package cwh_10;
// Base class: Circle
class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

// Derived class: Cylinder
class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height) {
        super(radius); // Call Circle's constructor
        this.height = height;
    }

    public double volume() {
        return area() * height; // Use Circle's area method
    }
}

// Main class to run the program
public class cwh_10_q1 {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(3.8, 3.9);
        System.out.println("Area of base: " + cyl.area());
        System.out.println("Volume of cylinder: " + cyl.volume());
    }
}

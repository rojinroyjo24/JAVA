package Graphic;
public class Circle {
private double radius;
public Circle(double r) {
radius = r;
}
public double calculateArea() {
return Math.PI * radius * radius;
}
}

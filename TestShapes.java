import Graphic.rectangle;
import Graphic.Triangle;
import Graphic.Square;
import Graphic.Circle;
public class TestShapes {
public static void main(String[] args) {
rectangle rectangle = new rectangle(5, 3);
Triangle triangle = new Triangle(4, 6);
Square square = new Square(4);
Circle circle = new Circle(3);
System.out.println("Area of Rectangle: " + rectangle.calculateArea());
System.out.println("Area of Triangle: " + triangle.calculateArea());
System.out.println("Area of Square: " + square.calculateArea());
System.out.println("Area of Circle: " + circle.calculateArea());
}
}
/*

mlm@mlm-desktop:~/Desktop/Rojin/java$ javac TestShapes.java
mlm@mlm-desktop:~/Desktop/Rojin/java$ java TestShapes
Area of Rectangle: 15.0
Area of Triangle: 12.0
Area of Square: 16.0
Area of Circle: 28.274333882308138

*/

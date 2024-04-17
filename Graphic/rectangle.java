package Graphic;
public class rectangle {
private double length;
private double width;
public rectangle(double len, double wid) {
length = len;
width = wid;
}
public double calculateArea() {
return length * width;
}
}

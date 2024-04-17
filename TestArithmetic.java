// TestArithmetic.java (test class)
import arithmetic.Arithmetic;

public class TestArithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Test addition
        System.out.println("Addition: " + Arithmetic.add(a, b));

        // Test subtraction
        System.out.println("Subtraction: " + Arithmetic.subtract(a, b));

        // Test multiplication
        System.out.println("Multiplication: " + Arithmetic.multiply(a, b));

        // Test division
        try {
            System.out.println("Division: " + Arithmetic.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Division error: " + e.getMessage());
        }
    }
}

/*

mlm@mlm-desktop:~/Downloads$ javac TestArithmetic.java
mlm@mlm-desktop:~/Downloads$ java TestArithmetic
Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2.0

*/

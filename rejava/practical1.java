import java.io.*;

public class QuadraticEquationSolver {

    public static void main(String[] args) {

        int a = 2;
        int b = 6;
        int c = 4;

        double discriminant = Math.sqrt(b * b - 4 * a * c);

        if (discriminant < 0) {
            System.out.println("The quadratic equation has no real roots.");
        } else {
            double root1 = (-b + discriminant) / (2 * a);
            double root2 = (-b - discriminant) / (2 * a);
            System.out.println("The roots of the equation " + a + "x^2 + " + b + "x + " + c + " = 0 are:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
    }
}

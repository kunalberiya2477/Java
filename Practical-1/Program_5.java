import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        int quotient = (b != 0) ? (a / b) : 0;

        int remainder = (b != 0) ? (a % b) : 0;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (b != 0) {
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Cannot perform division and modulo. Division by zero.");
        }

        scanner.close();
    }
}
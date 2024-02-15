import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (n) in the Fibonacci sequence: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci sequence for the first " + n + " terms:");
        printFibonacciSeries(n);

        scanner.close();
    }

    public static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
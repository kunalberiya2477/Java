import java.util.Scanner;

public Program_10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    int originalNumber, remainder, result = 0;
    originalNumber = number;

    while (originalNumber != 0) {
      remainder = originalNumber % 10;
      result += Math.pow(remainder, 3);
      originalNumber /= 10;
    }

    if (result == number) {
      System.out.println("The input is an Armstrong number");
    } else {
      System.out.println("The input is not an Armstrong number");
    }
  }
}
import java.util.Scanner;

public class Program_4 
{
    	public static void main(String[] args) 
	{

        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter an integer: ");
        	int n = scanner.nextInt();

        	int reverse = reverseNumber(n);
        	System.out.println("Reverse of " + n + " is: " + reverse);

        	scanner.close();
    	}
public static int reverseNumber(int number) 
{
        int reversedNumber = 0;

        while (number != 0) 
	{
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}
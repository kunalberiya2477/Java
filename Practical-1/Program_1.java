import java.util.*;
class Program_1
{
	public static void main(String[] args)
	{
		Scanner get = new Scanner(System.in);
		float a=0;
		float b=0;
		float c=0;
		float sum=0;

		System.out.println("addition of num1,num2 & num3");
		System.out.print("Enter any three Number for Addtion :: ");
		a=get.nextFloat();
		b=get.nextFloat();
		c=get.nextFloat();
		sum=a+b+c;
		System.out.println("a+b+c::::::::::"+(sum));



		System.out.println("average of number");
		System.out.println(""+(sum/3));
		
	}
}
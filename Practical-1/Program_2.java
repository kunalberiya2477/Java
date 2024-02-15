import java.util.*;
class Circle_area
{
	public static void main(String [] args)
	{
		Scanner get = new Scanner(System.in);

		float radius;

		System.out.print("Enter radius of circle::");
		radius=get.nextFloat();

		System.out.println("area of circle::"+(3.14 * radius * radius));
	}
} 
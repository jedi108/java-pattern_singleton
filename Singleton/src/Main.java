import java.util.*;

public class Main
{
	private static Singleton singleton;
	
	public static void main(String[] args)
	{
		//singleton=new Singleton();
		System.out.println(singleton.getInstance().toString());
		System.out.println("Hello World!");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();

		System.out.print("Enter second number: ");
		double number2 = input.nextDouble();

		double product = number1 * number2;
		System.out.printf("The product of both numbers is: %f", product);
	}
}

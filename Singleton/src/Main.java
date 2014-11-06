import java.util.*;

public class Main
{
	private static Singleton singleton;
	
	public static void main(String[] args)
	{
		//singleton=new Singleton();
		System.out.println(singleton.getInstance().toString());
	}
}

public class Singleton
{
	private static Singleton instance;
	
	private Singleton() {
	}
	
	public static synchronized Singleton getInstance(){
		if (instance==null) {
			instance = new Singleton();
		}
		System.out.println("Hello World!");

	
		System.out.printf("The product of both numbers ");
		
		return instance;
	}
}

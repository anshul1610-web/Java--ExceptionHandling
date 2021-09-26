
public class DefaultExceptionHandling {

	public static void main(String[] args) 
	{
		method1();
		System.out.println(10/0);

	}
	
	public static void method1() 
	{
		method2();
		System.out.println("Method 1 Executed");
	}
	
	public static void method2()
	{
		System.out.println("Method 2 Executed");
	}


}


public class ExceptionUSingTryCatch {

	public static void main(String[] args) 
	{
		method1();
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(10/2);
			System.out.println(e);;
		}
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

import java.util.Scanner;

public class xceptionWithNesting
{

	public static void main(String[] args) 
	{
		try 
		{	
			int[] Array = new int []{1,2,3,4};
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Num1 For Array");
			int num1 = sc.nextInt();
			System.out.println(Array[num1]);
			
		         try 
		         {
			      String str = "We are sparten";
			      System.out.println("Enter Num2 for String");
			      int num2 = sc.nextInt();
		          System.out.println(str.charAt(num2));
		         }
		         catch(java.lang.StringIndexOutOfBoundsException e2)
		         {
		        	 System.out.println(e2);
		         }				
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
		   System.out.println(e1);	
		}
		

	}

}

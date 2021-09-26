import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionUsingMultipleCatch {

	public static void main(String[] args)
	{
	
		try 
		{
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(88%num==0) 
			{
				System.out.println("Num is a Factor :"+88);
			}
			else
			{
				System.out.println("Num is a not Factor of :"+88);
			}
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1);
		}
		catch(InputMismatchException e2) 
		{
			System.out.println(e2);
		}

	}

}

/////////Creating Custom Class For Exception Message


public class UnderAgeException extends Exception
{
      UnderAgeException(String Message)
      {
    	  super(Message);
      }
}

///////Creating Main as Marriage Class Class To Get age ////////////////////


import java.util.Scanner;

public class MarriageClass {

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   int age = sc.nextInt();
	  try 
	  {	  	 
	       if(age >= 18 && age <= 30) 
	        {
		       System.out.println("Best Time To Get Marry");
	        }
	       else if(age > 30)
	        {
		       throw new UnderAgeException("OHH Man You Are to Late To Get Marry");
	        }
	       else if(age < 18) 
	        {
		       throw new UnderAgeException("OHH Man you are to Early To get Marry");
	        }
	  }
	  catch(UnderAgeException e)
	  {
		  System.out.println(e);
	  }
	  
	}

}

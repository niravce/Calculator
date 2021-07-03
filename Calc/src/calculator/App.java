package calculator;
import java.util.Scanner;
import java.lang.*;

public class App {


	public static Scanner sc;
	static String yn;
	
	public static void main(String[] args) 
	{
		int choice;
		sc=new Scanner(System.in);
		
		
		System.out.println("Select Calculator");
		System.out.println("1.Simple Calulator");
		System.out.println("2.Scientific Calculaotr");   
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		System.out.println("--------Simple Calculaor------- ");
		do
		{
		
		System.out.println("Enter Your Choice");
		System.out.println("1. Addition");
		System.out.println("2.Substration");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Find Minimum Value");
		System.out.println("6.Find Maximum Value");
		 
		//System.out.println("5.Exit");
		int ch=sc.nextInt();

		switch(ch)
		{
		case 1:	
			addition();
			break;

		case 2:	
			substraction();
			break;

		case 3:	
			multiplication();
			break;

		case 4:
			division();
			break;

		case 5:
			minimum();
			break;
			
		case 6:
			maximum();
			break;
		default:
			System.out.println("You Enter Wrong Choice");
			break;
		
		}
		System.out.println(" You want continue press Y/y else close");
		 yn=sc.next();
		 System.out.println("\n");
		 		 
		}while(yn.equals ("Y")|| yn.equals("y"));	
		System.out.println(" Calculator Close");
	  break;
	 case 2:
		do
			{
			
			System.out.println("Enter Your Choice");
			System.out.println("1. Squar Root");
			System.out.println("2. cube root");
			System.out.println("3.log");
			System.out.println("4.Power");
			
			//System.out.println("5.Exit");
			int ch=sc.nextInt();

			switch(ch)
			{
			case 1:	
				sr();
				break;

			case 2:	
				cubert();
				break;

			case 3:	
				log();
				break;
				
			case 4:	
				power();
				break;

					default:
				System.out.println("You Enter Wrong Choice");
				break;
			
			}
			System.out.println(" You want continue press Y/y else close");
			 yn=sc.next();
			 System.out.println("\n");
			 		 
			}while(yn.equals ("Y")|| yn.equals("y"));	
			System.out.println(" Calculator Close");
		  break;
		 
		
	 default:
		 System.out.println("Thank You For Using Calculator");
		 break;
    }
}
	
	public static void addition()
	{
      float a,b,c;
      System.out.println("Enetr The First Value: ");
      a=sc.nextFloat();
	  	
      System.out.println("Enetr The Second Value: ");
      b=sc.nextFloat();
      c=a+b;
      System.out.println("Your Result is: "+c);
	}


	public static void substraction()
	{

		float a,b,c;
	      System.out.println("Enetr The First Value: ");
	      a=sc.nextFloat();
		  	
	      System.out.println("Enetr The Second Value: ");
	      b=sc.nextFloat();

	      c=a-b;
	      System.out.println("Your Result is: "+c);
		
	}
	
	public static void multiplication()
	{

		float a,b,c;
	      System.out.println("Enetr The First Value: ");
	      a=sc.nextFloat();
		  	
	      System.out.println("Enetr The Second Value: ");
	      b=sc.nextFloat();

	     
	      c=a*b;
	      System.out.println("Your Result is: "+c);
	}

	public static void division()
	{

		float a,b,c;
	      System.out.println("Enetr The First Value: ");
	      a=sc.nextFloat();
		  	
	      System.out.println("Enetr The Second Value: ");
	      b=sc.nextFloat();
	      if(b==0) 
	      {
	    	 System.out.println("Can not Divided By Any Value By 0 its Error"); 
	      }
	      else
	      {
	      c=a/b;
	      System.out.println("Your Result is: "+c);
	      }
	}
	
	public static void minimum()
	{

		float a,b,c;
	      System.out.println("Enetr The First Value: ");
	      a=sc.nextFloat();
		  	
	      System.out.println("Enetr The Second Value: ");
	      b=sc.nextFloat();
          
	      c=Math.min(a, b);
	      
	      System.out.println("Minimum Value Between " +a+" And "+b+ " is:  " +c);
	}
	public static void maximum()
	{

		float a,b,c;
	      System.out.println("Enetr The First Value: ");
	      a=sc.nextFloat();
		  	
	      System.out.println("Enetr The Second Value: ");
	      b=sc.nextFloat();
          
	      c=Math.max(a, b);
	      
	      System.out.println("Maximum Value Between " +a+" And "+b+ " is:  " +c);
	}

	public static void log()
	{

		float a;
		double c;
	      System.out.println("Enetr The  Value: ");
	      a=sc.nextFloat();       
	      c=Math.log(a);
	      
	      System.out.println("Log Value of " +a+" is:  " +c);
	}
	public static void sr()
	{

		float a;
		double c;
	      System.out.println("Enetr The  Value: ");
	      a=sc.nextFloat(); 
	      if(a<0)
	      {
	    	  System.out.println("Result is not valid for Negative Number");
	      }
	      else
	      {
	      c=Math.sqrt(a);
	      
	      System.out.println("square Value of " +a+" is:  " +c);
	      }
	}
	      

	public static void cubert()
	{

		float a;
		double c;
	      System.out.println("Enetr The  Value: ");
	      a=sc.nextFloat();       
	      c=Math.cbrt(a);
	      
	      System.out.println("cube root of " +a+" is:  " +c);
	}
	
	public static void power()
	{

		float a,b;
		double c;
	      System.out.println("Enetr The first Value: ");
	      a=sc.nextFloat();     
	      System.out.println("Enetr The second Value: ");
	      b=sc.nextFloat();     
	      c=Math.pow(a,b);
	      
	      System.out.println("cube root of " +a+" is:  " +c);
	}
	
}


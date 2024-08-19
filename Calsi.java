import java.util.Scanner;
class Calsi
{
	static Scanner sc = new Scanner(System.in);
	public static void homePage() throws Exception
	{
		boolean flag=true;
		do{
		
		System.out.println("\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Divition \n5.Exit");
		System.out.print("Choose any choice:");   
		int choice = sc.nextInt();
		System.out.println("~~~~~~~processing~~~~~~~");
		Thread.sleep(2000);
		
		switch (choice)
		{
		case 1:
		{
			System.out.println("You selected Addition Calculation"); 
			System.out.print("Enter a:");
			int a = sc.nextInt();
			System.out.print("Enter b:");
			int b = sc.nextInt();
			System.out.println("The addition of two numbers:"+add(a,b));
	   	}
		break;
		case 2:
		{
			System.out.println("You selected subraction Calculation"); 
			System.out.print("Enter a:");
			int a = sc.nextInt();
			System.out.print("Enter b:");
			int b = sc.nextInt();
			System.out.println("The subtraction of two numbers:"+sub(a,b));
		}
		break;
		case 3:
		{
			System.out.println("You selected multiplication Calculation"); 
			System.out.print("Enter a:");
			int a = sc.nextInt();
			System.out.print("Enter b:");
			int b = sc.nextInt();
			System.out.println("The multiplication of two numbers:"+mul(a,b));
		}
		break;
		case 4:
		{
			System.out.println("You selected division Calculation"); 
			System.out.print("Enter a:");
			int a = sc.nextInt();
			System.out.print("Enter b:");
			int b = sc.nextInt();
			System.out.println("The division of two numbers:"+div(a,b));
		}
		break;
		case 5:
		{
			 flag = false; 
		}
		break;
	
	   }
	}while (flag);
		
		    System.out.println("Thankyou for using our application");
		    System.out.println(" TATA . BYE... BYE...");
		
	}
	public static int add(int a , int b ) 
	{  
	    return a+b;
	}                             
	public static int sub(int a , int b ) 
	{
        return a-b;
	}
	public static int mul(int a , int b ) 
	{
	    return a*b;
	}
	public static int div(int a , int b ) 
	{
		return a/b;
	}
		
}

//num prime pallindrom 
//pattern star letter
//swiggy appli

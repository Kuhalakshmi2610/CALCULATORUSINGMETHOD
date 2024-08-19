import java.util.Scanner;
class UI 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		boolean flag = true;
    do{  
		
		System.out.println("\t\t\t\tHello ..~~~Welcome to Calculation Application~~~");
		System.out.println("\t\t\t\t-----------------------------------------------");
		System.out.println("\n1.SignUp \n2.Login \n3.Exit");
		System.out.print("Please enter your choice :");
		int input = sc.nextInt();		
		
		switch (input)
		{
		case 1 :
		{
		   	   LoginPage.SignUp();
		}
		break;
		case 2 :
		{
			   LoginPage.login();
		}
		break;
		case 3 :
		{
			   flag=false;
		}
		break;
		}
	}while (flag);
		
			
		}
	}
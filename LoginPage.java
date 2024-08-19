import java.util.Scanner;
class LoginPage
 {
	static int User_id,User_pwd;
	static long contact;
	static boolean signup_done = false;
	static Scanner sc = new Scanner(System.in);
	
	public static void SignUp() throws Exception
	{
                 
		System.out.println("Please SignUp the calculator Application");
		Thread.sleep(3000);
		System.out.print("Create the User Id :");
		User_id = sc.nextInt();
		
		System.out.print("Create the strong  Password");
		User_pwd = sc.nextInt();
		
		System.out.print("Enter your contact:");
		contact = sc.nextLong();
		
		signup_done = true;
		Thread.sleep(3000);
		System.out.println("signUp completed.....");
	
}

public static void login() throws Exception
	{
	   if (signup_done)
	   {
		   System.out.print("Enter your User id : ");
		   int log_User_id = sc.nextInt();
		   
		   System.out.print("Enter your password:");
		   int log_User_pwd = sc.nextInt();
		   
		   if (log_User_id ==  User_id && log_User_pwd == User_pwd)
		      {
			       Calsi.homePage();
		      }
	       else
		   {
			    System.out.println("Login Failed");
		   }
	   }
	   else
		   {
		      System.out.println("Go to signup page");
			  LoginPage.SignUp();
		   }
			   
			   
		}
	}
 
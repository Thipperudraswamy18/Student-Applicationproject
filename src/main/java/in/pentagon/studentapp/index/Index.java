package in.pentagon.studentapp.index;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int choice = 0;
System.out.println("Welcome to MyStudent Application");
do {
	System.out.println("1.Signup");
	System.out.println("2.Login");
	System.out.println("3.Forget Password");
	System.out.println("4.Exit");
	choice = sc.nextInt();
	switch(choice) {
	case 1:Signup.signup();
	break;
	case 2: Login.login();
		break;
	case 3:PasswordJava.forget();
		break;
	case 4:System.out.println("Application Closed..!");
		break;
	default:System.out.println("invalid choice! Please enter a valid choice");
	}
   }while(choice!=4);

	}

}

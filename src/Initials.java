/*Write a program that declares variables to hold your three initials. Display the
three initials with a period following each one, as in J.M.F. Save the program as
Initials.java.*/
import java.util.Scanner;
public class Initials 
{
	public static void main (String [] args)
	{
		String name;
		String surname;
		String secondName;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter first letter of your name>> ");
		name = input.next();
		System.out.print("Enter first letter of your second name >> ");
		secondName = input.next();
		System.out.print("Enter first letter of your surname >> ");
		surname = input.next();
		
		System.out.println("Your initials are " +name+ "." +secondName+ "." +surname+ ".");
		
		
		
	}

}

//Scanner Class Introductiom
// uses the Scanner to recieve user input and print it

import java.util.Scanner;

public class ScannerStarter
{
   public static void main(String[] args)
   {
        
      //Write the code here.
	Scanner kb = new Scanner(System.in);
	System.out.print("What is your name? ");
	String name = kb.nextLine();

	System.out.print("How old are you? ");
	int age = kb.nextInt();

	System.out.print("How much do you get paid hourly? ");
	double wage = kb.nextDouble();

	System.out.println("Your name is:  " + name);  
	System.out.println("Age: " + age + " Wage: $" + wage);
    
	kb.close();
   }
}

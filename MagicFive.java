//Name: Ianina Kotova
//Date: Sep 7 2024
//Description: The program takes in user iput and takes it through a series of operations which 
                // will result in the number 5 regardess of the first input.

import java.util.Scanner;

public class MagicFive 
{
	public static void main(String[] args)
	{
	  
		// code to get input for the user is provided here. 
		// use of the Scanner class will be explained on Day 7

		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int original = kb.nextInt();
		int answer = original;
		
		System.out.println("Adding the next highest number.");
		answer += original + 1;
		System.out.println(answer);

		System.out.println("Adding 9 to the number.");
		answer += 9;
		System.out.println(answer);

		System.out.println("Dividing the number by 2.");
		answer /= 2;
		System.out.println(answer);

		System.out.println("Subtracting the original number.");
		answer -= original;
		System.out.println(answer);
    	// add your code here
	  
	 
	 
	  
	  
	  
	  
	}
}

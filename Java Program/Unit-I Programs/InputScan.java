// Java Program to show how to take
// input from user using Scanner Class

import java.util.*;

class InputScan {

	public static void main(String[] args)
	{
		// Scanner definition
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter String str1");

		// input is a string ( one word )
		// read by next() function
		String str1 = scn.next();

		// print String
		System.out.println("Entered String str1 : " + str1);
// 		System.out.println("Enter String str2");

// 		// input is a String ( complete Sentence )
// 		// read by nextLine()function
// 		String str2 = scn.nextLine();

// 		// print string
// 		System.out.println("Entered String str2 : " + str2);
		System.out.println("Enter  Integer value");

		// input is an Integer
		// read by nextInt() function
		int x = scn.nextInt();

		// print integer
		System.out.println("Entered Integer : " + x);
		System.out.println("Enter float value");

		// input is a floatingValue
		// read by nextFloat() function
		float f = scn.nextFloat();

		// print floating value
		System.out.println("Entered FloatValue : " + f);
	}
}



// Java Program for taking user
// input using BufferedReader Class
import java.io.*;

class InputIntStr {

	// Main Method
	public static void main(String[] args)
		throws IOException
	{
		// Creating BufferedReader Object
		// InputStreamReader converts bytes to
		// stream of character
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			
		System.out.println("Enter String");	

		// String reading internally
		String str = br.readLine();
		
		System.out.println("Enter Integer");

	
		int it = Integer.parseInt(br.readLine());
		
		System.out.println("Enter float");

		// float reading internally
		float ft = Float.parseFloat(br.readLine());

		// Printing String
		System.out.println("Entered String : " + str);

		// Printing Integer
		System.out.println("Entered Integer : " + it);
		
		// Printing Integer
		System.out.println("Entered Float : " + ft);
	}
}



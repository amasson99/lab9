// Lab 9 - View (Console) class

import java.util.*;

public class View {
	private Scanner s;

// Constructor
	public View() {
		s = new Scanner(System.in);
	} // end Constructor


	public String getMessage() {
		//YOU DO THIS
		//Ask the user to enter the message
		//return what they type
		System.out.print("Enter Message: ");
		String str = s.nextLine();
		str = s.nextLine();

		return str;
	} // end getMessage()

	public int getKey() {
		//YOU DO THIS
		//Ask the user to enter the key
		//return what they type
		int key = -2;

		do{
			System.out.print("Enter a number from 0 to 25: ");
				try{
					key=s.nextInt();
				} catch (java.util.InputMismatchException e) {
					System.out.println("Error: Input not an integer.");
		      key = Integer.MIN_VALUE;
		      s.next();
				}
		} while (key < -1);
		//Use a try/catch with a loop to keep
		//asking until they enter an integer
		//remove the line below when you're done
		return key;
	} // end getKey()

	public void displayResult(String d, String e) {
		//YOU DO THIS
		//display msg to the console
		System.out.println("Encrypted: " + e);
		System.out.println("Decrypted: " + d);
	} // end displayResult

} // end class

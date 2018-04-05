// Lab 9 - View (Console) class

//import java.util.*;
import javax.swing.JOptionPane;

public class View_GUI {
	//private Scanner s;
/*
// Constructor
	public View() {
		s = new Scanner(System.in);
	} // end Constructor
*/

	public String getMessage() {
		//YOU DO THIS
		//Ask the user to enter the message
		//return what they type
		String str = JOptionPane.showInputDialog("Enter Message: ");
		//String str = s.nextLine();
		//str = s.nextLine();

		return str;
	} // end getMessage()

	public int getKey() {
		//YOU DO THIS
		//Ask the user to enter the key
		//return what they type
		int key = -2;

		do{
				try{
					//key=s.nextInt();
					key = Integer.parseInt(JOptionPane.showInputDialog("Enter a number from 0 to 25: "));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Input not an integer.");
		      key = -2;
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
		JOptionPane.showMessageDialog(null,"Encrypted: " + e);
		JOptionPane.showMessageDialog(null,"Decrypted: " + d);
	} // end displayResult

} // end class

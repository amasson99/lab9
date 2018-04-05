// Lab 9 - Model class

public class Cipher {
	private int key;

// Constructor	
	public Cipher(int k) {
		key = k;
	} // end Constructor

	public String encrypt(String message) {
		//YOU DO THIS
		//For each character in message
			//find the character that is key values after it
			//in the alphabet.  (If the character is 'a' and
			//key is 4, you should find 'e'.)

			//use ASCII values to find the replacement

		//build a string of the replacement characters,
		//and return it


		//remove the line below when you're done
		return "";
	} // end encrypt()

	public String decrypt(String message) {
		//YOU DO THIS
		//For each character in message
			//find the character that is key values before it
			//in the alphabet.  (If the character is 'e' and
			//key is 4, you should find 'a'.)

			//use ASCII values to find the replacement

		//build a string of the replacement characters,
		//and return it


		//remove the line below when you're done
		return "";
	} // end decrypt()
	
} // end class
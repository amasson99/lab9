public class Lab9{
  public static void main(String [] args){
    View v = new View();
    int key = v.getKey();
    Cipher c = new Cipher(key);
    String msg = v.getMessage();
    String e = c.encrypt(msg);
		String d = c.decrypt(e);
    v.displayResult(d, e);
  }
}//end main

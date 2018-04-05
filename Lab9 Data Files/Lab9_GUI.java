public class Lab9_GUI{
  public static void main(String [] args){
    View_GUI v = new View_GUI();
    int key = v.getKey();
    Cipher c = new Cipher(key);
    String msg = v.getMessage();
    String e = c.encrypt(msg);
		String d = c.decrypt(e);
    v.displayResult(d, e);
  }
}//end main

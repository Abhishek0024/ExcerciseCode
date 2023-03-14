package Exercise2;

public class ReverseString {

	public static void main(String[] args) {
		
		//String "Hello Java !!"
		String str = "Hello Java !!";
		System.out.println("String: "+str);
		
		//Create Stringbuffer and pass String str
		StringBuffer sb = new StringBuffer(str);
		
		//Reverse Hello Java !! -> !! avaJ olleH
		sb.reverse();
		
		//Printing String
		System.out.println("Reversed String: "+sb.toString());	
	}
}

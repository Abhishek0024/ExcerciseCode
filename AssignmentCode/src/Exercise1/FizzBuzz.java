package Exercise1;

public class FizzBuzz {

	public static void main(String[] args) {
		
		//For loop to print number 1 - 100
		for(int i=1;i<=100;i++)
		{
			//If the number is a multiple of both 3 and 5, print FizzBuzz
			if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			
			//If number is multiple 5, print "Buzz"
			else if(i%5==0)
				System.out.println("Buzz");
			
			//If number is multiple of 3, print "Fizz"
			else if(i%3==0)
				System.out.println("Fizz");
			
			// Print rest of the numbers
			else
				System.out.println(i);
		}
	}
}
package Exercise3;
import java.util.Scanner;

public class ArrMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements in Array: ");
		int n = sc.nextInt();
		
		//Initialize array
		int[] arr = new int[n];
		
		System.out.println("Enter elements: ");
		
		//For loop to take value from user
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max = arr[0];
		
		//Compare all values using for loop
		for(int j=0;j<arr.length;j++)
		{
			//Compare and store maximum value in max
			if(max<arr[j])
				max=arr[j];
		}
		//Printing maximum value element
		System.out.println("\nMaximum Value Element: "+max);
		
		sc.close();
	}
}
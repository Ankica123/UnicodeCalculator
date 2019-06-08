import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Calculate();
	}
	
	public static void Calculate()
	{
		String str1;
		String str2;
		char temp;
		int sum1 = 0;
		int sum2 = 0;
		int sum = 0;
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.println ("Enter your first string: ");
		
		str1 = user_input.next();
		
		System.out.println ("Enter your second string: ");
		
		str2 = user_input.next();
		
		
		for (int n = 0; n < str1.length(); n++)
		{
			temp = str1.charAt(n);
			int numVal = (int) temp;
			sum1 = sum1 + numVal;
			
			System.out.println (temp + ": " + numVal );
		
		}
		
		for (int y = 0; y < str2.length(); y++)
		{
			temp = str2.charAt(y);
			int numVal = (int) temp;
			sum2 = sum2 + numVal;
			
			System.out.println (temp + ": " + numVal );
		
		}
		
		sum = Math.abs(sum1-sum2);
		System.out.println ("Difference (as absolute value):" + sum);
	}
}
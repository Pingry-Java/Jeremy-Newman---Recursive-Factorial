import java.util.Scanner;

public class recursiveFactorial
{
	public static void main (String [] args)
	{
		Scanner keys = new Scanner(System.in);
		
		String input;
		int number;
		
		System.out.println("What number would you like to use factorial on? ");
		
		input = keys.nextLine();
		number = Integer.parseInt(input);
		
		int numberFactorial = factorial(number);
		System.out.println(numberFactorial);
	}
	
	/**
	* This method takes a number and uses the factorial operator on it
	* @param number The number that is used in the factorial operation
	* @return Returns the number after factorial has been done
	*/
	
	public static int factorial(int number)
	{
		if (number == 0)
			return 1;
		else
			return number * factorial(number - 1);
	}
}
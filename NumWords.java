// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int number = Integer.parseInt(args[0]);
		int ones = number%10;
		int tens = number%100;
			tens = (tens-ones)/10;
		int hundreds = number/100;
		

		
		System.out.println("hundreds:" + hundreds + "  tens:" + tens + "  ones:" + ones );
	}
}

// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int saving = Integer.parseInt(args[0]);
		double interest = Double.parseDouble(args[1]);
		double years = Double.parseDouble(args[2]);
		interest = 1+(interest/100);
		double a = Math.pow(interest,years);
		double futureValue = saving*a;
		System.out.println("your corrent saving is " + (int) futureValue);
		// Replace this comment with your code
	}
}
// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int saving = Integer.parseInt(args[0]);
		double interest = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double newInterest = 1+(interest/100);
		double a = Math.pow(newInterest,years);
		double futureValue = saving*a;
		System.out.println("After " + years + " years, a $" + saving + " saved at " + interest + "% will yield $" + (int) futureValue);
		// Replace this comment with your code
	}
}
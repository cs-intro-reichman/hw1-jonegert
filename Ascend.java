// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int a = (int) (Math.random()*number)+1;
		int b = (int) (Math.random()*number)+1;
		int c = (int) (Math.random()*number)+1;
		
		System.out.println(a + " " + b + " " + c);
		
		int d = (int)(Math.min(a,b));
		int e = (int)(Math.min(a,c));
			int min = (int)(Math.min(d,e));
		int f = (int)(Math.max(a,b));
		int g = (int)(Math.max(a,c));
			int max = (int)(Math.max(f,g));
			int mid = (a+b+c)-(min+max);
		
			System.out.println(min + " " + mid + " " + max);
		



		// Replace this comment with your code
	}
}

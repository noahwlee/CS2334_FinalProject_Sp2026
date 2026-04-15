import java.util.*;
import java.math.*;
public class Factorial {
	
	public static BigInteger factorialIterative(int n) {
	    BigInteger result = BigInteger.ONE;
	    for (int i = 2; i <= n; i++) {
	        result = result.multiply(BigInteger.valueOf(i));
	    }
	    return result;
	}
	
	public static BigInteger factorialRecursive(int n) {
	    if (n <= 1) return BigInteger.ONE;
	    return BigInteger.valueOf(n).multiply(factorialRecursive(n - 1));
	}
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Input number for Factorial: ");
		int input = scr.nextInt();
		
		System.out.print("Choose Recursive or Interative: ");
		String choice = scr.next();
		
		if (choice.equalsIgnoreCase("Recursive")) {
			System.out.println("Result: " + factorialRecursive(input));
		}
		else if (choice.equalsIgnoreCase("Iterative")) {
			System.out.println("Result: " + factorialIterative(input));
		}
	}
}

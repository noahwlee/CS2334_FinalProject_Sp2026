import java.util.*;
import java.math.*;
public class FastExponent {

	public static BigInteger powerIterative(int base, int exponent) {
	    BigInteger result = BigInteger.ONE;
	    BigInteger bigBase = BigInteger.valueOf(base);

	    for (int i = 0; i < exponent; i++) {
	        result = result.multiply(bigBase);
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		 System.out.print("Enter Base: ");
		 int base = scr.nextInt();
		 System.out.print("Enter Exponent: ");
		 int exponent = scr.nextInt();
		 
		 System.out.println("Result: " + powerIterative(base, exponent));
	}
}
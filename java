import java.util.Scanner;
public class E16_BinaryToDecimalConv {

		static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		//User input & variable declaration.
		System.out.print("Enter any Binary number: ");
        int num1 = sc.nextInt();
		int num2 = num1;
		int mod = 0;
		int b = 0;
		
		// The conversion mechanism.
        while(num1 != 0) {
        	
        	/* mod += means: mod = mod + ((num1 % 10) * Math.pow(2,b));
        	 * The Math.pow() function returns the base to the exponent power, we are using base 2 and keep increasing the exponent (b)
        	 * after each mod iteration, the binary number gets divided by 10 and the exponent increases by 1
        	 */
        	
        	mod += ((num1 % 10) * Math.pow(2,b));
        	num1 = num1 / 10;
        	b++;
        }
        //Print out result
        System.out.println("The Binary number: "+num2+" is equivelent to the Decimal number: "+mod+".");
	}

}

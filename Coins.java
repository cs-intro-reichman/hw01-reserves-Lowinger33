/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// gets a number of cents and prints how to represent this quantity using as
		// many quarters as possible plus
		// the remainder in cents.
		int a = Integer.parseInt(args[0]);
		int quarters = a / 25;
		int cents = a % 25;
		System.out.println("Use " + quarters + " quarters " + "and " + cents + " cents");
	}
}
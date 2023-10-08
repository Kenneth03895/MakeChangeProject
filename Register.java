import java.util.Scanner;
public class Register {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Double moneyGiven, itemPrice;
		
		System.out.println("What is the price of the item? ");
			itemPrice = input.nextDouble();

		System.out.println("How much money was given by the customer?");
			moneyGiven = input.nextDouble();
		input.close();

		double change = moneyGiven - itemPrice;
		
		int twentys = 0;
		int tens = 0;
		int fives = 0;
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		
		if (moneyGiven < itemPrice) {
			System.out.println("Sorry, not enough money was given for this item. ");
		} 
		if (change == 0) {
			System.out.println("Exact amount was given for this item. No change Required. ");
		}

		if (change / 20 > 0) {
			twentys = (int) change / 20;
			change = change % 20;
			System.out.println("Twentys " + twentys);
		}
		if (change / 10 > 0) {
			tens = (int) change / 10;
			change = change % 10;
			System.out.println("Tens " + tens);
		}
		if (change / 5 > 0) {
			fives = (int) change / 5;
			change = change % 5;
			System.out.println("Fives " + fives);
		}
		if (change / 1 > 0) {
			dollars = (int) change / 1;
			change = change % 1;
			System.out.println("Dollars " + dollars);
		}
		if (change / 0.25 > 0) {
			quarters = (int) (change / 0.25);
			change = change % 0.25;
			System.out.println("Quarters " + quarters);
		}
		if (change / 0.10 > 0) {
			dimes = (int) (change / 0.10);
			change = change % 0.10;
			System.out.println("Dimes " + dimes);
		}
		if (change / 0.05 > 0) {
			nickels = (int) (change / 0.05);
			change = change % 0.05;
			System.out.println("Nickels " + nickels);
		}
		if (change / 0.01 > 0) {
			pennies = (int) (change / 0.01);
			change = change % 0.01;
			System.out.println("Pennies " + pennies);

		}
	}
}
	
























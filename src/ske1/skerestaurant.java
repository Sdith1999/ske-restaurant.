package ske1;

import java.util.Scanner;

public class skerestaurant {
	public static Scanner s = new Scanner(System.in);
	public static int answer;
	public static String[] menuItems = {"pizza", "chickens", "coke",};
	public static int pizza = 0, chickens = 0, coke = 0;
	public static int piece;
	public static int[] price = new int[3];

	public static void getPizza() {
		System.out.print("Enter Quantity : ");
		piece = s.nextInt();
		pizza = pizza + piece;
	}

	public static void getChickens() {
		System.out.print("Enter Quantity : ");
		piece = s.nextInt();
		chickens = chickens + piece;
	}

	public static void getCoke() {
		System.out.print("Enter Quantity : ");
		piece = s.nextInt();
		coke = coke + piece;
	}

	public static int setPricePizza() {
		price[0] = pizza * 250;
		return price[0];
	}

	public static int setPriceChickens() {
		price[1] = chickens * 120;
		return price[1];
	}

	public static int setPriceCoke() {
		price[2] = coke * 45;
		return price[2];
	}

	public static void main(String[] args) {

		System.out.println("---------- Welcome to SKE Restaurant ----------");
		System.out.printf("1.) %-20.20s250\tBaht.",menuItems[0]);
		System.out.println();
		System.out.printf("2.) %-20.20s120\tBaht.",menuItems[1]);
		System.out.println();
		System.out.printf("3.) %-20.20s45\tBaht.",menuItems[2]);
		System.out.println();
		System.out.println("4.) Total");
		System.out.println("5.) Exit");
		do {
			System.out.print("\nEnter your Choices : ");
			answer = s.nextInt();
			piece = 0;
			if (answer == 1) {
				getPizza();
			} else if (answer == 2) {
				getChickens();
			} else if (answer == 3) {
				getCoke();
			} else if (answer == 4) {
				System.out.println("+-------Menu-------+--Qty--+--Price--+");
				if (pizza > 0) {
					System.out.printf("| %-20.20s |%5d |%8d |\n",menuItems[0] ,pizza, setPricePizza());
				}
				if (chickens > 0) {
					System.out.printf("| %-20.20s |%5d |%8d |\n", menuItems[1],chickens, setPriceChickens());
				}
				if (coke > 0) {
					System.out.printf("| %-20.20s |%5d |%8d |\n",  menuItems[2],coke, setPriceCoke());
				}
				System.out.println("+------------------------------------+");
				System.out.printf("| Total\t\t\t |%8d |\n", setPricePizza() + setPriceChickens() + setPriceCoke());
				System.out.println("+------------------------------------+");
			}
		} while (answer != 5);
		System.out.print("======Thank you ======="); 
	}
}

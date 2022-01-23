package Assignment_2_AP;

import java.util.Scanner;

public class authentic_restaurant extends restaurant {

	private static String s1 = "Shah";
	private static String s2 = "The chinese";
	private static int n;


	public authentic_restaurant(int n) {
		this.n = n;
	}

	public static void input2() {
		//System.out.println(n);
		//while(n!=5) {
		if(n==1) {
			System.out.println("Welcome "+ s1+":");

			System.out.println("1) Add item");
			System.out.println("2) Edit item");
			System.out.println("3) Print rewards");
			System.out.println("4) Discount on bill value");
			System.out.println("5) Exit");

			Scanner sc = new Scanner(System.in);
			int nnn = sc.nextInt();

			//n = nnn;


			if(nnn==5) {
				Zotato.inputMain();
			}
			else if(nnn==1) {
				food f = new food();
				f.addItem(sc,s1);
			}
			else if(nnn==3) {
				food f = new food();
				f.printRewards();
			}
			else if(nnn==4) {
				food f = new food();
				f.discountOnBill();
			}
			
			else if(nnn==2) {
				food.editItem(sc);
			}

		}

		if(n==3) {

			System.out.println("Welcome "+ s2+":");
			System.out.println("1) Add item");
			System.out.println("2) Edit item");
			System.out.println("3) Print rewards");
			System.out.println("4) Discount on bill value");
			System.out.println("5) Exit");

			Scanner sc = new Scanner(System.in);
			int nnn = sc.nextInt();

			//n = nnn;


			if(nnn==5) {
				Zotato.inputMain();
			}
			else if(nnn==1) {
				food f = new food();
				f.addItem(sc,s1);
			}
			else if(nnn==3) {
				food f = new food();
				f.printRewards();
			}
			else if(nnn==4) {
				food f = new food();
				f.discountOnBill();
			}

		}

		//}
	}




}

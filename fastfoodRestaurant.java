package Assignment_2_AP;

import java.util.Scanner;

public class fastfoodRestaurant extends restaurant{

	private static String s3 = "Wang's";
	int reward_scheme;

	public static void inputff() {

		System.out.println("Welcome "+ s3+":");

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
			f.addItemFF(sc,f);
		}
		else if(nnn==3) {
			food f = new food();
			f.printRewardsFF();
		}
		else if(nnn==4) {
			food f = new food();
			f.discountOnBillFF();
		}


	}



	//	@Override
	//public void discountOnBillValue() {
	// TODO Auto-generated method stub

	//	}

}

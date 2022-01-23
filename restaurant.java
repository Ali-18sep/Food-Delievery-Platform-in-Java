package Assignment_2_AP;

import java.util.HashMap;
import java.util.Scanner;

public class restaurant extends food {

	private static String s4 = "Ravi's";
	private static String s5 = "paradise";
	private int totalbill;
	private int tax;
	private int rewardPoint;
	int reward_scheme;
	private HashMap<Integer, String> cart;
	
	public static HashMap<Integer, String> restau = new HashMap<>();
	//private int n;
	
	public static HashMap<Integer, String> getRestau(){
		return restau;
	}
	
	public static void inputR(int n1) {

		if(n1==2) {
			System.out.println("Welcome "+ s4+":");

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
				f.addItemRR(sc,f,n1);
			}
			else if(nnn==3) {
				food f = new food();
				f.printRewardsRR();
			}
			else if(nnn==4) {
				food f = new food();
				f.discountOnBillRR();
			}

		}
		// TODO Auto-generated method stub

		if(n1==5) {
			System.out.println("Welcome "+ s5+":");

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
				f.addItemRR(sc,f,n1);
			}
			else if(nnn==3) {
				food f = new food();
				f.printRewardsRR();
			}
			else if(nnn==4) {
				food f = new food();
				f.discountOnBillRR();
			}
		}

	}

	//public abstract void discountOnBillValue();

}

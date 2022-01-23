package Assignment_2_AP;

import java.util.Scanner;

public class owner {
	food f;

	public void input() {
		System.out.println("Choose restaurant:");
		System.out.println("1) shah(Authentic)");
		System.out.println("2) Ravi's");
		System.out.println("3) The chinese (Authentic)");
		System.out.println("4) Wang's (Fast Food)");
		System.out.println("5) Paradise");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n==1 || n==3) {
			
			authentic_restaurant aR = new authentic_restaurant(n);
			aR.input2();
		}
		
		if(n==4) {
			fastfoodRestaurant ffr = new fastfoodRestaurant();
			ffr.inputff();
		}
		
		if(n==2 || n==5) {
			restaurant r = new restaurant();
			r.inputR(n);
		}
		
		
	}
}

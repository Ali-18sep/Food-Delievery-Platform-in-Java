package Assignment_2_AP;

import java.util.HashMap;
import java.util.Scanner;

public class Zotato {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hM = Customer.getHashMap();
		
		hM.put(1, "Ram");
		hM.put(2, "Sam");
		hM.put(3, "Tim");
		hM.put(4, "Kim");
		hM.put(5, "Jim");
		
		HashMap<Integer, String> M = restaurant.getRestau();
		
		M.put(1, "Shah");
		M.put(2, "Ravi's");
		M.put(3, "The Chinese");
		M.put(4, "Wang's");
		M.put(5, "Paradise");
		
		
		
		Zotato z = new Zotato();
		z.inputMain();
	}

	static void inputMain() {
		System.out.println("Welcome to Zotato:");
		System.out.println("1) Enter as Restaurant Owner");
		System.out.println("2) Enter as Customer");
		System.out.println("3) check User Details");
		System.out.println("4) Company Account details");
		System.out.println("5) Exit");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if(n==1) {
			owner o = new owner();
			o.input();
		}
		
		if(n==2) {
			System.out.println("1. Ram (Elite)");
			System.out.println("2. Sam (Elite)");
			System.out.println("3. Tim (Special)");
			System.out.println("4. Kim");
			System.out.println("5. Jim");
			
			Scanner s = new Scanner(System.in);
			int choice = s.nextInt();
			if(choice==1 || choice==2) {
				eliteCustomers el_Cust = new eliteCustomers();
				el_Cust.input_elCust(choice);
			}
		}
		
		if(n==3) {
			System.out.println("1) Customer List");
			System.out.println("2) Restaurant List");
			
			Scanner scs = new Scanner(System.in);
			int nx = scs.nextInt();
			if(n==1) {
				for(int i: restaurant.getRestau().keySet()) {
					
					System.out.println(i+"."+" "+restaurant.getRestau().get(i));
					
				}
			}
		}
	}
}

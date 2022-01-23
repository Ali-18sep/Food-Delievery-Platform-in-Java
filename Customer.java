package Assignment_2_AP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Customer extends food {

	public static HashMap<Integer, String> hash_map = new HashMap<>();

	public static HashMap<Integer, String> getHashMap(){
		return hash_map;
	}

	private int walletMoney = 1000;
	private int rewardScheme;
	//private int rewardPoint;
	protected ArrayList<Customer> cart;
	protected static ArrayList<food> itemCart = new ArrayList<food>();
	protected int rewardPoint;
	protected String restaur;
	protected int delivery_charge;

	public static void input_elCust(int choice) {

		//if(choice==1) {
		Customer c = new Customer();
		c.delivery_charge = 40;
		
		String s = "";

		for (int i : Customer.getHashMap().keySet()) {
			if(i==choice) {
				s = Customer.getHashMap().get(i);

				System.out.println("Welcome"+" "+s);
				System.out.println("Customer menu");
				System.out.println("1) Select Restaurant");
				System.out.println("2) checkout cart");
				System.out.println("3) Reward won");
				System.out.println("4) print the recent orders");
				System.out.println("5) Exit");

				Scanner cc  = new Scanner(System.in);

				int cm = cc.nextInt();

				if(cm==5) {
					Zotato.inputMain();
				}
				
				if(cm==2) {
					checkOutCart();
				}


				if(cm==1) {
					System.out.println("Choose Restaurant");
					System.out.println("1) Shah (Authentic)");
					System.out.println("2) Ravi's");
					System.out.println("3) The Chinese (Aunthentic)");
					System.out.println("4) Wang's (Fast Food)");
					System.out.println("5) Paradise");

					int np = cc.nextInt();

					for(int j : restaurant.restau.keySet()) {
						if(j==np) {

							System.out.println("Choose item by code");

							for(int k=0; k<food.f.size(); k++) {
								if(food.f.get(k).restaurantName.equals(restaurant.restau.get(np))) {
									System.out.println(food.f.get(k).Id+" "+food.f.get(k).restaurantName+" "+
											food.f.get(k).foodName+" "+food.f.get(k).itemPrice+" "+food.f.get(k).itemQuantity+" "+
											food.f.get(k).Offer+"%"+" "+"off"+" "+food.f.get(k).category);
								}
							}

							int xyz = cc.nextInt();

							System.out.println("Enter item quantity -");
							int Item_Quantity = cc.nextInt();

							for(int k=0; k<food.f.size(); k++) {

								if(food.f.get(k).restaurantName.equals(restaurant.restau.get(np))) {
									if(food.f.get(k).Id==xyz) {
										food fx = new food();
										fx.Id = food.f.get(k).Id;
										fx.restaurantName = food.f.get(k).restaurantName;
										fx.foodName = food.f.get(k).foodName;
										fx.itemPrice = food.f.get(k).itemPrice;
										fx.itemQuantity = Item_Quantity;
										fx.Offer = food.f.get(k).Offer;

										itemCart.add(fx);

										System.out.println("Items added to cart");
									}
								}
							}
							input_elCust(choice);

						}
					}
				}
			}
		}
	}

	private static void checkOutCart() {
		// TODO Auto-generated method stub
		System.out.println("Items int Cart -");
		for(int i=0; i<itemCart.size(); i++) {
			System.out.println(itemCart.get(i).Id+" "+itemCart.get(i).restaurantName+" "+"-"+" "+itemCart.get(i).foodName+" "+
		"-"+" "+itemCart.get(i).itemPrice+"-"+" "+itemCart.get(i).itemQuantity+"-"+" "+itemCart.get(i).Offer+"%"+" "+"off3.");
		}
		
	}
}

class eliteCustomers extends Customer{
	
	public eliteCustomers() {
		//eliteCustomers.delivery_charge = 0;
		eliteCustomers ec = new eliteCustomers();
		ec.delivery_charge = 0;
	}

}

class specialCustomers extends Customer{
	
	public specialCustomers() {
		
		specialCustomers sc = new specialCustomers();
		sc.delivery_charge = 20;
		
	}

}


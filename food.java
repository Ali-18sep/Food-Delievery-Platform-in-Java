package Assignment_2_AP;

import java.util.ArrayList;
import java.util.Scanner;

public class food {
	protected  int Id;
	protected static int n;
	protected int discount;
	protected String foodName;
	protected int itemPrice;
	protected int itemQuantity;
	protected String category;
	protected int Offer;
	protected String restaurantName;
	

	protected static ArrayList<food> f = new ArrayList();

	public food() {
		//this.restaurantName = str;
		//food F = new food();
		n+=1;
		//this.Id = n;
	}

	//public void input3() {
		// TODO Auto-generated method stub
		//System.out.println("1) Add item");
		//System.out.println("2) Edit item");
		//System.out.println("3) Print Rewards");
		//System.out.println("4) Discount on bill value");
		//System.out.println("5) Exit");

	//	Scanner sc = new Scanner(System.in);
	//	int nn = sc.nextInt();

//		if(nn==1) {
		//	addItem(sc,this);
	//	}
//		if(nn==2) {
		//	editItem(sc);
		//}
		
		//if(nn==3) {
			//printReward();
		//}

	//}

	private void printReward() {
		
		
	}

	private void printReward(Scanner sc) {
		
		
		
	}

	protected static void editItem(Scanner sc) {
		System.out.println("Choose Item by code:");

		for(int i=0; i<f.size(); i++) {
			System.out.println(f.get(i).Id+" "+f.get(i).restaurantName+" "+"-"+
					f.get(i).foodName+" "+f.get(i).itemPrice+" "+f.get(i).itemQuantity
					+" "+f.get(i).Offer+"%"+" "+"Off"+" "+f.get(i).category);
		}

		int n = sc.nextInt();

		System.out.println("choose am attribute to edit:");
		System.out.println("1) Name");
		System.out.println("2) Price");
		System.out.println("3) Quantity");
		System.out.println("4) Category");
		System.out.println("5) Offer");

		int n2 = sc.nextInt();

		if(n2==1) {

			for(int i=0; i<f.size(); i++) {
				if(f.get(i).Id==n) {
					System.out.println("Enter the new name");
					String st = sc.next();

					f.get(i).foodName = st;

					System.out.println(f.get(i).Id+" "+f.get(i).restaurantName+" "+"-"+
							f.get(i).foodName+" "+f.get(i).itemPrice+" "+f.get(i).itemQuantity
							+" "+f.get(i).Offer+"%"+" "+"Off"+" "+f.get(i).category);

				}
				
				
			}
			
			authentic_restaurant.input2();

		}


		if(n2==2) {
			for(int i=0; i<f.size(); i++) {
				if(f.get(i).Id==n) {
					System.out.println("Enter the new Price");
					int st = sc.nextInt();
					f.get(i).itemPrice = st;
					System.out.println(f.get(i).Id+" "+f.get(i).restaurantName+" "+"-"+
							f.get(i).foodName+" "+f.get(i).itemPrice+" "+f.get(i).itemQuantity
							+" "+f.get(i).Offer+"%"+" "+"Off"+" "+f.get(i).category);

				}
			}
			authentic_restaurant.input2();
		}

		if(n2==3) {

			for(int i=0; i<f.size(); i++) {
				if(f.get(i).Id==n) {
					System.out.println("Enter the new Item quantity");
					int st = sc.nextInt();
					f.get(i).itemQuantity = st;
					System.out.println(f.get(i).Id+" "+f.get(i).restaurantName+" "+"-"+
							f.get(i).foodName+" "+f.get(i).itemPrice+" "+f.get(i).itemQuantity
							+" "+f.get(i).Offer+"%"+" "+"Off"+" "+f.get(i).category);

				}
			}
			
			authentic_restaurant.input2();

		}



		if(n2==4) {

			for(int i=0; i<f.size(); i++) {
				if(f.get(i).Id==n) {
					System.out.println("Enter the new Category");
					String st = sc.next();
					f.get(i).category= st;
					System.out.println(f.get(i).Id+" "+f.get(i).restaurantName+" "+"-"+
							f.get(i).foodName+" "+f.get(i).itemPrice+" "+f.get(i).itemQuantity
							+" "+f.get(i).Offer+"%"+" "+"Off"+" "+f.get(i).category);

				}
			}
			authentic_restaurant.input2();

		}
		
		
		
		if(n2==5) {

			for(int i=0; i<f.size(); i++) {
				if(f.get(i).Id==n) {
					System.out.println("Enter the new Offer");
					int st = sc.nextInt();
					f.get(i).Offer= st;
					System.out.println(f.get(i).Id+" "+f.get(i).restaurantName+" "+"-"+
							f.get(i).foodName+" "+f.get(i).itemPrice+" "+f.get(i).itemQuantity
							+" "+f.get(i).Offer+"%"+" "+"Off"+" "+f.get(i).category);

				}
			}
			authentic_restaurant.input2();

		}

	}

	protected static void addItem(Scanner sc,String s1) {
		// TODO Auto-generated method stub
		System.out.println("Enter food item details:");
		System.out.println("Food name:");
		String fname = sc.next();

		System.out.println("Item price:");
		int p = sc.nextInt();

		System.out.println("Item quantity:");
		int quantity = sc.nextInt();

		System.out.println("Item category:");
		String cat = sc.next();


		System.out.println("Offer:");
		int off = sc.nextInt();


		System.out.println(n+1+" "+fname+" "+p+" "+quantity+" "+off+"%"+" "+"Off"+" "+cat);

		food F = new food();
		F.Id = n;
		F.restaurantName = s1;
		//System.out.println("ZAID ID: "+" "+c.Id);
		F.itemPrice = p;
		F.itemQuantity = quantity;
		F.category = cat;
		F.foodName = fname;
		F.Offer = off;

		f.add(F);
		
		authentic_restaurant.input2();


	}

	public void printRewards() {
		
		
	}

	public void discountOnBill() {
		// TODO Auto-generated method stub
		
	}

	public void addItemFF(Scanner sc, food c) {
		// TODO Auto-generated method stub
		System.out.println("Enter food item details:");
		System.out.println("Food name:");
		String fname = sc.next();

		System.out.println("Item price:");
		int p = sc.nextInt();

		System.out.println("Item quantity:");
		int quantity = sc.nextInt();

		System.out.println("Item category:");
		String cat = sc.next();


		System.out.println("Offer:");
		int off = sc.nextInt();


		System.out.println(Id+" "+fname+" "+p+" "+quantity+" "+off+"%"+" "+"Off"+" "+cat);

		//food F = new food();
		c.Id = Id;
		c.itemPrice = p;
		c.itemQuantity = quantity;
		c.category = cat;
		c.foodName = fname;
		c.Offer = off;

		f.add(c);
		
		fastfoodRestaurant.inputff();


		
	}

	public void printRewardsFF() {
		// TODO Auto-generated method stub
		
	}

	public void discountOnBillFF() {
		// TODO Auto-generated method stub
		
	}

	public static void addItemRR(Scanner sc, food f2, int nn) {
		System.out.println("Enter food item details:");
		System.out.println("Food name:");
		String fname = sc.next();

		System.out.println("Item price:");
		int p = sc.nextInt();

		System.out.println("Item quantity:");
		int quantity = sc.nextInt();

		System.out.println("Item category:");
		String cat = sc.next();


		System.out.println("Offer:");
		int off = sc.nextInt();


		//System.out.println(Id+" "+fname+" "+p+" "+quantity+" "+off+"%"+" "+"Off"+" "+cat);

		//food F = new food();
		f2.Id = n;
		f2.itemPrice = p;
		f2.itemQuantity = quantity;
		f2.category = cat;
		f2.foodName = fname;
		f2.Offer = off;

		f.add(f2);
		restaurant.inputR(nn);		
	}

	public void printRewardsRR() {
		// TODO Auto-generated method stub
		
	}

	public void discountOnBillRR() {
		// TODO Auto-generated method stub
		
	}

}

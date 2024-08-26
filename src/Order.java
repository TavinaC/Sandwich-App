//Tavina Chen
//May 6 2024
//CS1400 
//Project 2: Sandwich App: Order class

//This class simulates the order. This class has attributes of a customer name, a sandwich object,
//and the string value for time stamp. Time stamp is created the first time toString() is called.


import java.text.DateFormat;
import java.util.Date;

public class Order {
	private String name, timestamp = "";
	private Sandwich sandwich = new Sandwich();
	
	public static void dispBread() {
		System.out.print("=== Select Sandwich Bread: ==="
				+ "\n1 White Bread $1.5"
				+ "\n2 Wheat Bread $1.6"
				+ "\n3 French Bread $1.8"
				+ "\n4 Organic Bread $2.0"
				+ "\nSelect a bread [1, 4]: ");
	}
	
	public static void dispVeg() {
		System.out.print("=== Select Sandwich Vegetables: ==="
				+ "\n1 red onions $0.05"
				+ "\n2 olives $0.10"
				+ "\n3 pickles $0.10"
				+ "\n4 lettuce $0.20"
				+ "\n5 green peppers $0.25"
				+ "\n6 tomatoes $0.30"
				+ "\n7 cheese $0.50"
				+ "\n8 Quit vegetable selection"
				+ "\nSelect vegetables: [1, 8]: ");
	}
	public static void dispMeat() {
		System.out.print("=== Select Sandwich Meat: ==="
				+ "\n1 Ham $1.0"
				+ "\n2 Roasted Chicken Breast $1.1"
				+ "\n3 Turkey Breast $1.2"
				+ "\n4 Roast Beef $1.5"
				+ "\n5 Quit meat selection"
				+ "\nSelect meat [1, 5]: ");
	}
	
	public void setBread(int b) {
		sandwich.setBread(b);
	}
	
	public void setVeg(int v) {
		sandwich.setVeg(v);
	}
	
	public void appendVeg() {
		sandwich.appendVeg();
	}
	public void setMeat(int m) {
		sandwich.setMeat(m);
	}
	
	private void setDate() {
		Date now = new Date(); 
		DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM); 
		timestamp = defaultDate.format(now);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		if (timestamp.equals("")) {
			this.setDate();
		}
		
		//doesn't include price
		return timestamp + "\t" + name + "\t" + sandwich.getBread() + "\t" 
				+ sandwich.getVeg() + "\t" + sandwich.getMeat() + "\t$" + sandwich.getPrice() + "\n";
	}
}

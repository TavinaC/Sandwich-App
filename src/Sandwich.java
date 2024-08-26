//Tavina Chen
//May 6 2024
//CS1400 
//Project 2: Sandwich App: Sandwich class

//This class simulates the sandwich entity in real world. It has attributes of bread, vegetables,
//meat, and price of the sandwich, and corresponding methods.

public class Sandwich {
	private String bread = "", vegetables = "", meat = "";
	private double price = 0;
	
	public void setBread(int b) {
		switch (b) {
		case 1:
			bread = "White Bread";
			price += 1.5;
			break;
		case 2: 
			bread = "Wheat Bread";
			price += 1.6;
			break;
		case 3:
			bread = "French Bread";
			price += 1.8;
			break;
		case 4:
			bread = "Organic Bread";
			price += 2;
			break;
		}
	}
	
	public void setVeg(int v) {
		switch (v) {
		case 1:
			vegetables += "red onions";
			price += 0.05;
			break;
		case 2: 
			vegetables += "olives";
			price += 0.1;
			break;
		case 3:
			vegetables += "pickles";
			price += 0.1;
			break;
		case 4:
			vegetables += "lettuce";
			price += 0.2;
			break;
		case 5:
			vegetables += "green peppers";
			price += 0.25;
			break;
		case 6: 
			vegetables += "tomatoes";
			price += 0.3;
			break;
		case 7:
			vegetables += "cheese";
			price += 0.5;
			break;
		}
	}
	
	public void appendVeg() {
		vegetables += ", ";
	}
	
	public void setMeat(int m) {
		switch (m) {
		case 1:
			meat = "Ham";
			price += 1;
			break;
		case 2: 
			meat = "Roasted Chicken Breast";
			price += 1.1;
			break;
		case 3:
			meat = "Turkey Breast";
			price += 1.2;
			break;
		case 4:
			meat = "Roast Beef";
			price += 1.5;
			break;
		}
	}
	
	public String getBread() {
		return bread;
	}
	
	public String getVeg() {
		if (vegetables.equals("")) {
			return "no vegetables";
		} else {
			return vegetables;
		}
	}
	
	public String getMeat() {
		if (meat.equals("")) {
			return "no meat";
		} else {
			return meat;
		}
	}
	
	public String getPrice() {
		return String.format("%.2f", price);
	}
}

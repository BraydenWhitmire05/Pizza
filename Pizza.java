package intec_2150;
public class Pizza {

	private String name;
	private int Cheese;
	private int Sauce;
	private double Price;
	
	public Pizza() {
		
		
	}
	
	public Pizza(String name, int Cheese, int Sauce, double Price) {
		this.name = name;
		this.Cheese = Cheese;
		this.Sauce = Sauce;
		this.Price = Price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCheese() {
		return Cheese;
	}

	public void setCheese(int cheese) {
		Cheese = cheese;
	}

	public int getSauce() {
		return Sauce;
	}

	public void setSauce(int sauce) {
		Sauce = sauce;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Pizza " + name + ", Cheese = " + Cheese + ", Sauce = " + Sauce + ", Price = $" + Price;
	}
	
	
	
}
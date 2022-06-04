package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	
   // entrada de dados
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	// alteração dos dados
	public void setName(String name) {
		this.name = name;
	}
		
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}


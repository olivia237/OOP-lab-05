package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {
	private final String name;
	private final double quantity;

	public ProductImpl(final String n, double q) {
		super();
		this.name=n;
		this.quantity=q;
		
	}

	public String getName() {
		return name;
	}

	public double getQuantity() {

		return quantity;
	}

	public String toString() {
		return "ProductImpl [Name=" + getName() + ", Quantity=" + getQuantity() + "]";
	}

}

package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class Comparable_product extends ProductImpl implements Comparable<Product> {

	public Comparable_product(final String name, final double quantity) {
		
		super(name, quantity);
	}

	public int compareTo(Product o) {
				return getName().compareTo(o.getName());
	}

}

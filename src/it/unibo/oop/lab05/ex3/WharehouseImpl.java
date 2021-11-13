package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class WharehouseImpl implements Warehouse{

	public WharehouseImpl() {
		
	}
	final Set<Product> set= new HashSet<Product>();

	public void addProduct(Product p) {
		this.set.add(p);
		
	}

	public Set<String> allNames() {
		final var set1=new HashSet<String>();
		for(final Product p : this.set) {
			set1.add(p.getName());
		}
		return set1;

	}

	public Set<Product> allProducts() {
		return new HashSet<>(this.set);
	}


	public boolean containsProduct(Product p) {
		return set.contains(p);
	}


	public double getQuantity(String name) {
		for(final var p: set) {
			if(p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		return 0;
		
	}

}

package it.unibo.oop.lab05.ex4;
import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WharehouseImpl;

public class Ordered_warehouse extends WharehouseImpl{

	public Ordered_warehouse() {

	}
	public Set<Product> allProducts() {
        return new TreeSet<>(super.allProducts());
    }

}

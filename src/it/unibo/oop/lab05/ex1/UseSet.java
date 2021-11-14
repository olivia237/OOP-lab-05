package it.unibo.oop.lab05.ex1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {
	private static int elements=20;
    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content  "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	
    	final var coll1=new TreeSet<String>();
    	for(int i=1;i<=elements;i++) {
    		coll1.add(Integer.toString(i));
    	}
    	System.out.println("initial set" +coll1);
    	
    	final var iter = coll1.iterator();
    	while(iter.hasNext()) {
        	if(Integer.parseInt(iter.next())%3==0) {
        		iter.remove();
        	}
    	}
    	for(final String string : coll1) {
    		System.out.println(string+ " ");
    	}

    }
}


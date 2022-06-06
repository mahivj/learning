package com.java.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class LessThanForty implements Predicate<Integer> {
	
	public boolean test(Integer value) {
		return value < 40;
	}
	
}

public class PredicateDemo {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(12,45,89,5,36,23);
		
		LessThanForty lessThanForty = new LessThanForty();
		
		list.stream().filter(lessThanForty).forEach(System.out::println);
		
		

	}

}

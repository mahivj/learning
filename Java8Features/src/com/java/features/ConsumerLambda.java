package com.java.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

class ConsumerImpl implements Consumer<Integer> {
	public void accept(Integer i) {
		System.out.println(i);
	}
	
}

public class ConsumerLambda {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(12,45,89,5,36,23);
		list.forEach(i -> System.out.println(i)); // Values passed to forEach is actually an object of java.util.function.Consumer		
		
		
//		Consumer<Integer> consumer = new ConsumerImpl();
//		list.forEach(consumer);
		
		//Stream<T>
		
		
	}

}

package com.java.features;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,45,89,5,36,23);
		
//		for(Object i: list) {
//			System.out.println(i);
//
//		}
		
		list.forEach(i -> System.out.println(i));
		
	}

}

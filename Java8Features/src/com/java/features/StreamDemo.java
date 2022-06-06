package com.java.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,45,89,5,36,23);
		//list.stream().forEach(i -> System.out.println(i));
		List filteredList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		filteredList.forEach(i -> System.out.println(i));
		
	}

}

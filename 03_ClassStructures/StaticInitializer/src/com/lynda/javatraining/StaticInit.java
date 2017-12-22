package com.lynda.javatraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lynda.olivepress.olives.Olive;
import com.lynda.olivepress.olives.OliveJar;

public class StaticInit {

	public static void main(String[] args) throws Exception {
		ArrayList<Olive> olives = OliveJar.oliv;
		for(Olive o: olives) {
			System.out.println(o.oliveName);
		}
		//lambas are stateless
		//closure has immutable state
//		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		System.out.println(numbers.stream()
//				.filter(e -> e %2 ==0)
//				.mapToInt(e -> e*2)
//				.sum());
		
	}
	
}

package com.lynda.javatraining;

import java.util.ArrayList;

import com.lynda.olivepress.olives.Olive;

public class Main {

	public static void main(String[] args) throws Exception {

		Olive o1 = new Olive("Kalamata", 0x000000);
		Olive o2 = new Olive("Picholine", 0x00FF00);
		Olive o3 = new Olive("Ligurio", 0x000000);
		
		//Olive[] olives = {o1, o2, o3};
		ArrayList<Olive> t = new ArrayList<>();
		t.add(o1);
		t.add(o2);
		t.add(o3);
		System.out.println(t);
	}
	
}
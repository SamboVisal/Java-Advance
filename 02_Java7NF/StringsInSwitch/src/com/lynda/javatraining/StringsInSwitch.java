package com.lynda.javatraining;

import java.util.ArrayList;
import java.util.Random;

import com.lynda.olivepress.olives.Olive;

public class StringsInSwitch {

	public static void main(String[] args) throws Exception {

		Olive o1 = new Olive("Kalamata", 0x000000);
		Olive o2 = new Olive("Picholine", 0x00FF00);
		Olive o3 = new Olive("Ligurio", 0x000000);
		
		ArrayList<Olive> list = new ArrayList<>();
		
		list.add(o1);
		list.add(o2);
		list.add(o3);
		//System.out.println(list);
		Random generator = new Random();
		int index = generator.nextInt(3);
		System.out.println("Random value "+index);
		
		Olive o = list.get(index);
		switch (o.oliveName) {
		case "Kalamata":
			System.out.println("It is Greek");
			break;
		
		case "Picholine":
			System.out.println("It is French");
			break;
			
		case "Ligurio":
			System.out.println("It is Italian");
			break;
		default:
			System.out.println("Where it is come from");
			break;
		}
	}
	
}

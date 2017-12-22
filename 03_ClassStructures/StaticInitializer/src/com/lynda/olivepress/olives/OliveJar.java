package com.lynda.olivepress.olives;

import java.util.ArrayList;

public class OliveJar {
	
	public static ArrayList<Olive> oliv;
	
	static {
		oliv = new ArrayList<>();
		oliv.add(new Olive("Kalamata",0x000000));
		oliv.add(new Olive("Pisal",0x00FF00));
		oliv.add(new Olive("messi",0x000000));
	}
	
}

package test;

import java.util.ArrayList;

public class arList {

	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Test");
		al.add("Java");
		al.add("Ruby");
		al.add("c++");
		
		for(String st : al) {
			System.out.println(st);
		}

	}

}

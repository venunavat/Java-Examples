package com.skvn.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashmapSorted_2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "def");
		hm.put(3, "ghi");
		System.out.println(hm);
		hm.put(1, "abc");
		hm.put(2, "def");
		hm.put(22, "def");
		// hm.remove(2);
		System.out.println(hm);
		System.out.println(hm);
		System.out.println(hm);
		System.out.println(hm);
		System.out.println(hm);
		TreeMap<Integer, String> sortedMapp = new TreeMap<Integer, String>(hm);
		System.out.println("sortedMapp:" + sortedMapp);
		List<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		System.out.println("ArrayList:" + intlist);
		Set<Integer> hmm = new HashSet<Integer>();
		hmm.add(1);
		System.out.println("HS:" + hmm);
	}
}

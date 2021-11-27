package com.datastructure.linked;

public class Test {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(0, "a");
		l.add(1, "b");
		l.add(2, "c");
		
		l.remove(2);
		
		l.add(2, "d");
		
		l.print();
	}
}

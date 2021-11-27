package com.datastructure.stack;

public class Test {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(3);
		
		stack.push("AA");
		stack.push("BB");
		stack.push("CC");
		stack.push("DD");
		
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
	}

}

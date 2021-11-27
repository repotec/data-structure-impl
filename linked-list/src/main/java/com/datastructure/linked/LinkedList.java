package com.datastructure.linked;

public class LinkedList {
	ListNode head = null;
	
	public void print() {
		ListNode i = head;
		
		while(i != null) {
			System.out.println(i.value);
			i = i.next;
		}
	}
	
	/**
	 * 1- create new ListNode object
	 * 2- loop to stand on the previous element from the index input
	 * 3- assign the next previous (reference) to the new next (reference)
	 * 4- assign the new object to previous next value
	 * @param index
	 * @param value
	 */
	public void add(int index, String value) {
		ListNode newNode = new ListNode(value);
		
		if(index == 0) {
			newNode.next = head;
			head = newNode;
		}else {
			ListNode previous = getPreviousNode(index);
			
			newNode.next = previous.next;
			previous.next = newNode;
		}
	}
	
	public void remove(int index) {
		ListNode previous = getPreviousNode(index);
		
		ListNode current = previous.next;
		previous.next = current.next;
	}
	
	private ListNode getPreviousNode(int index) {
		ListNode previous = head;
		for (int counter = 0; counter < index - 1; counter++) {
			previous = previous.next;
		}
		return previous;
	}
}

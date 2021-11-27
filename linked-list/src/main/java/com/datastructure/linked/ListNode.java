package com.datastructure.linked;

public class ListNode {
	public ListNode() {
	}
	
	public ListNode(String value) {
		this.value = value;
	}
	
	public ListNode next = null;
	public String value;
	
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}

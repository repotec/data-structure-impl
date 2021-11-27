package com.datastructure.stack;

public class Stack<T> {
	private Object[] array;
	private int size = 10;
	private int top;

	public Stack() {
		array = new Object[size];
		top = -1;
	}
	
	public Stack(int size) {
		array = new Object[size];
		top = -1;
		this.size = size;
	}

	public void push(T t) {
		if(isFull())
			System.err.println("Stack is full cannot add " + t);
		else
			array[++top] = t;
	}

	public T pop() {
		if (this.isEmpty())
			System.err.println("Stack is empty");
		return element(top--);
	}
	
	public T peek() {
        if(this.isEmpty())
        	System.err.println("Stack is empty");
        return element(top);
    }

	public boolean isFull(){
        return top + 1 == array.length ? true : false;
    }
	
	public boolean isEmpty() {
		return top == -1 ? true : false;
	}
	
	public int size() {
		return size;
	}

	@SuppressWarnings("unchecked")
	private T element(int index) {
		return (T) array[index];
	}
}
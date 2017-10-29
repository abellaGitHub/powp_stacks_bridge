package edu.kis.vh.stacks;

public class Stack {

	private StackArray stackArray;

	public Stack() {
		this.stackArray = new StackArray();
	}

	public Stack(StackArray stackArray) {
		super();
		this.stackArray = stackArray;
	}
	
	public int getTotal() {
		return stackArray.getTotal();
	}

	public void push(int i) {
		stackArray.push(i);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int top() {
		return stackArray.top();
	}

	public int pop() {
		return stackArray.pop();
	}

}

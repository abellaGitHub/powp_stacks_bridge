package edu.kis.vh.stacks.list;

class Node {

	// po enkapsulacji powstały gettery i settery dla enkapsulowanych pól
	private int value;
	private Node prev, next;

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

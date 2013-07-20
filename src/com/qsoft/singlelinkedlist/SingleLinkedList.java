package com.qsoft.singlelinkedlist;

import java.util.ArrayList;
import java.util.List;

public class SingleLinkedList {

	private List<Node> list;
	private int firstElement;

	public SingleLinkedList() {
		super();
		this.list = new ArrayList<Node>();
		this.firstElement = 0;
	}

	public SingleLinkedList(List<Node> listObject) {
		this.list = listObject;
	}

	public List<Node> getList() {
		// TODO Auto-generated method stub
		return this.list;
	}

	public int listSize() {
		// TODO Auto-generated method stub
		return this.list.size();
	}

	public void insertAfter(int i, Node newNode) {

	}

	public Node getNode(int position) {
		if (this.listSize() > 0) {
			Node result = this.list.get(0);
			while (result.getNextNode() == position) {
				result = this.list.get(result.getNextNode());
			}
			return result;
		} else {
			return null;
		}
	}

}

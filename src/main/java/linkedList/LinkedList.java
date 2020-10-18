package linkedList;

import linkedList.MyNode;

public class LinkedList<K> {
	
	public MyNode<K> head;
	public MyNode<K> tail;
	
	public LinkedList(MyNode<K> head, MyNode<K> tail)
	{
		this.head=head;
		this.tail=tail;
	}
}

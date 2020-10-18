package linkedList;

public class LinkedList<K> {
	
	public MyNode<K> head;
	public MyNode<K> tail;
	
	public LinkedList(MyNode<K> head, MyNode<K> tail)
	{
		this.head=head;
		this.tail=tail;
	}
	
	public MyNode<K> getHead() {
		return head;
	}

	public void setHead(MyNode<K> head) {
		this.head = head;
	}

	public MyNode<K> getTail() {
		return tail;
	}

	public void setTail(MyNode<K> tail) {
		this.tail = tail;
		tail.setNext(null);
	}
	
	public void addNode(MyNode<K> newNode) {
		if (tail == null)
			setTail(newNode);
		if (head == null)
			setHead(newNode);
		else {
			MyNode<K> tempNode = this.head;
			setHead(newNode);
			newNode.setNext(tempNode);
		}
	}
	
	public void appendNode(MyNode<K> newNode) {
		if (head == null)
			setHead(newNode);
		if (tail == null)
			setTail(newNode);		
		else {
			this.tail.setNext(newNode);
			setTail(newNode);			
		}
	}
	
	public void insertNode(MyNode<K> targetNode, MyNode<K> newNode) {
		MyNode<K> tempNode=targetNode.getNext();
		targetNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public void printLinkedList(MyNode<K> head)
	{
		MyNode<K> temp=head;
		while(temp.getNext()!=null)
		{
			System.out.print(temp.getKey()+"->");
			temp=temp.getNext();
		}
		System.out.print(temp.getKey()+"\n");
	}
	
	public MyNode<K> deleteFirstElement(MyNode<K> head)
	{
		MyNode<K> temp=head;
		setHead(head.getNext());
		return temp;
	}

	public MyNode<K> deleteLastElement(MyNode<K> head) {
		if(head==null)
			return null;
		MyNode<K> temp=head;
		while(temp.getNext().getNext()!=null)
		{
			temp=temp.getNext();
		}
		MyNode<K> lastElement=temp.getNext();
		setTail(temp);
		return lastElement;
	}	
}	

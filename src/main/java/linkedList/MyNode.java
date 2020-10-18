package linkedList;

public class MyNode<K> {
	private K key;
	private MyNode<K> next;
	
	public MyNode(K key)
	{
		this.setKey(key);
		this.next=null;
	}
	
	public MyNode<K> getNext() {
		return next;
	}
	public void setNext(MyNode<K> next) {
		this.next = next;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}
	
}
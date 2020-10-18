package linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void Adding3NumbersToLinkedList() {
		MyNode firstNode=new MyNode(56);
		MyNode secondNode=new MyNode(30);
		MyNode thirdNode=new MyNode(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result=firstNode.getNext().equals(secondNode)&&secondNode.getNext().equals(thirdNode);
		assertTrue(result);
	}
	
	@Test
	public void given3NumberWhenAddedToLinkedShouldBeAddedToTop() {
		MyNode firstNode = new MyNode(70);
		MyNode secondNode = new MyNode(30);
		MyNode thirdNode = new MyNode(56);

		LinkedList<Object> list=new LinkedList<Object>(null,null);
		
		list.addNode(firstNode);
		list.addNode(secondNode);
		list.addNode(thirdNode);
		
		list.printLinkedList(list.getHead());
		boolean result = list.getHead().equals(thirdNode) && list.getHead().getNext().equals(secondNode)
				&& list.getTail().equals(firstNode);
		assertTrue(result);
	}
	
	@Test
	public void given3NumberWhenAppendedToLinkedShouldBeAddedToBottom() {
		MyNode firstNode = new MyNode(56);
		MyNode secondNode = new MyNode(30);
		MyNode thirdNode = new MyNode(70);
		
		LinkedList<Object> list=new LinkedList<Object>(null,null);
		
		list.appendNode(firstNode);
		list.appendNode(secondNode);
		list.appendNode(thirdNode);
		
		list.printLinkedList(list.getHead());
		boolean result = list.getHead().equals(firstNode) && list.getHead().getNext().equals(secondNode)
				&& list.getTail().equals(thirdNode);
		assertTrue(result);
	}
	
	@Test
	public void given3NumberWhenInseringInBetweenShouldPassLinkedListTest() {
		MyNode firstNode = new MyNode(56);
		MyNode secondNode = new MyNode(30);
		MyNode thirdNode = new MyNode(70);

		LinkedList<Object> list=new LinkedList<Object>(null,null);
		
		list.appendNode(firstNode);
		list.appendNode(thirdNode);
		list.insertNode(firstNode,secondNode);
		
		list.printLinkedList(list.getHead());
		boolean result = list.getHead().equals(firstNode) && list.getHead().getNext().equals(secondNode)
				&& list.getTail().equals(thirdNode);
		assertTrue(result);
	}
	
	@Test
	public void deletingFirstElementFromLinkedList() {
		MyNode firstNode = new MyNode(70);
		MyNode secondNode = new MyNode(30);
		MyNode thirdNode = new MyNode(56);

		LinkedList<Object> list=new LinkedList<Object>(null,null);
		
		list.addNode(firstNode);
		list.addNode(secondNode);
		list.addNode(thirdNode);
		MyNode deleted =list.deleteFirstElement(list.getHead());
		list.printLinkedList(list.getHead());
		boolean result=deleted.getKey().equals(thirdNode.getKey());
		assertTrue(result);
	}
	
	@Test
	public void deletingLastElementFromLinkedList() {
		MyNode firstNode = new MyNode(70);
		MyNode secondNode = new MyNode(30);
		MyNode thirdNode = new MyNode(56);

		LinkedList<Object> list=new LinkedList<Object>(null,null);
		
		list.addNode(firstNode);
		list.addNode(secondNode);
		list.addNode(thirdNode);
		MyNode deleted =list.deleteLastElement(list.getHead());
		list.printLinkedList(list.getHead());
		boolean result=deleted.getKey().equals(firstNode.getKey());
		assertTrue(result);
	}
}

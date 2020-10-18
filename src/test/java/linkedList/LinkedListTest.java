package linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		MyNode<Integer> firstNode=new MyNode<>(56);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result=firstNode.getNext().equals(secondNode)&&secondNode.getNext().equals(thirdNode);
		assertTrue(result);
	}
}

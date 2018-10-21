import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class MainTest {

     ArrayList<Integer> myList;
     Stack<Integer> myStack;
     LinkedList<Integer> myLinkedList;
     Queue<Integer> myQueue ;


   //ArrayListTesting
    @Test
    public void arrayListNotNull(){
        myList = new ArrayList<Integer>();
        Assertions.assertNotNull(myList);
    }
    @Test
    public void arrayListAdd() {
        myList = new ArrayList<Integer>();
        Assertions.assertTrue(myList.add(1));
    }
    @Test
    public void arrayListContains(){
        myList = new ArrayList<Integer>();
        myList.add(1);
        Assertions.assertTrue(myList.contains(1));
    }
    @Test
    public void arrayListSize(){
        myList = new ArrayList<Integer>();
        myList.add(1);
        Assertions.assertEquals(1,myList.size());
    }
    @Test
    public void arrayListRemove() {
        myList = new ArrayList<Integer>();
        myList.add(1);
        Assertions.assertEquals((Integer) 1,myList.remove(0));
    }

    //LinkedListTesting
    @Test
    public void linkedListNotNull(){
        myLinkedList = new LinkedList<Integer>();
        Assertions.assertNotNull(myLinkedList);
    }
    @Test
    public void  linkedListAdd() {
        myLinkedList = new LinkedList<Integer>();
        Assertions.assertTrue(myLinkedList.add(1));
    }
    @Test
    public void  linkedListContains(){
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(1);
        Assertions.assertTrue(myLinkedList.contains(1));
    }
    @Test
    public void  linkedListContainsAll(){
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        Assertions.assertTrue(myLinkedList.containsAll(myList));
    }
    @Test
    public void  linkedListSize(){
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(1);
        Assertions.assertEquals(1,myLinkedList.size());
    }
    @Test
    public void  linkedListRemove() {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(1);
        Assertions.assertEquals((Integer) 1,myLinkedList.remove(0));
    }
    @Test
    public void  linkedListClear() {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(1);
        myLinkedList.clear();
        Assertions.assertEquals( 0,myLinkedList.size());
    }
    @Test
    public void  linkedListIsEmpty() {
        myLinkedList = new LinkedList<Integer>();
        Assertions.assertTrue(myLinkedList.isEmpty());
    }
    @Test
    public void  linkedListEquals() {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(1);
        myList = new ArrayList<Integer>();
        myList.add(1);
        Assertions.assertTrue(myLinkedList.equals(myList));
    }
    @Test
    public void  linkedListRetainAll() {
        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        Assertions.assertTrue(myLinkedList.retainAll(myList));
    }

    //StackTesting
    @Test
    public void stackNotNull(){
        myStack = new Stack<Integer>();
        Assertions.assertNotNull(myStack);
    }
    @Test
    public void stackPush() {
        myStack = new Stack<Integer>();
        Assertions.assertEquals((Integer) 1,myStack.push(1));
    }
    @Test
    public void stackPeak() {
        myStack = new Stack<Integer>();
        myStack.add(1);
        Assertions.assertEquals((Integer)1,myStack.peek());
    }

    @Test
    public void stackSearch(){
        myStack = new Stack<Integer>();
        myStack.add(1);
        Assertions.assertEquals(1,(myStack.search(1)));
    }
    @Test
    public void stackSize(){
        myStack = new Stack<Integer>();
        myStack.add(1);
        Assertions.assertEquals(1,myStack.size());
    }
    @Test
    public void stackPop() {
        myStack = new Stack<Integer>();
        myStack.add(1);
        Assertions.assertEquals((Integer) 1,myStack.pop());
    }
    @Test
    public void stackIsEmpty() {
        myStack = new Stack<Integer>();
        Assertions.assertTrue(myStack.isEmpty());
    }

    //QueueTesting
    @Test
    public void queueAdd() {
        myQueue = new LinkedBlockingQueue<Integer>();
        Assertions.assertTrue(myQueue.add(1));
    }
    @Test
    public void queueElement() {
        myQueue = new LinkedBlockingQueue<Integer>();
        myQueue.add(1);
        Assertions.assertEquals((Integer) 1,myQueue.element());
    }
    @Test
    public void queueOffer() {
        myQueue = new LinkedBlockingQueue<Integer>();
        myQueue.add(1);
        Assertions.assertTrue(myQueue.offer(2));
    }
    @Test
    public void queuePeak(){
        myQueue = new LinkedBlockingQueue<Integer>();
        Assertions.assertNull(myQueue.peek());
        myQueue.add(1);
        Assertions.assertEquals((Integer)1,myQueue.peek());
    }
    @Test
    public void queuePoll(){
        myQueue = new LinkedBlockingQueue<Integer>();
        Assertions.assertNull(myQueue.poll());
        myQueue.add(1);
        Assertions.assertEquals((Integer)1,myQueue.poll());
        Assertions.assertEquals(0,myQueue.size());
    }
    @Test
    public void queueRemove(){
        myQueue = new LinkedBlockingQueue<Integer>();
        myQueue.add(1);
        Assertions.assertEquals((Integer)1,myQueue.remove());
    }

}
    //for later




























import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class MainTest {

     ArrayList<Integer> myList;
     Stack<Integer> myStack;
     LinkedList<Integer> myLinkedList;
     Queue<Integer> myQueue ;
     Set<Integer> mySet;
     HashMap<Integer,Integer> myMap;


   //ArrayListTesting I did these before the constraint on the assignment
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

    //SetTesting

    @Test
    public void setAdd(){
        mySet = new HashSet<Integer>();
        Assertions.assertTrue(mySet.add(1));
    }
    @Test
    public void setClear(){
        mySet = new HashSet<Integer>();
        mySet.add(1);
        mySet.add(2);
        mySet.clear();
        Assertions.assertEquals(0,mySet.size());
    }
    @Test
    public void setContains(){
        mySet = new HashSet<Integer>();
        mySet.add(1);
        Assertions.assertTrue(mySet.contains(1));
    }
    @Test
    public void setContainsAll(){
        mySet = new HashSet<Integer>();
        mySet.add(1);
        mySet.add(2);
        myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        Assertions.assertTrue(mySet.containsAll(myList));
    }
    @Test
    public void setIsEmpty(){
        mySet = new HashSet<Integer>();
        Assertions.assertTrue(mySet.isEmpty());
    }

    @Test
    public void seEquals(){
        mySet = new HashSet<Integer>();
        Set<Integer> mySet2 = new HashSet<Integer>();
        mySet.add(1);
        mySet2.add(1);
        Assertions.assertTrue(mySet.equals(mySet2));
    }
    @Test
    public void setRemove(){
        mySet = new HashSet<Integer>();
        mySet.add(1);
        Assertions.assertTrue(mySet.remove(1));
    }
    @Test
    public void setRetainsAll(){
        mySet = new HashSet<Integer>();
        Set<Integer> mySet2 = new HashSet<Integer>();
        mySet.add(1);
        mySet.add(2);
        mySet2.add(1);
        Assertions.assertTrue(mySet.retainAll(mySet2));
    }
    @Test
    public void setSize(){
        mySet = new HashSet<Integer>();
        mySet.add(1);
        Assertions.assertEquals(1,mySet.size());
    }

    //HashMapTesting

    @Test
    public void mapPut(){
        myMap = new HashMap<Integer, Integer>();
        Assertions.assertNull(myMap.put(0,1));
    }
    @Test
    public void mapGet(){
        myMap = new HashMap<Integer, Integer>();
        myMap.put(0,1);
        Assertions.assertEquals((Integer) 1,myMap.get(0));
    }
    @Test
    public void mapSize(){
        myMap = new HashMap<Integer, Integer>();
        myMap.put(0,1);
        Assertions.assertEquals(1,myMap.size());
    }
    @Test
    public void mapClear(){
        myMap = new HashMap<Integer, Integer>();
        myMap.put(0,1);
        myMap.clear();
        Assertions.assertEquals(0,myMap.size());
    }
    @Test
    public void mapContainsKey(){
        myMap = new HashMap<Integer, Integer>();
        myMap.put(0,1);
        Assertions.assertTrue(myMap.containsKey(0));
    }
    @Test
    public void mapContainsValue(){
        myMap = new HashMap<Integer, Integer>();
        myMap.put(0,1);
        Assertions.assertTrue(myMap.containsValue(1));
    }
    @Test
    public void mapRemove(){
        myMap = new HashMap<Integer, Integer>();
        myMap.put(0,1);
        //@Since API error, Don't know what it was.
        Assertions.assertTrue(myMap.remove(0,1));
    }
    @Test
    public void mapIsEmpty(){
        myMap = new HashMap<>();
        Assertions.assertTrue(myMap.isEmpty());
    }
    @Test
    public void mapReplace(){
        myMap = new HashMap<>();
        myMap.put(0,1);
        Assertions.assertTrue(myMap.replace(0,1,2));
    }
    @Test
    public void mapEquale(){
        myMap = new HashMap<>();
        myMap.put(0,1);
        HashMap<Integer,Integer> myMap2 = new HashMap<>();
        myMap2.put(0,1);
        Assertions.assertTrue(myMap.equals(myMap2));
    }
    @Test
    public void mapCompute(){
        myMap = new HashMap<>();
        myMap.put(0,1);
        Assertions.assertEquals((Integer)2,myMap.compute(0,(k, v) -> v==null ? 1: ++v));
    }
}





























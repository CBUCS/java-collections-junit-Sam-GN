import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class MainTest {

     ArrayList<Integer> myList;
     Stack<Integer> myStack;
     LinkedList<Integer> myLinkedList;
     Queue<Integer> myq = new LinkedBlockingQueue<Integer>();  


     @BeforeEach
     public void doStuff(){
         myList = new ArrayList<Integer>();
     }

    @Test
    public void notNull(){
        myList = new ArrayList<Integer>();
        Assertions.assertNotNull(myList);

        myStack = new Stack<Integer>();
        Assertions.assertNotNull(myStack);

        myLinkedList = new LinkedList<Integer>();
        Assertions.assertNotNull(myLinkedList);

    }

    @Test
    public void add() {
        myList = new ArrayList<Integer>();
        Assertions.assertTrue(myList.add(1));

        myStack = new Stack<Integer>();
        Assertions.assertTrue(myStack.add(1));

        myLinkedList = new LinkedList<Integer>();
        Assertions.assertTrue(myLinkedList.add(1));
    }

    @Test
    public void contains(){
        myList = new ArrayList<Integer>();
        myList.add(1);
        Assertions.assertTrue(myList.contains(1));

        myStack = new Stack<Integer>();
        myStack.add(1);
        Assertions.assertTrue(myStack.contains(1));

        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(1);
        Assertions.assertTrue(myLinkedList.contains(1));

    }

    @Test
    public void size(){
        myList = new ArrayList<Integer>();
        myList.add(1);
        Assertions.assertEquals(1,myList.size());

        myStack = new Stack<Integer>();
        myStack.add(1);
        Assertions.assertEquals(1,myStack.size());

        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(1);
        Assertions.assertEquals(1,myLinkedList.size());
    }

    @Test
    public void remove() {
        myList = new ArrayList<Integer>();
        myList.add(1);
        Assertions.assertEquals((Integer) 1,myList.remove(0));

        myStack = new Stack<Integer>();
        myStack.add(1);
        Assertions.assertEquals((Integer) 1,myStack.pop());

        myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(1);
        Assertions.assertEquals((Integer) 1,myLinkedList.remove(0));
    }

}

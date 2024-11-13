package dkit.oop;                   // Nov 2024

// A Queue is a data structure that permits us to
// add elements in at one end (the back) and remove them from the other end (the front).
// This is known as a First-In First-Out Queue (FIFO)
//
// We can use a number of different collection classes to implement a Queue,
// such as an ArrayList and LinkedList but the Java documentation
// recommends the use of and ArrayDeque for speed.
//
// We use the Interface type called Queue to describe the set of operations that
// a Queues should offer. add(), remove(), element() to peek at the next value.
// So, references of type Queue are normally used to refer to queue implementation classes.
// The order of elements in a Queue is normally LIFO. But other implementations are possible
// (Priority Queue, Stack(FIFO)
//
// In this sample we choose the ArrayDeque class as the underlying concrete class.
// This will behave as a FIFO Queue, as elements are added at the tail, but are
// removed from the head.
//
// The order of elements in a Queue is chronological - i.e. the order that they
// were inserted in FIFO - First In, First Out

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class App{

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    public void start() {

        // Implememting a queue using a LinkedList
        Queue<Integer> queue = new LinkedList<Integer>();

        // Because ArrayDeque implements the Queue interface in the Java Collection Framework,
        // we could alternatively implement our queue using an ArrayDeque.
        //Queue<Integer> queue = new ArrayDeque<Integer>();

        // Because our reference is of type Queue, we can only call
        // methods relevant to a queue - add() , remove(), element()
        // All three throw Exceptions on failure.


        // Add elements to the queue (at the tail)
        queue.add(7); // int types converted to "Integer" types (autoboxing)
        queue.add(11);
        queue.add(13);
        queue.add(3);
        queue.add(5);

        // Display contents of the queue.
        System.out.println("Contents of Queue:");
        display( queue );


        // To remove the head of queue. (i.e. the first element entered - FIFO)
        // Here, the first element added was 7, so it should be the first one out.
        int element = queue.remove();  // return and remove head element (from head of queue)
        System.out.println("Removing an element from the head of Queue. Element = " + element);
        display( queue );

        // We can PEEK at or EXAMINE the next element at the head of the queue
        // using the method: element()
        // That is, we can get access to the head element of the queue
        // while NOT removing it from the queue.
        int head = queue.element();     // queue.peek() will also work
        System.out.println("Peek at the head element of queue.  Element = " + head);
        display(queue);

        int size = queue.size();
        System.out.println("Size of queue (i.e Number of elements currently in the queue) = " + size);

        // Remove all remaining elements from queue
        System.out.println("Removing all remaining elements from the queue: ");
        System.out.println("The Queue contents is displayed after each element is removed.");
        while( !queue.isEmpty() ) {
            queue.remove(); // remove current head
            display(queue);  // display all queue elements each time
        }

        if( queue.isEmpty() )
            System.out.println("The queue is now empty.");

        // If we try to remove an element from an empty queue, an Exception is thrown.
        // Try uncommenting th eline below, and run the program again.
         // queue.remove();

        //TODO
        // Q1.
        // Add code to create a second queue "queueNames" to store names. (type String)
        // Populate the queue with 3 names (not in alphabetical order).
        // Display all elements in the queue (by calling display() )
        // Remove two elements from the front/head of the queue.
        // Display all elements.
        // Add 2 more names to the queue.
        // Display all elements
        // Write a while loop to remove() and output all the elements.

        //TODO
        // Q.2
        // Create a Student class - name and age fields.
        // Create a queue using ArrayDeque implementation for Student objects
        // and populate it with two new Student objects.
        // Display all elements using displayStudents() - write the method.
        // Add 2 more Students
        // Write a while loop to remove and display remaining elements
        // after each removal.
    }

    /**
     * Display all elements from a Queue (from head to tail)
     * Note that the parameter "queue" is of interface type Queue,
     * so, this method can accept any collection as long as implements the
     * Queue interface.
     * @param queue a Queue structure
     */
    public void display( Queue<Integer> queue ) {
        System.out.print("Queue = head=>");
        for( Integer number : queue ){   //iterate through teh queue
            System.out.print(number.toString() + "," );
        }
        System.out.println( "<= tail.");
    }
}

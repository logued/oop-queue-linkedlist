package dkit.oop;                   // Feb 2023

// A Queue is a data structure that permits us to
// add elements in at one end and remove them from the other end.
// This is known as a First-In First-Out Queue (FIFO)
//
// We can use a number of different collection classes to implement a Queue,
// such as an ArrayList, a LinkedList and so on.
//
// We use the Interface type called Queue to describe the set of operations that
// a Queues should offer. add(), remove(), element() to peek at the next value.
// So, references of type Queue are normally used to refer to queue implementation classes.
// The order of elements in a Queue is normally LIFO. (But other implementations are possible
// (Priority Queue, Stack(FIFO) )
//
// In this sample we choose the LinkedList class as the underlying concrete class.
// This will behave as a FIFO Queue, as elements are added at the tail, but are
// removed from the head. A LinkedList is a very good structure for a FIFO queue
// implementation
//
// The order of elements in a Queue is chronological - i.e. the order that they
// were inserted in FIFO - First In, First Out

import java.util.LinkedList;
import java.util.Queue;

public class App{

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    public void start() {

        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
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
        int element = queue.remove();  // return and remove head element
        System.out.println("Element removed from head of Queue is: " + element);
        display( queue );

        // We can PEEK or EXAMINE at the next element to be removed from the queue,
        // That is, we can get the head of queue but NOT remove it from the queue.
        int head = queue.element(); // queue.peek() will also work
        System.out.println("Peek at the head element of queue = " + head);
        display(queue);

        int size = queue.size();
        System.out.println("Size of queue (i.e Number of elements currently in the queue) = " + size);

        // Remove all remaining elements from queue
        System.out.println("Removing all remaining elements from the queue: ");
        System.out.println("Queue is displayed after each element is removed.");
        while( !queue.isEmpty() ) {
            Integer value = queue.remove(); // get and remove current head
            display(queue);
        }

        if( queue.isEmpty() )
            System.out.println("The queue is now empty.");

        // If we try to remove an element from an empty queue, an Exception is thrown.  Try uncommenting it.
        // queue.remove()

        //TODO
        // Q1.
        // Add code to create a second queue "queueNames" to store names. (String)
        // Populate the queue with 3 names (not in order).
        // Display all elements in the queue (by calling display() )
        // Remove two elements from the queue.
        // Display all elements.
        // Add 2 more names to the queue.
        // Display all elements
        // Write a while loop to remove() and output all the elements.

        //TODO
        // Q2.
        // Change the class type of the original concrete queue-implementation class
        // from LinkedList to ArrayDeque. The program should run as before.
        // An ArrayDeque is implemented using an array that is "double ended", meaning
        // elements can be added/removed from both ends.
        //
        // In terms of Big-O Time Complexity
        // Explain the implications of this change to the underlying data structure in terms
        // of Time Complexity (Big-O) and Space Complexity.

        //TODO
        // Create a Student class - name and age fields.
        // Create a queue using LinkedList implementation for Student objects
        // and populate it with two new Student objects.
        // Display all elements using display()
        // Add 2 more Students
        // Write a while loop to remove and display remaining elements
        // after each removal.
    }

    public void display( Queue queue ) {
        System.out.print("Queue = head=>");
        for( Object object : queue ){   // use Object to deal with any type of element
            System.out.print(object.toString() +"," );
        }
        System.out.println( "<= tail.");
    }
}

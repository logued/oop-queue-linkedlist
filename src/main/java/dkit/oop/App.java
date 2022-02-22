package dkit.oop;

// Java program to demonstrate a Queue.
// Queue is an Interface, so to instantiate a data structure that will implement a Queue
// we must choose a Class that implements the Queue interface (see Collections Framework diagram)
// In this sample we choose the LinkedList class.

// Order of elements in a Queue is chronological - i.e. the order that they were inserted in
// FIFO - First In, First Out

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
        int element = queue.remove();  // return and remove head element

        System.out.println("Contents of queue is now:");
        display( queue );

        // To get (return) the head of queue but NOT remove it
        int head = queue.peek();
        System.out.println("peek() - head of queue = " + head);

        int size = queue.size();
        System.out.println("Size of queue (i.e Number of elements currently in the queue) = " + size);

        // Remove all remaining elements from queue
        System.out.println("Removing all remaining elements from queue:)");
        while( !queue.isEmpty() ) {
            Integer value = queue.remove();
            System.out.println(value);
        }

        if(queue.isEmpty())
            System.out.println("The queue is now empty");

        // If we try to remove an element from an empty queue, an Exception is thrown.  Try uncommenting it.
        //queue.remove()

        //TODO
        // Q1.
        // Add code to create a second queue "queueNames" to store names. (String)
        // Populate the queue with 3 names (not in order).
        // Display all elements in the  (by calling display() )
        // Remove two elements from the queue.
        // Display all elements.
        // Add 2 more names to the queue.
        // Display all elements
        // Write a while loop to remove() and output all the elements. (see display())

        //TODO
        // Q2.
        // Change the class type of the original queue
        // from LinkedList to ArrayDeque. in terms of Time Complexity O()
        // The program should run as before.
        // Explain the implications of this change to the underlying data structure in terms
        // of Time Complexity ( Big-O) and Space Complexity.

        //TODO
        // Create a Student class - name and age fields.
        // Create a queue for Student objects and populate it with 2 students
        // Display all elements using display()
        // Add 2 more Students
        // While loop - to remove and display all elements

    }

    public void display( Queue queue ) {
        for( Object object : queue ){
            System.out.println(object.toString() );
        }

    }
}

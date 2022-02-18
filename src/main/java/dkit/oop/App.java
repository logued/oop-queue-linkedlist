package dkit.oop;

// Java program to demonstrate a Queue
// Queue is an Interface, so to create a data structure that will implement a Queue
// we must choose a Class that implements the Queue interface (see Collections Framework diagram)
// In this sample we choose the LinkedList class

// Order of elements in a Queue is chronological - i.e. the order that they were inserted in
// FIFO - First In, First Out

import java.util.LinkedList;
import java.util.Queue;

public class App{

    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to the queue
        for (int i = 0; i < 5; i++)
            q.add(i);                   // int types converted to Integer types (autoboxing)

        // Display contents of the queue.
        System.out.println("Elements of queue: "  + q.toString());

        // To remove the head of queue.
        int element = q.remove();  // return and remove head element
        System.out.println("remove() - removed element = " + element);

        System.out.println(q);

        // To get (return) the head of queue but NOT remove it
        int head = q.peek();
        System.out.println("peek() - head of queue = " + head);


        int size = q.size();
        System.out.println("Size of queue (i.e Number of elements currently in the queue) = " + size);
    }
}

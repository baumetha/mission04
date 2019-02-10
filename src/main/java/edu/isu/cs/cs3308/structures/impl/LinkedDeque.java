package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Deque;
import edu.isu.cs.cs3308.structures.Queue;
/**
 * @author Ethan Baumgartner
 * Deque class that extends off a LinkedQueue
 */
public class LinkedDeque<E> extends LinkedQueue<E> implements Deque<E> {

    public LinkedDeque(){
        list = new DoublyLinkedList<>();
    }

    /**
     * @return The value of the last element of the deque (without removing it),
     * or null if the deque is empty.
     */
    public E peekLast(){
        if (list.isEmpty()){
            return null;
        }
        return list.last();
    }
    /**
     * Inserts the given element into the front of the deque, unless the
     * provided value is null.
     *
     * @param element Element to be inserted to the front of the deque, nothing
     * happens if the value is null.
     */
    public void offerFirst(E element){
        if (element == null){
            return;
        }
        list.addFirst(element);
    }

    /**
     * @return The value of the last item in the Deque and removes that value
     * from the deque, if the deque was empty null is returned.
     */
    public E pollLast(){
        if (list.isEmpty()){
            return null;
        }
       return list.removeLast();
    }
}

package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Deque;
import edu.isu.cs.cs3308.structures.RedBlueDoubleStack;

/**
 * RedBlueDoubleStack is a Doubly Ended Stack that has two colors representing the
 * ends. Red is the top of the DeStack and Blue is the Bottom.
 *
 * @author Ethan Baumgartner
 * @auhor Isaac Griffith
 * @param <E> The Type of element stored in the RedBlueDoubleStack.
 */
public class RedBlueDoubleStackImpl<E> implements RedBlueDoubleStack<E> {
    /**
     * Creates Dequeues with colors as seperators
     */
    LinkedDeque<E> red;
    LinkedDeque<E> blue;
    public RedBlueDoubleStackImpl(){
        red = new LinkedDeque<>();
        blue = new LinkedDeque<>();
    }

    /**
     * Adds the element to the top of the Red Stack, unless the element is null.
     *
     * @param element Element to add.
     */
    public void pushRed(E element){
        if (element == null){
            return;
        }
         red.offer(element);
    }

    /**
     * Adds the element to the top of the Blue Stack, unless the element is
     * null.
     *
     * @param element Element to add.
     */
    public void pushBlue(E element){
        if (element == null){
            return;
        }
        blue.offer(element);
    }

    /**
     * Removes the element at the top of the Red Stack and returns its value,
     * unless the Red Stack is empty.
     *
     * @return Element at the top of the Red Stack, or null if the Red Stack is
     * empty
     */
    public E popRed(){
        if (red.isEmpty()){
            return null;
        }
       return red.pollLast();
    }

    /**
     * Removes the element at the top of the Blue Stack and returns its value,
     * unless the Blue Stack is empty.
     *
     * @return Element at the top of the Red Stack, or null if the Blue Stack is
     * empty
     */
    public E popBlue(){
        if (blue.isEmpty()){
            return null;
        }
       return blue.pollLast();
    }

    /**
     * Returns the value at the top of the Red Stack.
     *
     * @return The value at the top of the Red Stack, or null if the Red Stack
     * is emtpy
     */
    public E peekRed(){
       return red.peekLast();
    }

    /**
     * Returns the value at the top of the Blue Stack.
     *
     * @return The value at the top of the Blue Stack, or null if the Blue Stack
     * is emtpy
     */
    public E peekBlue(){
        return blue.peekLast();
    }

    /**
     * @return Current size of the Blue Stack
     */
    public int sizeBlue(){
       return blue.size();
    }

    /**
     * @return Current size of the Red Stack
     */
    public int sizeRed(){
        return red.size();
    }

    /**
     * @return True if the Blue Stack is empty, false otherwise
     */
    public boolean isBlueEmpty(){
        return blue.isEmpty();
    }

    /**
     * @return True if the Red Stack is empty, false otherwise
     */
    public boolean isRedEmpty(){
        return red.isEmpty();
    }
}

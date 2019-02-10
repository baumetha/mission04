package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.structures.Deque;
import edu.isu.cs.cs3308.structures.Stack;
import edu.isu.cs.cs3308.structures.impl.LinkedDeque;

/**
 * @author Ethan Baumgartner
 * Merges to stacks using a deque
 * @author Isaac Griffith
 */
public class DequeStackMerge {

    /**
     * Merges the contents of the second stack (from) into the bottom of the
     * first stack (into) while preserving the order of the original stacks.
     * Note that if either stack is null, nothing happens.
     *
     * @param <E> Element type of the stacks
     * @param into Stack into which the other stack will be merged
     * @param from Stack which is merged into the bottom of the other stack.
     */
    public static <E> void dequeStackMerge(final Stack<E> into, Stack<E> from) {
        /**
         * Pops off the elements from both stacks and stores them in a temporary Deque with
         * the elements from the from stack under the elements in into, then pushes the last element to
         * the into stack until temp is empty
         */
        if (into == null || from == null){
            return;
        }
        LinkedDeque<E> temp = new LinkedDeque<>();
        while (into.size > 0()){
            temp.offer(into.pop());
        }
        while(from.size > 0()){
            temp.offer(from.pop());
        }
        while (tempDeque.size > 0()){
            into.push(temp.pollLast());
        }
    }
}
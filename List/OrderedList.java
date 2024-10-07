package List;

import java.util.*;

public class OrderedList<E> {

    /** Linked list containing the data for the ordered list */
    private LinkedList<E> theList;

    /** Default constructor for the ordered list */
    public OrderedList() {
        this.theList = new LinkedList<E>();
    }

    /**
     * Adds the obj passed to the function to the underlying linked list
     * 
     * @param obj
     */
    public void add(E obj) {
        this.theList.add(obj);
    }

    /**
     * Creates an iterator that can be used to traverse the ordered list
     * 
     * @return an iterator object that can be used to loop through the list
     */
    public Iterator<E> iterator() {
        return this.theList.iterator();
    }

    /**
     * Retrieves the object stored at the given index in the orderd list
     * 
     * @param index
     * @return the object at the given index
     */
    public E get(int index) {
        return this.theList.get(index);
    }

    /**
     * Gets the size of the ordered list
     * 
     * @return the size of the ordered list
     */
    public int size() {
        return this.theList.size();
    }

    /**
     * Removes the passed object from the ordered list
     * 
     * @param obj
     * @return true or false depending on whether the item is present in the list or
     *         not
     */
    public boolean remove(E obj) {
        return this.theList.remove(obj);
    }

    /**
     * Helper function to display the list in text form
     * 
     * @return return the list in string form
     */
    public String toString() {

        return this.theList.toString();
    }
}
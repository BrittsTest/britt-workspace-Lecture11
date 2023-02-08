import java.util.Scanner;

public class Driver {

    //Cool stuffs to know!!!

    /* 
     * Stack (class) - Last in First Out (LIFO). Undo - features, stack of books, ect. 
     * Queues - A data structure that are used when we want to add or remove something in a specific order. (FIFO) First in First Out
     *  - a line at a grocery store. 
     *      - pop(): functions like popping something off the top. 
     *      - push(): add to the front of an ArrayDeque
     *      - peekFirst() - returns the first element but does not remove it. 
     *      - peekLast() - returns but does not remove the last element
     *      - pollFirst() - returns the first element and removes it from the deque
     *      - pollLast() - returns the last element and remove it fromt he deque
     *      - addFirst() - adds the element to the front of the ArrayDeque
     *      - addLast() - adds the element to the end of the ArrayDeque. 
     * 
     * Sets - Not indexed, it not ordered. So order I insert the elements into the Set is guarenteed to be the order I get 
     * the values back, I cannot have duplicate values in a Set. 
     * 
     * 
     * 
     * 
     */
	
	public static void main(String[] args) {
		NumberSetService numServe = new NumberSetService();
		DictionaryService dictServe = new DictionaryService();
		Scanner sc = new Scanner(System.in);
		// numServe.setMenu(sc);
		dictServe.mapMenu(sc);
	}

}
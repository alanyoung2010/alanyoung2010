import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements List<T> {
	
	private class Node{
		Node next;
		Node prev;
		T data;
	}
	
	public LinkedList() {
		size = 0;
	}
	
	private Node head , tail ; // These are always the first and last nodes
	private int size; // This is the number of items in the list
	
	private Node movetopostion(int index) {
		Node n = head;
	    for (int i = 0; i <= index; ++i) {
	      n = n.next;
	    }
	    return n;
	}

	@Override
	// this is the same as addLast
	public void add(T item) {
		// TODO Auto-generated method stub
		addLast(item);
	}

	@Override
	// set all the fields to null , and size to 0
	public void clear() {
		// TODO Auto-generated method stub
		Node e = head.next;
	    while (e != head) {
	        Node next = e.next;
	        e.next = e.prev = null;
	        e.data = null;
	        e = next;
	    }
	    head.next = head.prev = head;
	    size = 0;
	}

	@Override
	// don ’t forget about nulls , can safely use :
	// ( data == item || ( data != null && data . equals ( item )))
	// could use a for - each loop over this
	public boolean contains(Object item) {
		// TODO Auto-generated method stub
		return indexOf(item) != -1;
	}
	
	@Override
	// one line : return size == 0;
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size ==0);
		//return false;
	}

	@Override
	// using indexOf ( Object ) this becomse the same as remove (int )
	public T remove(Object item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		// count the number of links in the list
	    int nItems = 0;
	    Node p = head;
	    while (p != null) {
	      nItems++;
	      p = p.next;
	    }
	    return nItems;
	}
	
	private class LinkedIterator implements Iterator<T>
	  {
	    // instance data member of ListIterator
	    private Node current;
	    
	    // constructors for ListIterator
	    public LinkedIterator()
	    {
	      current = head; // head in the enclosing list
	    }

	    public boolean hasNext()
	    {
	      return current != null;
	    }

	    public T next()
	    {
	      T ret = current.data;
	      current = current.next;
	      return ret;
	    }

	    public void remove() { /* omitted because optional */ }  

	  }// end class ListIterator

	@Override
	// See the guide on Iterable and Iterator
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new LinkedIterator();
		
	}

	@Override
	// if index is 0 or size , use addFirst or addLast
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		if(index < 0 || index> size) {
			throw new IndexOutOfBoundsException(index + "not found");
		}
		Node n = movetopostion(index-1);
		Node newNode = new Node();
		newNode.next = n.next;
		n.next = newNode;
		size++;
	}

	@Override
	// check index , then do a simple for loop
	public T get(int index) {
		// TODO Auto-generated method stub
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node n = movetopostion(index);
	    return n.data;
	}

	@Override
	// can use a for - each loop over this , return the first occurence
	public int indexOf(Object item) {
		// TODO Auto-generated method stub
		// sequential search
	    int pos = 0;       // position of current link in the list
	    Node p = head;
	    while (p != null) {
	      if (p.data.equals(item)) {
	        return pos;
	      }
	      p = p.next;
	      pos++;
	    }
	    return -1;
	}

	@Override
	// using indexOf ( Object ) this becomse the same as remove (int )
	public T remove(int index) throws IndexOutOfBoundsException {
	    if (index < 0 || index >= size) {
	        throw new IndexOutOfBoundsException();
	    } 
	    else 
	    	{
	       T removed = head.data;
	       head = head.next;
	       size--;
		    return removed;
	    	}
	    }
	

	/**
	 * @return the first item in this linked list
	 * @throws NoSuchElementException
	 *             if this linked list is empty
	 */
	// this can throw an exception if the list is empty
	public T getFirst() throws Exception {
		// TODO method stub
		if(head==null) {
			throw new Exception("No item found");
		}
		return head.data;
	}

	/**
	 * @return the last item in this linked list
	 * @throws NoSuchElementException
	 *             if this linked list is empty
	 */
	// this can throw an exception if the list is empty
	public T getLast() throws Exception {
		// TODO method stub
		if (head == null) {
            throw new Exception("No elements found in Linked List");
        }
 
        Node temp = head;
 
        // The while loop takes us to the tail of the Linked
        // List
        while (temp.next != null) {
            temp = temp.next;
        }
 
        // Returns the last element
        return temp.data;
	}

	/**
	 * Adds 'item' to front of this linked list
	 * 
	 * @param item
	 */
	// if index is 0 or size , use addFirst
	public void addFirst(T item) {
		// TODO method stub
		head = new Node();
	}

	/**
	 * Adds 'item' to the end of this linked list
	 * 
	 * @param item
	 */
	//if index is 0 or size, use addlast
	public void addLast(T item) {
		// TODO method stub
		if( head == null)
	         addFirst(item);
	      else
	      {
	         Node tmp = head;
	         while(tmp.next != null) tmp = tmp.next;

	         tmp.next = new Node();
	      }
	}

	/**
	 * Removes and returns the first item from this linked list
	 * 
	 * @return
	 * @throws NoSuchElementException
	 *             if this linked list is empty
	 */
	// special case if size is 1
	public T removeFirst() {
		// TODO method stub
		if (size == 0) {
		      throw new NoSuchElementException("List");
		    }
		    Node n = head.next;
		    T data = n.data;
		    head.next = n.next;
		    --size;
		    return data;
	}

	/**
	 * Removes and returns the last item from this linked list
	 * 
	 * @return
	 * @throws NoSuchElementException
	 *             if this linked list is empty
	 */
	// special case if size is 1
	public T removeLast() {
		// TODO method stub
		if (size == 0) {
		      throw new NoSuchElementException("List");
		    }
		    Node n = tail.prev;
		    T data = n.data;
		    tail.prev = n.prev;
		    --size;
		    return data;
		//return null;
	}
}



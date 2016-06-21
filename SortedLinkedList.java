//Name: Nick Curinga
//Date: 10/15/2014


/*
 * This class has functions to sort data of any type using the singly linked
 * list data structure.
 */
public class SortedLinkedList {

	/*
	 * This field represents the first element in the linked list.
	 */
	private Node head;
    
	 
	 
    /*
     * The constructor sets the head to null signifying that it is empty.
     */
	public SortedLinkedList() {
		head = null;
	}

    
	/*
	 * @param Comparable
	 * @return Node
	 * This method accepts data of kind and returns the previous node address as well
	 * as determines where to place in the linked list.
	 */
	
	public Node appropriatePosition(Comparable d) 
     {
        Node previous, current;
        previous = null;
        current = head;
        while(current != null)
        {
        	if(current.data.compareTo(d) >= 0) {
        		
        		return previous;
        	}
        	    previous = current;
        		current = current.next;
        	
        }
        return previous;
        
     }
	 
	 /*
	  * @param Comparable 
	  * @return Node
	  * This method accepts any type of data and uses the appropriatePosition method
	  * to insert the Node into the correct position in the Linked list. 
	  */
	
	 public Node insert(Comparable d) {
	      Node ap = appropriatePosition(d);
	      if(ap == null || ap.data.compareTo(d) == 1) 
	      {
	    	  head = new Node(d,ap);
	    	  return head;
	      }
	      
	      ap.next = new Node(d,ap.next);
	      return head;

	    }
	 /*
	  * @return Comparable
	  * This method returns the smallest data in the Linked list.
	  * Since the list is sorted it simply returns the first positions data.
	  */

	public Comparable smallest() {
	  if(head == null) 
		  return null;
	  else
		return head.data;
	  
      }

	/*
	 * @return Comparable
	 * This method returns the largest data in the Linked list.
	 * Since the list is sorted it simply returns the last position data.
	 */

	public Comparable largest() {
	  Node current = head;
	  if(head == null)
	  {
		  return null;
	  }
		  
	  while(current != null) {
		  current = current.next;
		  if(current.next == null)
		  {
			  return current.data; 
		  }
	  }
	  return null;
	}

	/*
	 * @param Comparable
	 * @return Node
	 * This method searches for a Node position by locating its data.
	 */

	public Node find(Comparable d) {
       Node current = head;
       Node previous = head;
       while(current != null) {
    	   
    	   if(d.compareTo(current.data) == 0) 
    	   {
    		   return previous; 
    	   }
    	   previous = current;
    	   current = current.next;
       }
       return previous;
	}

	
	/*
	 * @param Comparable
	 * This method his the find method to delete elements from the Linked list.
	 * 
	 */

	public void delete(Comparable d) 
	{
	Node find = find(d);
	

	if(find == null)
	{
	  System.out.println("Not found");
	}
	if(find == head)
	{
	  head = head.next;	
	}
	else 
	{
		find.next = find.next.next;
	}
  }
     
	/*
	 * This method prints the Linked list by looping through the links.
	 */

	public void print() {
     
       Node current = head;
       for(current = head; current != null; current = current.next) {
    	   System.out.println(current.data);
       }
     }
	/*
	 * This method sets the head equal to null signifying that the 
	 * Linked list is empty.
	 */
	
	public void clear() {
	   head = null;  
	   
	}
	
	/*
	 * @return boolean
	 * This method returns true or false depending on the state of the Linked list.
	 */

	public boolean empty() 
     { 
       if(head == null) 
         return true;
       else 
         return false;
     }

}
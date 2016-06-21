//Name: Nick Curinga
//Date: 10/15/2014




import java.util.InputMismatchException;
import java.util.Scanner;


public  class DistanceTest {


	private Scanner kb;
	private SortedLinkedList sl;
	private Distance d;
	private boolean go;
	
	 
	
	
	public DistanceTest() {
	  sl = new SortedLinkedList();
	  kb = new Scanner(System.in);
	  input();
	}
	
	
	
	
	public void input() {
	    go = true;
	    int option;
	    int data1;
	    int data2;
	    
	    data1 = 0;
	    data2 = 0;
		option = 0;  
	  
	    System.out.println("For insertion and deletion select your own data.");
	    
         while(go) {
			System.out.println("1.Insert 2.Delete 3.Clear 4.Smallest 5.Largest 6.Exit ");
			
			
		       
			try {
			  option = kb.nextInt();
			}catch(InputMismatchException e) {
				 System.out.println("Incorrect Data");
				 kb.next();
			}
			  
			
			 	 
			
	    	Comparable smallest;
		    Comparable largest;
		
		  switch (option)
		  {
		    case 1:
		       
		    	try {
					data1 = kb.nextInt();
					data2 = kb.nextInt();
					d = new Distance(data1,data2);
					   sl.insert(d);
					   sl.print();
					   
				  
				  }catch(InputMismatchException e) {
					 System.out.println("Incorrect Data");
					 kb.next();
				  }  
		    	break;
	           
			   
		     case 2:
			   
		    	 try {
						data1 = kb.nextInt();
						data2 = kb.nextInt();
						d = new Distance(data1,data2);
						   sl.delete(d);
						   sl.print();
						  
					  
					  }catch(InputMismatchException e) {
						 System.out.println("Incorrect Data");
						 kb.next();
					  }catch(NullPointerException e) {
						  
					  }
		    	 break;
			   
			   
		   case 3: 
		       sl.clear();
		       sl.print();
		       break;
		       
		   case 4: 
			   smallest = sl.smallest();
			   System.out.println(smallest.toString());
		       break;
		       
		   case 5: 
		       largest = sl.largest();
		       System.out.println(largest.toString());
			   break;
			   
		   case 6:
			   System.exit(0);
		       break;
		  }
	    }
         
	}
	}

       
       
	

	
	 



public class Node {

	public Node next;
	public Comparable data;
	
	
	public Node(Comparable d,Node l) {
		next = l;
		data = d;
	}
	
	public void setNext(Node l) {
		next = l;
	}
	public void setData(Comparable d) {
		data = d;
	}
	public Node getNext() {
		return next;
	}
	public Comparable getData() {
		return data;
	}
	
		
}

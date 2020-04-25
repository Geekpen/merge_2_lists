package mergeLists;

public class solution {

	public static void main(String[] args) {
		Node head1 = new Node(1);
		head1.next = new Node(3);
		head1.next.next = new Node(5);
		head1.next.next.next = new Node(7);
		head1.next.next.next.next = new Node(9);
		
		Node head2 = new Node(0);
		head2.next = new Node(2);
		head2.next.next = new Node(4);
//		head2.next.next.next = new Node(6);
//		head2.next.next.next.next = new Node(8);
		
		Node revd = mergeLists( head1,  head2);
		printList(revd);
		
		

	}
	
	public static void printList(Node head) {
		while(head!= null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static Node reverseList(Node head) {
		Node prev = null;
		while(head != null) {
			Node nextNode = head.next;
			head.next = prev;
			prev = head;
			head = nextNode;
		}
		return prev;
	}
	
	public  static Node mergeLists(Node head1, Node head2) {
		Node head = new Node(0);
		Node p = head;
		Node p1 = head1;
		Node p2 = head2;
		while(p1!=null && p2!=null){
	        if(p1.data < p2.data){
	            p.next = p1;
	            p1 = p1.next;
	        }else{
	            p.next = p2;
	            p2 = p2.next;
	        }
	        p=p.next;
	    }
		
		if(p1!=null){
	        p.next = p1;
	    }
	 
	    if(p2!=null){
	        p.next = p2;
	    }
	    
		return reverseList(head.next);
	}

}

public class linklist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    // using floyd's cycle detection Algorithms
   public static Node head;
   public static boolean isCycle(){
  // initialise node
  
  Node slow= head;
  Node fast = head;
   while(fast != null && fast.next != null){
    slow = slow.next; //+1
    fast = fast.next.next; //+2
    if(slow == fast){
        return true; // cycle is found
    }
}
    return false; // cycle not found
   
}
    
    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4); // it is linked list 1-2-3-null
       // head.next.next.next.next = head; // it is a cycle 1-2-3-4-1
        System.out.println(isCycle());

    }
}

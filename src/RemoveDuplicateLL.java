//this method will work only with the sorted linked list


import java.util.LinkedList;

public class RemoveDuplicateLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public static Node removeDuplicate(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node current = head;
        while(current.next!=null){
            if(current.data==current.next.data){
                current.next = current.next.next;
            }else{
                current=current.next;
            }
        }return head;

    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(3);
        ll.add(3);
        ll.add(4);
        ll.add(4);
        ll.add(5);
        System.out.println(ll);

    }
}

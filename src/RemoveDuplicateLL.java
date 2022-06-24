//this method will work only with the sorted linked list


import java.util.LinkedList;

public class RemoveDuplicateLL {

   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    //method to remove the duplicate nodes from a sorted linked list
    public static Node removeDuplicate(Node head){
        //if the head is null or its next then it will return head
        if(head==null||head.next==null){
            return head;
        }
        //will need a current node to traverse as head cannot be updated over and over
        Node current = head;
        //until current reaches zero
        while(current.next!=null){
            //if in between the data of two consecutive nodes is equal
            if(current.data==current.next.data){
                //update the next of current with next.next
                current.next = current.next.next;
            }
            //if data are not equal then simply move forward to next
            else{
                current=current.next;
            }
        }// at the end it will retrun head
        return head;

    }

    public static void printll(Node ll){
        while(ll!=null){
            System.out.println(ll.data);
            ll = ll.next;

        }


    }
    static Node head;
    public static void main(String[] args) {

      RemoveDuplicateLL ll = new RemoveDuplicateLL();
      ll.head = new Node(10);
        ll.head.next = new Node(10);
        ll.head.next.next = new Node(11);


      printll(head);
        System.out.println(" ");
      removeDuplicate(head);
      printll(head);



    }

}

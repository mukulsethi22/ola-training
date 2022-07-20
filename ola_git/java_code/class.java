

class Node{
    Node next;
    private int value;
    Node(int value){
        this.data = value;
        // this.next = null
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        head = null;
    }
    public void insert_beg(int value){
        Node newNode = new Node(value);
        if(head==null)
        head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void delete_beg(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            head = head.next;
        }
    }

    public void traverse(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void show(Node node){
        System.out.println(node.data);
    }
}

public class assgn(){
 public static void main(String[] args){

 }
}


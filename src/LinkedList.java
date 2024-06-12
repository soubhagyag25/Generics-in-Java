class Node{
    int data;
    Node next; // it is a  reference variable i.e it will store the address
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class LinkedList
{
    public static void main(String[] args) {
        Node obj1=new Node(10);
        Node obj2=new Node(20);
        Node obj3=new Node(30);
        Node obj4=new Node(40);
        obj1.next=obj2; // now obj1 stores the address of obj2
        obj2.next=obj3;
        obj3.next=obj4;
        Node head=obj1;// created an another pointer of Node class type, which will store the address of object1
        System.out.println(obj1.next);
        System.out.println(obj1.data);



    }
}

package Collections;

import java.util.Scanner;

class LinkedList {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node obj = new Node(data);
        if (head == null) {
            head = tail = obj;
        } else {
            tail.next = obj;
            tail = obj;
        }
    }

    public void insertionatbeg(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void insertionatend(int data) {
        add(data);
    }

    public void insertatparticularindex(int index, int data) {
        if (index < 0) {
            System.out.println("Index cannot be negative.");
            return;
        }
        Node newNode = new Node(data);
        if (index == 0) {
            insertionatbeg(data);
            return;
        }
        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Index is out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
        display();
    }

    public void deleteatbeg() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        display();
    }

    public void deleteatend() {
        System.out.println("Deleting element from the end...");
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }
        if (current == tail) {
            head = tail = null; // Only one element in the list
            System.out.println("Deleted the last element: " + current.data);
            return;
        }
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
        System.out.println("Deleted the last element: " + tail.data);
        display();
    }

    public void deleteatparticularindex(int index) {
        if (index < 0) {
            System.out.println("Index cannot be negative.");
            return;
        }
        if (index == 0) {
            deleteatbeg();
            return;
        }
        Node current = head;
        Node previous = null;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            previous = current;
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Index is out of bounds.");
            return;
        }

        previous.next = current.next;
        if (current.next == null) {
            tail = previous;
        }
        display();
    }

    public void deletebyvalue(int value) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.data == value) {
            deleteatbeg();
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != value) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found in the list.");
            return;
        }

        previous.next = current.next;

        if (current.next == null) {
            tail = previous;
        }

        display();
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter in the LinkedList:");
        int ele = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < ele; i++) {
            int el = sc.nextInt();
            list.add(el);
        }
        int input = 0;
        while (input != 6) {
            System.out.println("Press 1 for Insertion at the beginning");
            System.out.println("Press 2 for Insertion at the end");
            System.out.println("Press 3 for insertion at a particular index");
            System.out.println("Press 4 to display the elements");
            System.out.println("Press 5 to delete an element");
            System.out.println("Press 6 to exit");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter the element");
                    int begele = sc.nextInt();
                    list.insertionatbeg(begele);
                    list.display();
                    break;
                case 2:
                    System.out.println("Enter the element");
                    begele = sc.nextInt();
                    list.insertionatend(begele);
                    list.display();
                    break;
                case 3:
                    System.out.println("Enter the index number");
                    int index = sc.nextInt();
                    System.out.println("Enter the value");
                    int elem = sc.nextInt();
                    list.insertatparticularindex(index, elem);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Press 1 for Deletion at the beginning");
                    System.out.println("Press 2 for Deletion from the end");
                    System.out.println("Press 3 for Deletion at a particular index");
                    System.out.println("Press 4 for Deletion by value");
                    int inp2 = sc.nextInt();
                    switch (inp2) {
                        case 1:
                            list.deleteatbeg();
                            break;
                        case 2:
                            list.deleteatend();
                            break;
                        case 3:
                            System.out.println("Enter the index number");
                            int input2 = sc.nextInt();
                            list.deleteatparticularindex(input2);
                            break;
                        case 4:
                            System.out.println("Enter the value");
                            int value = sc.nextInt();
                            list.deletebyvalue(value);
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
        sc.close();
    }
}

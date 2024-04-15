class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Insert at the beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

  // Delete at the beginning
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        head = head.next;
    }

    // Delete at the end
    void deleteAtEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete at a specific position
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }

    
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        
        

        
        // Inserting at the beginning
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(5);
        linkedList.insertAtBeginning(40);
        linkedList.insertAtBeginning(50);
        

        // Inserting at the end
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);

        // Inserting at a specific position
        linkedList.insertAtPosition(15, 2);

        // Displaying the linked list
        linkedList.display();

        linkedList.deleteAtPosition(3);
        linkedList.display();
        
        linkedList.deleteAtBeginning();
        linkedList.display();
        

           linkedList.deleteAtEnd();
           linkedList.display();
           

        
        



        




        
    }
}
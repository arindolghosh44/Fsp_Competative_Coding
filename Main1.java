class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    DoublyLinkedList() {
        this.head = null;
    }

    // Insert at the beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at the end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Insert at a specific position
    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            insertAtBeginning(data);
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
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete at the beginning
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Delete at the end
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    // Delete at a specific position
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (position == 0) {
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        for (int i = 0; i < position && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        if (temp.next == null) {
            temp.prev.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    // Display the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main1 {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // Inserting at the beginning
        doublyLinkedList.insertAtBeginning(10);
        doublyLinkedList.insertAtBeginning(5);
        doublyLinkedList.insertAtBeginning(20);
        doublyLinkedList.insertAtBeginning(50);
        

        // Inserting at the end
        doublyLinkedList.insertAtEnd(20);
        doublyLinkedList.insertAtEnd(30);

        // Inserting at a specific position
        doublyLinkedList.insertAtPosition(15, 2);

        // Displaying the linked list
        doublyLinkedList.display();

        // Deleting at the beginning
        doublyLinkedList.deleteAtBeginning();
        doublyLinkedList.display();

        // Deleting at the end
        doublyLinkedList.deleteAtEnd();
        doublyLinkedList.display();

        // Deleting at a specific position
        doublyLinkedList.deleteAtPosition(1);
        doublyLinkedList.display();
    }
}
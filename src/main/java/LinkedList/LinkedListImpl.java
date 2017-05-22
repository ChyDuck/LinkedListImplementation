package LinkedList;

public class LinkedListImpl {

    private Node head;
    private Node tail;

    public void add(int value){
        Node node = new Node(value);

        if (head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            tail.next = node;
            tail = node;
        }
    }

    public void printAllItems(){

        Node node = head;

        while (node != null)
        {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public void removeTail(){

        Node node = head;
        Node previous = null;

        while (node != null)
        {
            if(node.next != null){
                previous = node;
            }else{

                tail = previous;
                tail.next = null;

                break;
            }

            node = node.next;
        }

        printAllItems();
    }

    public void removeGreaterThanValue(int value){

        Node node = head;
        Node previous = null;

        while (node != null){

            if(node.value > value) {
                if (node == head) {
                    head = head.next;

                    node = head;
                }else{
                    previous.next = node.next;

                    node = previous.next;
                }
            }else{
                previous = node;

                node = node.next;
            }
        }

        printAllItems();
    }

    private class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
    }
}

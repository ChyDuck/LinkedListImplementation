import LinkedList.LinkedListImpl;

import java.util.Random;

public class main {
    public static void main(String[] args) {

        LinkedListImpl linkedList = new LinkedListImpl();

        Random random = new Random(100);

        int length = random.nextInt();

        //Append an element into the LinkedList
        for (int i = 1; i < length; i++){
            linkedList.add(i);
        }

        System.out.println("All items\n");

        linkedList.printAllItems();

        System.out.println("Remove the tail element from a LinkedList\n");

        linkedList.removeTail();

        System.out.println("Remove all element in the LinkedList that is great than a target value\n");

        linkedList.removeGreaterThanValue(random.nextInt());
    }
}

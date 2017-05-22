import LinkedList.LinkedListImpl;

import java.util.Random;

public class main {
    public static void main(String[] args) {

        LinkedListImpl linkedList = new LinkedListImpl();

        Random random = new Random();

        int from = 10;
        int to = 20;

        int differenceBothRange = to - from;

        int length = random.nextInt(differenceBothRange) + from;

        int value;

        //Append an element into the LinkedList
        for (int i = 1; i < length; i++){

            value = random.nextInt(to);

            linkedList.add(value);
        }

        System.out.println("All items\n");
        linkedList.printAllItems();

        System.out.println("");
        System.out.println("Remove the tail element from a LinkedList\n");
        linkedList.removeTail();

        System.out.println("");
        System.out.println("Remove all element in the LinkedList that is great than a target value\n");

        int targetValue = random.nextInt(from);

        System.out.println("targetValue: " + targetValue + "\n");

        linkedList.removeGreaterThanValue(targetValue);
    }
}

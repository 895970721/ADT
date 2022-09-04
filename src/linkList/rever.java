package linkList;

import linkList.subject.LinkedListReverser;

import java.util.Arrays;

public class rever {
    public static void main(String[] args) {
        LinkedListCreator linkedListCreator = new LinkedListCreator();
        Node node3 = linkedListCreator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        LinkedListReverser linkedListReverser = new LinkedListReverser();

        Node res3 = linkedListReverser.reverserLinkedList3(node3);
        linkedListCreator.printList(res3);
    }
}


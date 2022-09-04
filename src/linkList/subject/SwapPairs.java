package linkList.subject;

import linkList.Node;

/**
 * 两两交换链表中的节点
 */
public class SwapPairs {
    public static void main(String[] args) {
        Node firstNode = getFirstNode();
        Node node = swapPairs(firstNode);
        printNode(node);
    }

    public static Node swapPairs(Node firstNode) {
        Node head = new Node(-22);
        head.setNext(firstNode);

        Node tmp = head;
        while(tmp.getNext() != null && tmp.getNext().getNext() != null) {
            Node node1 = tmp.getNext();
            Node node2 = tmp.getNext().getNext();

            tmp.setNext(node2);
            node1.setNext(node2.getNext());
            node2.setNext(node1);
            tmp = node1;
        }

        return head.getNext();
    }

    public static Node getFirstNode() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        return node1;
    }

    public static void printNode(Node node) {
        while(node != null) {
            System.out.println(node.getValue());

            node = node.getNext();
        }
    }
}

package linkList.subject;

import linkList.Node;

/**
 * 链表反转
 */
public class LinkedListReverser {
    public static Node reverserLinkedList3(Node node){
        //指向空，可以想象成位于第一个节点之前
        Node preNode = null;
        //指向第一个节点
        Node curNode = node;

        //循环中，使用第三变量事先保存curNode的后面一个节点

        while (curNode != null){
            Node next = curNode.getNext();

            curNode.setNext(preNode);

            preNode = curNode;

            curNode = next;
        }

        return preNode;
    }
}

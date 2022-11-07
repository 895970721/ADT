package tree;

public class Bst<T extends Comparable<T>> {

    private Node<T> root;

    public Boolean search(Node n,T data) {
        if (n == null) {
            return false;
        }

        if (n.getData().compareTo(data) == 0) {
            return true;
        }

        // 转向右节点
        if (n.getData().compareTo(data) < 0) {
            search(n.right, data);
        }

        // 转向左节点
        if (n.getData().compareTo(data) > 0) {
            search(n.left, data);
        }

        return false;
    }

    private static class Node<T extends Comparable<T>> {
        private T data;
        private Node left;
        private Node right;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}

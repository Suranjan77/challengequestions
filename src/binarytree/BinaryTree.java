package binarytree;

/**
 *
 * @param <T>
 * @author Suranjan Poudel
 */
public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;
    private MyComparator<T> comparator;

    @FunctionalInterface
    public interface MyComparator<T> {
        Integer compare(T x, T y);
    }

    public BinaryTree(MyComparator<T> comparator) {
        root = null;
        this.comparator = comparator;
    }

    public void insert(T data) {
        root = insert(root, data);
    }

    private Node<T> insert(Node<T> node, T value) {
        if (node == null)
            return new Node<>(value);
        if (comparator.compare(value, node.value) < 0)
            node.leftChild = insert(node.leftChild, value);
        else if (comparator.compare(value, node.value) > 0)
            node.rightChild = insert(node.rightChild, value);
        else
            return node;
        return node;
    }

    public void preOrderTraversal() {
        walker(root);
    }

    private void walker(Node r) {
        if (r != null) {
            System.out.print(r.value + " ");
            walker(r.leftChild);
            walker(r.rightChild);
        }
    }
}
package binarytree;

/**
 *
 * @param <T>
 * @author Suranjan Poudel
 */
public class Node<T> {
    public T value;
    public Node<T> leftChild;
    public Node<T> rightChild;

    public Node(T value, Node<T> l, Node<T> r) {
        leftChild = l;
        rightChild = r;
        this.value = value;
    }

    public Node(T data) {
        this(data, null, null);
    }
}

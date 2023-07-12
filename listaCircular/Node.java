public class Node<E> {
  private E data;
  private Node<E> nextNode;

  public Node() {
  }

  public Node(E data) {
    this.data = data;
  }

  public Node(E data, Node<E> nextNode) {
    this.data = data;
    this.nextNode = nextNode;
  }

  public E getData() {
    return this.data;
  }

  public void setData(E data) {
    this.data = data;
  }

  public Node<E> getNextNode() {
    return this.nextNode;
  }

  public void setNextNode(Node<E> nextNode) {
    this.nextNode = nextNode;
  }
}

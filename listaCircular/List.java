
public class List<E> {

  private Node<E> root;
  private Node<E> tail;
  private int size;

  public List() {
    this.root = null;
    this.size = 0;
  }

  public List(Node<E> root) {
    this.root = root;
  }
  

  public void add(E element) {
    Node<E> newNode = new Node<>();
    newNode.setData(element);

    if (this.root == null) {
      this.root = newNode;
      this.tail = newNode;
      tail.setNextNode(root);
    } else {
      
      this.tail.getNextNode(newNode);
      newNode.setNextNode(this.root);
      this.tail=newNode;
    }
    this.size++;
  }


}

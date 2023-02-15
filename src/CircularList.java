public class CircularList {

    private Node head;

    public void addNode(Node node) {
        if (head == null) {
            head = node;
            head.setNext(head);
            head.setPrevious(head);
        } else {
            Node tail = head.getPrevious();
            node.setNext(head);
            head.setPrevious(node);
            tail.setNext(node);
            node.setPrevious(tail);
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Lista vacia");
        } else {
            print(head);
        }
    }

    private void print(Node current) {
        if (current.getNext().equals(head)) {
            System.out.println(current.getName());
            return;
        }
        System.out.println(current.getName());
        print(current.getNext());
    }

    public void delete(String goal) {
        if (head == null) {
            return;
        } else {
            delete(head, goal);
        }
    }

    private void delete (Node current, String goal) {
        if (head.getNext().equals(head)) {
            head.setNext(null);
            head.setPrevious(null);
            head = null;
            return;
        }
        if (head.getName().equals(goal)) {
            head.getNext().setPrevious(head.getPrevious());
            head.getPrevious().setNext(head.getNext());
            head = head.getNext();
            return;
        }
        if (current.getName().equals(goal)) {
            current.getPrevious().setNext(current.getNext());
            current.getNext().setPrevious(current.getPrevious());
            return;
        }
        delete(current.getNext(), goal);
    }

}

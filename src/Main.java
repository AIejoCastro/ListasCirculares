public class Main {
    public static void main(String[] args) {
        CircularList lista = new CircularList();
        lista.addNode(new Node("A"));
        lista.addNode(new Node("B"));
        lista.addNode(new Node("C"));
        lista.addNode(new Node("D"));
        lista.addNode(new Node("Z"));
        lista.print();
        lista.delete("A");
        System.out.println("---------------");
        lista.print();
    }

}
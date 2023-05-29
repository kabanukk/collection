


public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedListA <String> ll1 = new LinkedListA();
        ll.add(2);
        System.out.println(ll.size());
        System.out.println((Integer) ll.get(0));
        System.out.println((String) ll.get(0));
        ll1.add("10");
        ll1.add("32");
        System.out.println(ll1.get(1));
    }
}
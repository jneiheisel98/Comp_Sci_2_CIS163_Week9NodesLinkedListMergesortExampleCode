package week9;

public class LinkListwithTail {
    private Node top;
    private Node tail;

    public LinkListwithTail() {
        top = null;
        tail = null;
    }

    // too easy for final exam
    public void addfirst(String data) {
        // case 0: no list
        if (top == null)
            tail = top = new Node(data, null);
        // case 1: list exist
        else {
            top = new Node (data, top);
        }
    }

    // too easy for final exam
    public void addBottom(String data) {
        // case 0 : no list
        if (top == null)
            tail = top = new Node (data, null);

            // case 1: the list exist
        else {
            tail.setNext(new Node(data, null));
            tail = tail.getNext();
        }
    }

    public String delFromBottom() {
        // Case 0: no list
        if (top == null)
            throw new RuntimeException();

        // case 1: one item in the list
        if (top.getNext() == null) {
            String temp = top.getData();
            top = null;
            tail = null;
            return temp;
        }

        // case 2: there are more than 1 item in list
        Node temp = top;
        while (temp.getNext() != tail)
            temp = temp.getNext();


        String data2 = tail.getData();
        temp.setNext(null);
        tail = temp;
        return data2;
    }

    public void addInOrder(String data) {

        // no list
        if (top == null) {
            tail = top = new Node (data, null);
            return;
        }

        // I know have a list
        // adding before the top
        if (top.getData().compareTo(data) > 0) {
            //  add to top position
            top = new Node(data, top);
        }

        // add to the last position in the list
        else if (tail.getData().compareTo(data) < 0) {
            // I will add after tail
            tail.setNext(new Node(data, null));
            tail = tail.getNext();
        }

        // must be in the middle
        else {
            // adding to the middle
            Node prev = top;
            Node curr = top.getNext();

            while ((curr.getData().compareTo(data)) < 0) {
                curr = curr.getNext();
                prev = prev.getNext();
            }
            prev.setNext(new Node(data, curr ));
        }
    }


    public void display() {
//		System.out.println(top.getData());
//		System.out.println(top.getNext().getData());
//		System.out.println(top.getNext().getNext().getData());

        Node temp = top;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    // too easy for final exam
    public int size() {
        int total = 0;

        Node temp = top;
        while (temp != null) {
            total++;
            temp = temp.getNext();
        }

        return total;
    }

    // Example of a Lab exam question.
    public boolean addAt (String data, int index) {
        // write this

        return false;
    }



    public static void main(String[] args) {
        LinkListwithTail list = new LinkListwithTail();

//        list.addfirst("pizza4");
//        list.addfirst("pizza3");
//        list.addfirst("pizza2");
//        list.addfirst("pizza1");
//        list.addfirst("pizza0");

        list.addInOrder("aizza4"); //case 0
        list.addInOrder("dizza3"); // case 1
        list.addInOrder("bizza2");
        list.addInOrder("cizza1");
        list.addInOrder("eizza0");
        list.display();

//        list.delFromBottom();
//        list.delFromBottom();
//        list.delFromBottom();
//        list.delFromBottom();
//        list.delFromBottom();
//        list.delFromBottom();
    }
}

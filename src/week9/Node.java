package week9;

public class Node {
		private String data;
		private Node next;   // sll

		public Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}

		public Node() {
		    data = null;
		    next = null;
        }

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node getNext() {
			return next;
		}
}


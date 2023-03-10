
public void rotate() {
    if (head != null && head.next != null) {
        Node newHead = head.next;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;
        head.next = null;
        head = newHead;
    }
}

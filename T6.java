
public Node reverse(Node head) {
    if (head == null || head.next == null) {
        return head;
    }
    Node prev = null;
    Node current = head;
    Node next = null;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    return prev;
}


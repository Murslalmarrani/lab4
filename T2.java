
public Node findSecondToLast(Node head) {
    Node current = head;
    Node prev = null;
    while (current != null && current.next != null) {
        prev = current;
        current = current.next;
    }
    return prev;
}


public int size() {
    int size = 0;
    Node current = head;
    while (current != null) {
        size++;
        current = current.next;
    }
    return size;
}

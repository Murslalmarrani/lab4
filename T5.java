
public SinglyLinkedList concatenate(SinglyLinkedList list1, SinglyLinkedList list2) {
    if (list1 == null) {
        return list2;
    }
    if (list2 == null) {
        return list1;
    }
    Node current = list1.head;
    while (current.next != null) {
        current = current.next;
    }
    current.next = list2.head;
    return list1;
}

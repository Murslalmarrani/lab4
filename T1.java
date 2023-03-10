public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (!(obj instanceof SinglyLinkedList)) {
        return false;
    }
    SinglyLinkedList other = (SinglyLinkedList) obj;
    if (size() != other.size()) {
        return false;
    }
    Node current = head;
    Node otherCurrent = other.head;
    while (current != null) {
        if (!current.data.equals(otherCurrent.data)) {
            return false;
        }
        current = current.next;
        otherCurrent = otherCurrent.next;
    }
    return true;
}

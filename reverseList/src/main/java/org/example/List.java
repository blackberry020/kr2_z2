package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List<T> {
    private Node<T> head;
    private Node<T> tail;

    public List(ArrayList<T> array) {
        if (!array.isEmpty())
            head = new Node<>(array.get(0), null);

        Node<T> curNode = head;
        for (int i = 1; i < array.size(); i++) {
            curNode.next = new Node<>(array.get(i), null);
            curNode = curNode.next;
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void printList() {
        Node<T> curNode = head;

        while (curNode != null) {
            System.out.print(curNode.info + " ");
            curNode = curNode.next;
        }
    }

    public void reverse(Node<T> cur) {
        if (cur == null) {
            return;
        }

        if (cur.next == null) {
            head = cur;
            return;
        }

        reverse(cur.next);
        cur.next.next = cur;
        cur.next = null;
    }
}

package org.example;

public class Node<T> {
    public T info;
    public Node<T> next;

    Node(T _info, Node<T> _next) {
        info = _info;
        next = _next;
    }
}

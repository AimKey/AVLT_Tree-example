package MYAVL;

class Node<T extends Comparable<T>> {
    T key;
    int height;
    Node<T> left, right;

    Node(T d) {
        key = d;
        height = 1;
    }
}
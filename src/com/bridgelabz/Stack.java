package com.bridgelabz;

public class Stack<E> {

    LinkedList<E> linkedList = new LinkedList<>();

    public Stack() {
    }

    public Stack(LinkedList<E> linkedList) {
        this.linkedList = linkedList;
    }

    public void push(E data){

        linkedList.add(data);
    }

    public void print(){
        linkedList.display();
    }

    public void peek(){
        System.out.println(linkedList.head.getData());
    }

    public void popStack(){
        linkedList.pop();
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(70);
        stack1.push(30);
        stack1.push(56);
        stack1.print();

        System.out.println();
        System.out.println();
        stack1.peek();
        stack1.popStack();
        stack1.print();

        System.out.println();
        System.out.println();
        stack1.peek();
        stack1.popStack();
        stack1.print();

        System.out.println();
        System.out.println();
        stack1.peek();
        stack1.popStack();
        stack1.print();


    }
}

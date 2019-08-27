import java.util.EmptyStackException;
import java.util.Vector;

/**
 * Created by jangh on 2019-05-22.
 */

public class Stack<E> extends Vector<E> {

    private int top;

    private E[] storage;



    public Stack(int capacity) {

        if (capacity <= 0)
            throw new EmptyStackException();
//            throw new IllegalArgumentException(
//
//                    "Stack's capacity must be positive");

        storage = (E[]) new Object[capacity];

        top = -1;

    }



    void push(E value) {

        if (top == storage.length)
            throw new EmptyStackException();
            //throw new StackException("Stack's underlying storage is overflow");

        top++;

        storage[top] = value;

    }



    E peek() {

        if (top == -1)
            throw new EmptyStackException();
           // throw new StackException("Stack is empty");

        return storage[top];

    }



    E pop() {

        if (top == -1)
            throw new EmptyStackException();

        //throw new StackException("Stack is empty");
        E obj =storage[top];

        top--;
        return obj;
    }



    boolean empty() {

        return (top == -1);

    }








//public class Stack<E> {
//    private E[] arr = null;
//    private int CAP;
//    private int top = -1;
//    private int size = 0;
//
//
//    public Stack(int cap) {
//        this.CAP = cap;
//        this.arr = (E[]) new Object[cap];
//    }
//    boolean empty( ){
//        if(size ==0){
//            return true;
//        }return false;
//    }
//    public E peek() {
//        if(this.size == 0){
//            throw new EmptyStackException();
//        }
//
//        E result = this.arr[top];
//
//        return result;
//    }
//    public E pop() {
//        if(this.size == 0){
//            throw new EmptyStackException();
//        }
//
//        this.size--;
//        E result = this.arr[top];
//        this.arr[top] = null;//prevent memory leaking
//        this.top--;
//
//        return result;
//    }
//
//    public boolean push(E e) {
//        if (isFull())
//            return false;
//
//        this.size++;
//        this.arr[++top] = e;
//
//        return true;
//    }
//
//    public boolean isFull() {
//        if (this.size == this.CAP)
//            return false;
//        return true;
//    }
//
//    public String toString() {
//        if(this.size==0){
//            return null;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<this.size; i++){
//            sb.append(this.arr[i] + ", ");
//        }
//
//        sb.setLength(sb.length()-2);
//        return sb.toString();
//    }
//
////    public static void main(String[] args) {
////
////        Stack<String> stack = new Stack<String>(11);
////        stack.push("hello");
////        stack.push("world");
////
////        System.out.println(stack);
////
////        stack.pop();
////        System.out.println(stack);
////
////        stack.pop();
////        System.out.println(stack);
////    }
}
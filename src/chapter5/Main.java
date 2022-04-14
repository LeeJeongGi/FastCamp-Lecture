package chapter5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        /**
         * 자료 구조 - 큐
         * FIFO(First-In, First-Out) 또는 LILO(Last-In, Last-Out) 방식으로 스택과 꺼내는 순서가 반대
         *        =================================
         *  ->in        |   |   |   |   |   |   |   |   ...->out
         *        =================================
         * JAVA 에서는 기본적으로 java.util 패키지에 Queue 클래스를 제공하고 있음
         * Enqueue 에 해당하는 기능으로 Queue 클래스에서는 add(value) 또는 offer(value) 메서드를 제공함
         * Dequeue 에 해당하는 기능으로 Queue 클래스에서는 poll() 또는 remove() 메서드를 제공함
         * 아쉽게도, Queue 클래스에 데이터 생성을 위해서는 java.util 패키지에 있는 LinkedList 클래스를 사용해야 함
         * LinkedList 클래스는 자료구조의 링크드리스트 와 연관이 있으며, 관련 내용은 큐보다 복잡하므로 이후 챕터에서 상세히 익히도록 함
         */

        Queue<Integer> queue = new LinkedList<>();
        Queue<String> queue1 = new LinkedList<>();

        queue.add(1);
        queue.offer(2);

        System.out.println("queue = " + queue);

        MyQueue<Integer> mq = new MyQueue<Integer>();

        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);

        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }

    public static class MyQueue<T> {
        private ArrayList<T> queue = new ArrayList<T>();

        public void enqueue(T item) {
            queue.add(item);
        }

        public T dequeue() {
            if (queue.isEmpty()) {
                return null;
            }
            return queue.remove(0);
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }
    }
}

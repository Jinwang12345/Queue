public class QueueImpl<E> implements Queue<E>{
    private E[] data;
    private int p;

    public QueueImpl(int len) {
        // TO-DO
    }

    public void push(E e) throws FullQueueException {
        // TO-DO
    }


    public E pop() throws EmptyQueueException {
        // TO-DO
        return null;
    }

    private boolean isFull() {
        // TO-DO
        return false;
    }

    private boolean isEmpty() {
        // TO-DO
        return false;
    }

    public int size() {
        //TO-DO
        return 0;
    }
}

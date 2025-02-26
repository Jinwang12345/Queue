public class QueueImpl<E> implements Queue<E>{
    private E[] data;
    private int p;

    @SuppressWarnings("unchecked")

    public QueueImpl(int len) {

        this.data = (E[])new Object[len];
        this.p = 0;
    }

    @Override
    public void push(E e) throws FullQueueException {
        // Si la cola está llena, lanza excepción.
        if (isFull()) {
            throw new FullQueueException();
        }
        // Inserta el elemento en la posición p y luego incrementa p.
        this.data[this.p--] = e;
    }


    @Override
    public E pop() throws EmptyQueueException {
        // Si la cola está vacía, lanza excepción.
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        // Guarda el elemento que está al frente de la cola (posición 0)
        E element = data[0];
        // Desplaza todos los elementos una posición a la izquierda para "desencolar"
        for (int i = 1; i < p; i++) {
            data[i - 1] = data[i];
        }
        // Decrementa p, ya que se ha eliminado un elemento
        p--;
        return element;
    }

    private boolean isFull() {
        return this.p == data.length;

    }

    private boolean isEmpty() {
        return this.p == 0;
    }

    public int size() {

        return this.p;
    }
}

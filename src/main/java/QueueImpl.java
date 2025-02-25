public class QueueImpl<E> implements Queue<E>{
    private E[] data;
    private int p;

    public QueueImpl(int len) {
        this.data = (E[]) new Object[len];// Crea el array de tamaño len
        p = 0; // Inicializa p en 0, porque la cola empieza vacía
    }

    public void push(E e) throws FullQueueException {
        if (isFull()) throw new FullQueueException();// Verifica si la cola está llena
        this.data[this.p++]=e;// Añade el elemento y aumenta el índice

    }


    public E pop() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException();// Lanza excepción si la cola está vacía
        E firstElement = this.data[0];// Guardamos el primer elemento
        // Mover los elementos hacia la izquierda
        for (int i = 0; i < p - 1; i++) {
            data[i] = data[i + 1];
        }
        data[p-1]=null;// Eliminar el último elemento repetido
        return firstElement;
    }

    private boolean isFull() {

        return p >= data.length;// Devuelve true si la cola está llena
    }

    private boolean isEmpty() {
        return p == 0; // Devuelve true si la cola no tiene elementos
    }

    //Este método devuelve el número de elementos que hay actualmente en la cola.
    public int size() {
        return this.p;
    }
}

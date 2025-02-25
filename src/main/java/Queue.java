/**
 * Interfície genèrica que defineix les operacions bàsiques d'una cua (queue),
 * estructura de dades que segueix la política FIFO (First In, First Out).
 *
 * @param <E> el tipus d'elements que contindrà la cua
 */
public interface Queue<E> {

    /**
     * Añade (encúa) un nuevo elemento al final de la cola.
     *
     * @param y el elemento a añadir a la cola
     * @throws FullQueueException si la cola está llena y no se pueden añadir más elementos
     */
    public void push(E e) throws FullQueueException;

    /**
     * Extrae (desencúa) y devuelve el elemento situado al frente de la cola.
     *
     * @return el elemento al frente de la cola
     * @throws EmptyQueueException si la cola está vacía y no hay ningún elemento para extraer
     */
    public E pop() throws EmptyQueueException;

    /**
     * Devuelve la cantidad de elementos actuales que hay en la cola.
     *
     * @return el número de elementos presentes en la cola
     */
    public int size();
}

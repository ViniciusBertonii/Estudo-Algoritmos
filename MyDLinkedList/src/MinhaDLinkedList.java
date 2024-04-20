public class MinhaDLinkedList {

    private class Nodo {
        public int valor;
        public Nodo prox;
        public Nodo prev;

        public Nodo(int v) {
            valor = v;
            prev = prox = null;
        }
    }

    private Nodo head, tail;
    private int count;

    public MinhaDLinkedList() {
        head = tail = null;
        count = 0;
    }

    public boolean add(int element) {
        Nodo novo = new Nodo(element);

        if (isEmpty()) {
            head = tail = novo;
        } else {
            tail.prox = novo;
            novo.prev = tail;
            tail = novo;
        }
        count++;
        return true;
    }

    public void add(int index, int element) {
        // Implementar a adição em uma posição específica (opcional para este exemplo)
    }

    public void clear() {
        head = tail = null;
        count = 0;
    }

    public boolean contains(int element) {
        Nodo aux = head;
        while (aux != null) {
            if (aux.valor == element)
                return true;
            aux = aux.prox;
        }
        return false;
    }

    public int get(int index) {
        if (index < 0 || index >= count)
            throw new IndexOutOfBoundsException();

        Nodo aux = head;
        for (int i = 0; i < index; i++) {
            aux = aux.prox;
        }
        return aux.valor;
    }

    public int indexOf(int element) {
        Nodo aux = head;
        int idx = 0;
        while (aux != null) {
            if (aux.valor == element)
                return idx;
            aux = aux.prox;
            idx++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public int remove(int index) {
        if (index < 0 || index >= count)
            throw new IndexOutOfBoundsException();

        Nodo removedNode = null;

        if (count == 1) { // Remoção quando há apenas um elemento na lista
            removedNode = head;
            head = tail = null;
        } else {
            Nodo aux = head;
            for (int i = 0; i < index; i++) {
                aux = aux.prox;
            }

            removedNode = aux;
            if (aux == head) {
                head = aux.prox;
                head.prev = null;
            } else if (aux == tail) {
                tail = aux.prev;
                tail.prox = null;
            } else {
                aux.prev.prox = aux.prox;
                aux.prox.prev = aux.prev;
            }
        }

        count--;
        return removedNode.valor;
    }

    public int set(int index, int element) {
        if (index < 0 || index >= count)
            throw new IndexOutOfBoundsException();

        Nodo aux = head;
        for (int i = 0; i < index; i++) {
            aux = aux.prox;
        }

        int oldValue = aux.valor;
        aux.valor = element;
        return oldValue;
    }

    public int size() {
        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Nodo current = head;
        while (current != null) {
            sb.append(current.valor);
            if (current != tail) {
                sb.append(", ");
            }
            current = current.prox;
        }
        sb.append(" ]");
        return sb.toString();
    }
}

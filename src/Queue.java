/**
 * This should be a queue
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Queue {
    // Need data structure....
    int size = 0;
    LinkedList Queue;
    public Queue() {
        Queue = new LinkedList();
    }

    public void enqueue(String text) {
        Queue.addLast(new Node(text));
    }

    public String dequeue() {
        String text = Queue.first.data;
        Queue.removeFirst();
        return text;
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return -1;
    }
}

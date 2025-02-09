/**
 * Passengers21
 */
public class Passengers21 {

    String name;
    String cityOrigin;
    String cityDestination;
    int ticketAmount;
    int price;

    int max;
    int size;
    int front;
    int rear;
    int[] Q;

    public Passengers21(String name, String cityOrigin, String cityDestination, int ticketAmount, int price) {
        this.name = name;
        this.cityOrigin = cityOrigin;
        this.cityDestination = cityDestination;
        this.ticketAmount = ticketAmount;
        this.price = price;
    }

    public Passengers21(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("The first element : " + Q[front]);
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void print() {
        if (!IsEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(Q[i] + " ");
                i = (i+1) % max;
            }
            System.out.println( Q[i] + " ");
            System.out.println("Element amount : " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue has been cleared successfully");
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Queue is already full");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
        }
        Q[rear] = data;
        size++;
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data; 
    }
}

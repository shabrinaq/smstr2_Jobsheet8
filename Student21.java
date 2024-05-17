/**
 * Student21
 */
public class Student21 {

    String nim;
    String name;
    int classNumber;
    double gpa;

    int max;
    int size;
    int front;
    int rear;
    Student21[] stdQueue;

    public Student21(String nim, String name, int classNumber, double gpa) {
        this.nim = nim;
        this.name = name;
        this.classNumber = classNumber;
        this.gpa = gpa;
    }

    public Student21(int n) {
        max = n;
        Create();
    }

    public void Create() {
        stdQueue = new Student21[max];
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
            System.out.println("The first element : " + stdQueue[front].nim + " "
            + stdQueue[front].name + " " + stdQueue[front].classNumber + " " + 
            stdQueue[front].gpa);
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("The last element : " + stdQueue[rear].nim + " "
            + stdQueue[rear].name + " " + stdQueue[rear].classNumber + " " + 
            stdQueue[rear].gpa);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void print() {
        if (!IsEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.println("The First Element: " + stdQueue[i].nim + " "
                + stdQueue[i].name + " " + stdQueue[i].classNumber + " " +
                stdQueue[i].gpa);
                i = (i + 1) % max;
            }
            System.out.println("The First Element: " + stdQueue[rear].nim + " "
            + stdQueue[rear].name + " " + stdQueue[rear].classNumber + " " +
            stdQueue[rear].gpa);
            System.out.println("Element amount: " + size);
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void Enqueue(Student21 data) {
        if (IsFull()) {
            System.out.println("Queue is already full");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
        }
        stdQueue[rear] = data;
        size++;
    }

    public Student21 Dequeue() {
        Student21 data = stdQueue[front];
        if (IsEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            size--;
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return data; 
    }

    public void peekPosition(String nim) {
        for (int i = 0; i < size; i++) {
            if (stdQueue[i].nim.equals(nim)) {
                System.out.println("Found student: " + stdQueue[i].nim + " "
                + stdQueue[i].name + " " + stdQueue[i].classNumber + " " +
                stdQueue[i].gpa);
                return;
            }
        }
        System.out.println("Student with NIM " + nim + " not found in the queue");
    }

    public void printStudents(int position) {
        if (position >= 0 && position < size) {
            System.out.println("Student at position " + position + ": " + stdQueue[position].nim + " "
            + stdQueue[position].name + " " + stdQueue[position].classNumber + " " +
            stdQueue[position].gpa);
        } else {
            System.out.println("Invalid position");
        }
    }
}

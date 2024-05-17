import java.util.Scanner;

/**
 * QueueMain21
 */
public class QueueMain21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert maximum queue : ");
        int max = sc.nextInt();
        sc.nextLine();

        Queue21 queuePassenger = new Queue21(max);

        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                   System.out.print("NIM: ");
                   String nim = sc.nextLine();
                   sc.nextLine();
                   System.out.print("Name: ");
                   String name = sc.nextLine();
                   System.out.print("Class Number: ");
                   int classNumber = sc.nextInt();
                   System.out.print("GPA: ");
                   double gpa = sc.nextDouble();
                   sc.nextLine();

                   Student21 p = new Student21(nim, name, classNumber, gpa);
                   sc.nextLine();

                   queuePassenger.Enqueue(p);
                    break;
                case 2:
                    Student21 data = queuePassenger.Dequeue();
                    if (data != null) {
                        System.out.println("Data removed : " + data.name + " " + data.nim
                        + " " + data.name + " " + data.classNumber + " " + data.gpa);
                    } else {
                        System.out.println("Queue is empty");
                    }
                        break;
                case 3:
                    queuePassenger.print();
                    break;
                case 4:
                    queuePassenger.peek();
                    break;
                case 5:
                    queuePassenger.peekRear();
                    break;
            }
        } while (choose <= 5 && choose >= 1);
    }

    public static void menu() {
        System.out.println("Choose menu: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Check first queue");
        System.out.println("4. Check all queue");
        System.out.println("5. Check last queue");
        System.out.println("==========================");
    }
}
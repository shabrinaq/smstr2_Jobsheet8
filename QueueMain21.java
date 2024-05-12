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
                   System.out.print("Name: ");
                   String nm = sc.nextLine();
                   sc.nextLine();
                   System.out.print("City Origin: ");
                   String cOrg = sc.nextLine();
                   System.out.print("City Destination: ");
                   String cDes = sc.nextLine();
                   System.out.print("ticket Amount: ");
                   int ticket = sc.nextInt();
                   System.out.print("Price: ");
                   int price = sc.nextInt();
                   sc.nextLine();

                   Passengers21 p = new Passengers21(nm, cOrg, cDes, ticket, price);
                   sc.nextLine();

                   queuePassenger.Enqueue(p);
                    break;
                case 2:
                    Passengers21 data = queuePassenger.Dequeue();
                    if (!"".equals(data.name) && !"".equals(data.cityOrigin) &&
                            !"".equals(data.cityDestination) && !"".equals(data.ticketAmount)
                            && !"".equals(data.price)) {
                        System.out.println("Data removed : " + data.name + " " + data.cityOrigin
                        + " " + data.cityDestination + " " + data.ticketAmount + " " + data.price);
                        break;
                    }
                case 3:
                    queuePassenger.print();
                    break;
                case 4:
                    queuePassenger.peek();
                    break;
                case 5:
                    queuePassenger.clear();
                    break;
            }
        } while (choose <= 4 && choose >= 1);
    }

    public static void menu() {
        System.out.println("Choose menu: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Check first queue");
        System.out.println("4. Check all queue");
        System.out.println("==========================");
    }

}
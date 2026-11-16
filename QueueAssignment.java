import java.util.Scanner;

public class QueueAssignment {
    static final int SIZE = 5;
    static int[] queue = new int[SIZE];
    static int count = 0;

    static void enqueue(int value) {
        if (count == SIZE) {
            System.out.println("Queue Overflow!");
            return;
        }
        queue[count] = value;
        count++;
        System.out.println(value + " inserted into the queue.");
    }

    static void dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println("Dequeued element: " + queue[0]);
        for (int i = 0; i < count - 1; i++) {
            queue[i] = queue[i + 1];
        }
        count--;
    }

    static void front() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Front element: " + queue[0]);
    }

    static void display() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Queue elements (front to rear):");
        for (int i = 0; i < count; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- QUEUE MENU ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = input.nextInt();
                    enqueue(value);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    front();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        input.close();
    }
}

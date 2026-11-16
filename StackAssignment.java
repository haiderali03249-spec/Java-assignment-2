import java.util.Scanner;

public class StackAssignment {
    static final int SIZE = 5;
    static int[] stack = new int[SIZE];
    static int top = -1;

    static void push(int value) {
        if (top == SIZE - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println(value + " pushed into the stack.");
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println("Popped element: " + stack[top]);
        top--;
    }

    static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = input.nextInt();
                    push(value);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
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

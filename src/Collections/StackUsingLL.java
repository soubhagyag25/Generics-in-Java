package Collections;

import java.util.Scanner;

public class StackUsingLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to Push");
            System.out.println("Enter 2 to Pop");
            System.out.println("Press 3 to Display");
            System.out.println("Press 4 to Exit");

            int input = inp.nextInt();

            switch (input) {
                case 1:
                    System.out.println("How many elements do you want to push?");
                    int count = inp.nextInt();
                    System.out.println("Enter the elements:");
                    for (int i = 0; i < count; i++) {
                        int value = inp.nextInt();
                        list.insertionatbeg(value);
                    }
                    list.display();
                    break;
                case 2:
                    list.deleteatbeg();
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    inp.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }
        }
    }
}

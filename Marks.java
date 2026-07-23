import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int marks;
        do {
            System.out.println("Enter 1 to input marks");
            System.out.println("Enter 0 to stop");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter student's marks (0-100): ");
                marks = sc.nextInt();
                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid Marks");
                }
                System.out.println("Because marks don't matter but our effort does.");
            } else if (choice != 0) {
                System.out.println("Invalid Choice");
            }
        } while (choice != 0);
        System.out.println("Program Ended");
        sc.close();
    }
}

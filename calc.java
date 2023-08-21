import java.util.Scanner;

class calc {
    public static void main(String[] args) {
        int choice = 0, num;
        System.out.println("Welcome to the simple math helper.");
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to calculate?");
        System.out.println("1. Sqrt");
        System.out.println("2. Log");
        System.out.println("3. Factorial");
        System.out.print(">");
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the number to sqrt:");
                System.out.print(">");
                num = scan.nextInt();
                System.out.println(Math.sqrt(num));
                break;
            case 2:
                System.out.println("Enter the number to log:");
                System.out.print(">");
                num = scan.nextInt();
                System.out.println(Math.log10(num));
                break;
            case 3:
                System.out.println("Enter the number to factorial:");
                System.out.print(">");
                num = scan.nextInt();
                int fact = 1;
                for (int i = 2; i >= num; i++) {
                    fact *= i;
                }
                System.out.println(fact);
            default:
                System.out.println("Invalid choice");
        }

    }
}
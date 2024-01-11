import java.util.Scanner;

public class bnc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Choose conversion:");
        System.out.println("1. Base 10 to Base 2");
        System.out.println("2. Base 10 to Base 16");
        System.out.println("3. Base 2 to Base 10");
        System.out.println("4. Base 2 to Base 16");
        System.out.println("5. Base 16 to Base 2");
        System.out.println("6. Base 16 to Base 10");

        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Base 10 to Base 2: " + Integer.toBinaryString(number));
                break;
            case 2:
                System.out.println("Base 10 to Base 16: " + Integer.toHexString(number));
                break;
            case 3:
                System.out.println("Base 2 to Base 10: " + Integer.parseInt(Integer.toBinaryString(number), 2));
                break;
            case 4:
                System.out.println("Base 2 to Base 16: " + Integer.toHexString(Integer.parseInt(Integer.toBinaryString(number), 2)));
                break;
            case 5:
                System.out.print("Base 16 to Base 2: ");
                convertHexToBinary(scanner.next());
                break;
            case 6:
                System.out.println("Base 16 to Base 10: " + Integer.parseInt(scanner.next(), 16));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void convertHexToBinary(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        System.out.println(Integer.toBinaryString(decimal));
    }
}
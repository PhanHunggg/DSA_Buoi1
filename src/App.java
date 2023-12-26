import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Bai 1
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        scanner.close();

        // Bai 2

        String greeting = "Hello, World!";

        System.out.println(greeting);

        // Bai 3

        String headString = "Hello";
        String endString = "World!";

        String completeChain = StringConcatenation(headString, endString);

        System.out.println(completeChain);

        // Bai 4
        printString(completeChain);
    }

    public static String StringConcatenation(String st1, String st2) {
        return st1 + " " + st2;
    }

    public static void printString(String str) {
        System.out.println(str);
    }
}

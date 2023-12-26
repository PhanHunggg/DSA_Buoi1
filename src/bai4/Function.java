package bai4;

public class Function {
    public static void main(String[] args) {
        String headString = "Hello";
        String endString = "World!";

        String completeChain = StringConcatenation(headString, endString);

        printString(completeChain);
    }

    public static String StringConcatenation(String st1, String st2) {
        return st1 + " " + st2;
    }

    public static void printString(String str) {
        System.out.println(str);
    }
}

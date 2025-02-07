import java.util.Scanner;

public class Main {
    public static String toBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String toOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        sc.close();

        String binary = toBinary(decimal);
        String octal = toOctal(decimal);

        System.out.println("Binary equivalent: " + binary);
        System.out.println("Octal equivalent: " + octal);
    }
}

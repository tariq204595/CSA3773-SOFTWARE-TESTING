import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();
        
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));

        scanner.close();
    }
}
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int rev = 0;
        int num = n;

        while (num != 0) {
            int dig = num % 10;
            rev = rev * 10 + dig;
            num /= 10;
        }
        if (rev == n) { 
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }
}

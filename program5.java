import java.util.Scanner;

public class program5{
    public static boolean isPalindrome(int num) {
        if (num < 0) return false; // Negative numbers are not palindromes

        int originalNum = num;
        int reverseNum = 0;

        while (num > 0) {
            int digit = num % 10; // Extract last digit
            reverseNum = reverseNum * 10 + digit; // Build reverse number
            num /= 10; // Remove last digit
        }

        return originalNum == reverseNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        
        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a Palindrome");
        } else {
            System.out.println(userInput + " is NOT a Palindrome");
        }

        scanner.close();
    }
}
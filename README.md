import java.util.Scanner;

class Main {
    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int j = str.length() - 1; j >= 0; j--) {
            reversed.append(str.charAt(j));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Reverse of the string '" + str + "' is: " + reverseString(str));
    }
}

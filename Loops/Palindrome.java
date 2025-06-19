import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        int temp = num, rev = 0;
        while (temp > 0) {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }
            System.out.println(

        if (num == rev)num + " is a Palindrome.");
        else
            System.out.println(num + " is NOT a Palindrome.");
    }
}

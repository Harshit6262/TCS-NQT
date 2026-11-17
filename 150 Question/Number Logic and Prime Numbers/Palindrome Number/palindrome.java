import java.util.Scanner;

public class palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int x = sc.nextInt();

        if(x < 0 || (x != 0 && x % 10 == 0)){
            System.out.println("Not Palindrome");
            sc.close();
            return;
        }

        int halfRev = 0;

        while (x > halfRev){
            int ld = x % 10;
            halfRev = (halfRev * 10) + ld;
            x /= 10;
        }

         if (x == halfRev || x == halfRev / 10) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}

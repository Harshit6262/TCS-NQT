import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int x = sc.nextInt();

        if(x < 0){
            System.out.println("Not Armstrong Number");
            sc.close();
            return;
        }

        int original = x;
        int temp = x;
        int digits = String.valueOf(x).length();
        int sum = 0;

        while (temp > 0){
            int digit = temp % 10;
            int power = 1;
            for(int i = 0; i < digits; i++){
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        if (sum == original){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        sc.close();
    }
}
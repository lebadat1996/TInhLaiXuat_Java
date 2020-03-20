package BankInterest;

import java.util.Scanner;
public class BankInterest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter moneySend:  ");
        double moneySend=scanner.nextDouble();
        System.out.print("enter interestMonth:  ");
        double interestMonth = scanner.nextDouble();
        System.out.print("enter month Send:  ");
        double monthSend = scanner.nextDouble();
        double interestRate= moneySend*(interestMonth/100)/12*monthSend;
        System.out.println("interestRate is: "+interestRate);
    }
}

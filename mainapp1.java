package project1;

import java.util.Scanner;

public class mainapp1 {
    public static void main(String[] args) {
        AccountFactory factory=new AccountFactory();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Select bank");
        System.out.println("1.AXIS BANK\n2.SBI BANK");
        int choice= sc1.nextInt();
        System.out.println("Enter initial account balance");
        double balance=sc1.nextDouble();
        Account factoryAccount=factory.CreateAccount(choice,balance);
        boolean status=true;
        while (status){
            System.out.println("Select mode of transaction");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            int mode=sc1.nextInt();
            if(mode==1){
                System.out.println("Enter amount");
                double amt=sc1.nextDouble();
                factoryAccount.deposit(amt);
            } else if (mode==2) {
                System.out.println("Enter amount");
                double amt= sc1.nextDouble();
                factoryAccount.withdraw(amt);

            } else if (mode==3) {
                factoryAccount.checkbalance();

            }
            else {
                status=false;
            }
        }

    }
}

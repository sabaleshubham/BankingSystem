package project1;

public class SbiBank implements Account{

    double accountBalance;

    public SbiBank(double accountBalance) {
        if(accountBalance>=5000){
            this.accountBalance=accountBalance;
            System.out.println("Account created successefully");
        }
        else{
            System.out.println("Minimum balance must be 5000");
        }

    }


    @Override
    public void deposit(double amt) {
        accountBalance+=amt;
        System.out.println(amt+" RS credited in your account");

    }

    @Override
    public void withdraw(double amt) {
        if(amt<=accountBalance){
            accountBalance-=amt;
            System.out.println(amt+"RS debited from your account");
        }
        else{
            System.out.println("Insufficient account balance");
        }

    }

    @Override
    public void checkbalance() {
        System.out.println("Account balace is"+accountBalance);

    }
}

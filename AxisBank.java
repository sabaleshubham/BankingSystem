package project1;
//class decides how an object should behave
public class AxisBank implements Account{
      double accountBalance;

    public AxisBank(double accountBalance) {
        if(accountBalance>=10000){
            this.accountBalance=accountBalance;
            System.out.println("Account created successefully");
        }
        else{
            System.out.println("Minimum balance must be 10000");
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

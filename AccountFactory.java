package project1;
//FDP--Factory design class

public class AccountFactory {
    Account a1 = null;

    //factory method
    Account CreateAccount(int choice, double initailBalance) {
        if (choice == 1) {
            a1 = new AxisBank(initailBalance);//upcasting.

        } else if (choice==2) {
      a1=new SbiBank(initailBalance); //upcasting.
        }
        return a1;
    }

}

package nyc.c4q.jvvlives2005;

/** Bank Account and Patron exercise:
 * Create two classes Bank Account and Patron
 * A Bank Account has a balance
 * A patron has a name , an account, and his/her "pocket"
 *
 * For now, here are some restrictions:
 * 1. patron can only interact with one account (meaning one on one 1=>1)
 * 2. an account can interact with many patrons (1=> many)
 * 3. we will deal with dollars ONLY, not cents
 *
 * Create a program that creates objects of these types and have them interact with each other
 *
 * Some suggested "interactions:"
 * 1. an account should allow withdrawals and deposits
 * 2. a patron can get from and put the money in the account
 * 3. both should be able to show their current "balance"
 *
 * Extra Credit- Make it so a patron can interact with multiple accounts.
 * You will have to update your methods in Patron in order to specify the account with which you're interacting
 *
 * Created by c4q-joshelynvivas on 3/21/15.
 */
public class BankAccount {
    int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(int balance) {
            this.balance = balance;
    }

    /*public void setBalance(int newBalance) {
        this.balance = newBalance; ---- unnecessary
    }*/

    public void withdraw(int amount) {   // amount = how much I am withdrawing
        balance = balance - amount;        // updated balance = old balance - amount
    }

    public void deposit(int amount) {      //amount = how much I am putting in
        balance = balance + amount;        //updated balance = old balance + amount
    }

    public void printBalance() {
        System.out.println("balance" + balance);
    }

    public static void main(String[] args){
        BankAccount a1 = new BankAccount(100);
        BankAccount a2 = new BankAccount();

        a1.withdraw(5);
        a2.deposit(200);

        System.out.println(a1.balance);
        System.out.println(a2.balance);
    }

}

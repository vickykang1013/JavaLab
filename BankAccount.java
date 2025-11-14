/**
 * BankAccount
 * @author Vicky Kang
 * @author Jonah Martin
 * This program defines a BankAccount class to manage deposits, withdrawals,
 * and transaction history with timestamps.
 */

import java.util.Calendar;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private StringBuilder transactions;

    /*
     * default constructor
     */
    BankAccount() {
        this.accountNumber = "000000";
        this.balance = 0.0;
        this.transactions = new StringBuilder();
    }

    /**
     * Initializes account with initial balance, sets default account number.
     * @param initialBalance initial balance to set
     */
    BankAccount(double initialBalance) {
        this.accountNumber = "000000"; 
        this.balance = initialBalance;
        this.transactions = new StringBuilder();
        transactions.append(Calendar.getInstance().getTime() + " - Initial deposit: $" + initialBalance + "\n");
    }

    /**
     * @param accountNumber the account number to set
     * @param initialBalance the initial balance to set
     */
    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactions = new StringBuilder();
        transactions.append(Calendar.getInstance().getTime() + " - Initial deposit: $" + initialBalance + "\n");
    }

    void deposit(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Amount can't be negative.");
        }
        balance += amount;
        transactions.append(Calendar.getInstance().getTime() + " - Deposited: $" + amount + "\n");
    }

    int withdraw(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Amount can't be negative");
        } else if (balance < amount) {
            throw new Exception("Not enough funds");
        }
        balance -= amount;
        transactions.append(Calendar.getInstance().getTime() + " - Withdrew: $" + amount + "\n");
        return 1;
    }

    double getBalance() {
        return balance;
    }

    String getStatement() {
        return transactions.toString();
    }

    String getAccountNumber() {
        return accountNumber;
    }
}

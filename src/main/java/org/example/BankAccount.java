package org.example;

public class BankAccount implements Account{
private double balance;

    public BankAccount() {
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
balance += amount;
        System.out.println("Deposited $ " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance < amount){
            System.out.println("Insufficient balanced!");
            return;
        }
balance -= amount;
        System.out.println("Withdraw $ " + amount);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

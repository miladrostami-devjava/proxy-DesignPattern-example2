package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
Account account = new SecureBankAccountProxy(1212);
account.deposit(10000);
account.withdraw(4500);
        System.out.println(account.getBalance());



    }
}

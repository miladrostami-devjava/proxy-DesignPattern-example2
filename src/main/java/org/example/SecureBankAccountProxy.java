package org.example;

import java.time.LocalDate;

public class SecureBankAccountProxy implements Account{
  private Account account;
  private int code;

    public SecureBankAccountProxy(int code) {
        this.code = code;
    }
private boolean authenticate(int code){
        return  code == 1212;
}
private boolean authorize(){
        return true;
}
private  void logAccess(String action){

    System.out.println("Access logging @ " + LocalDate.now() + "with code :" + code);
    System.out.println("Access logging @ " + LocalDate.now() + "with action :" + action);
}



    @Override
    public void deposit(double amount) {
if (authenticate(this.code) && authorize()){
    if (account == null){
        account = new BankAccount();
    }
    logAccess("Deposited!!!");
}else {
    System.out.println("account denied");
}

    }



    @Override
    public void withdraw(double amount) {
if (authenticate(this.code) && authorize()){
    if (account == null){
        account = new BankAccount();
    }
    logAccess("Withdraw!!");
}else {
    System.out.println("account denied!");
}
    }

    @Override
    public double getBalance() {
        if (authenticate(this.code) && authorize()){
            if (account == null){
                account = new BankAccount();
            }
            logAccess("get balanced!!");
            return  account.getBalance();
        }else {
            System.out.println("Access denied!!!!!");
        }
        return 0;
    }
}

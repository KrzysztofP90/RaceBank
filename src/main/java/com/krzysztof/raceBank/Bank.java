package com.krzysztof.raceBank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public BigDecimal getAllBalance() {
        BigDecimal balance = new BigDecimal(0);
        for (Account account : this.accounts) {
            balance = balance.add(account.getBalance());
        }
        return balance;
    }

    public BigDecimal getAccountBalance(int accountNumber) {
        return this.accounts.get(accountNumber).getBalance();
    }

    public void add10AccountsWith10000BalanceToBank() {
        for (int i = 0; i < 10; i++) {
            this.addAccount(new Account(i, new BigDecimal(10000)));
        }
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, BigDecimal amount) {
        this.accounts.get(fromAccountNumber).setBalance(this.accounts.get(fromAccountNumber).getBalance().add(amount.negate()));
        this.accounts.get(toAccountNumber).setBalance(this.accounts.get(toAccountNumber).getBalance().add(amount));
    }
}

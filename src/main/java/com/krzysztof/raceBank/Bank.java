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
}

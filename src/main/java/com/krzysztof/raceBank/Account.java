package com.krzysztof.raceBank;

import java.math.BigDecimal;

public class Account {

    private int num;
    private BigDecimal balance;

    public Account(int num, BigDecimal balance) {
        this.num = num;
        this.balance = balance;
    }

    public int getNum() {
        return num;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}

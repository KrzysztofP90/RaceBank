package com.krzysztof.raceBank;


import java.math.BigDecimal;

public class App
{
    public static void main( String[] args )
    {
        Bank bank = new Bank();
        bank.add10AccountsWith10000BalanceToBank();
        System.out.println(bank.getAllBalance());
        bank.transfer(0,1,new BigDecimal(10000));
        System.out.println(bank.getAccountBalance(1));
        System.out.println(bank.getAccountBalance(0));


    }



}

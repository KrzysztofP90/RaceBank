package com.krzysztof.raceBank;


import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class App
{
    public static void main( String[] args )
    {
        Bank bank = new Bank();
        bank.add10AccountsWith10000BalanceToBank();
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 2000; i++) {
            bank.executeSynchronizedTransferInSeparateThread(
                    random.nextInt(10), random.nextInt(10), new BigDecimal(random.nextInt(1000)));
            System.out.println(bank.getAllBalance());
        }
        long end = System.currentTimeMillis();
        double timeInSec = (double) (end - start) / (double) 1000;
        System.out.println("Time of operations:" + timeInSec + " second");
    }



}

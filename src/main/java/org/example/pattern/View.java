package org.example.pattern;

import org.example.computer.Computer;
import org.example.user.User;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class View implements VIewInter{
    @Override
    public void finalStatistics(double totalSum, int i) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("The final report is: ");
        System.out.println("In " + i + " days we get " + Math.round(totalSum * 1000000000) / 1000000000.0);
        System.out.println("Income: " + Math.round(totalSum * 0.05 * 1000000000) / 1000000000.0);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    @Override
    public void endProg() {
        System.out.println("***************************************");
        System.out.print("Tap 0 to stop or 1 to continue: ");
    }
    @Override
    public void monthStatistics(int mouth, int mouthSum) {
        System.out.println("***************************************");
        System.out.println(mouth + ". Mouth");
        System.out.println("Total money: " + mouthSum);
        System.out.println("Income: " + mouthSum * 0.12);
    }
    @Override
    public void daySumEnd(int i, int sum) {
        System.out.println(i + ". Day sum: " + sum);
        System.out.println("--------------------");
    }
    @Override
    public void productBuy(Map<Computer, Integer> market, Computer computer, User person) {
        if (market.get(computer) > 0) {
            if (person.getMoney() >= computer.getPrice()) {
                System.out.println(" and he buy it!");
            } else {
                System.out.println(" and he cannot buy it");
                if (market.entrySet().stream().anyMatch(computerIntegerEntry -> person.getMoney() >= computerIntegerEntry.getKey().getPrice())) {
                    Map.Entry<Computer, Integer> entry = market.entrySet().stream()
                            .filter(computerIntegerEntry -> person.getMoney() >= computerIntegerEntry.getKey().getPrice())
                            .findFirst().orElseThrow();
                    if (market.get(entry.getKey()) > 0) {
                        System.out.println("Instead of that he buy " + entry.getKey().getName() + " with price " + entry.getKey().getPrice());
                    }
                }
            }
        } else {
            System.out.println("\nBut not in the stock");
        }
    }
    @Override
    public void clientType(List<User> personList, Computer computer, User person) {
        if (person.equals(personList.get(0))) {
            System.out.print("Client with " + person.getMoney() + " want to buy " + computer.getName() + " with price of " + computer.getPrice());
        } else {
            System.out.print("Vip client with " + person.getMoney() + " want to buy " + computer.getName() + " with price of " + computer.getPrice());
        }
    }
    @Override
    public void dayCount(int i) {
        System.out.println("--------------------");
        System.out.println(i + ". Day Started:");
    }
    @Override
    public void conterStarted() {
        System.out.println("Counter Started:");
    }
    @Override
    public String getString(Scanner scanner) {
        String a;
        a = scanner.next();
        return a;
    }
}

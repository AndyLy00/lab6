package org.example.pattern;

import org.example.computer.Computer;
import org.example.user.User;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface VIewInter {
    void finalStatistics(double totalSum, int i);

    void endProg();

    void monthStatistics(int mouth, int mouthSum);

    void daySumEnd(int i, int sum);

    void productBuy(Map<Computer, Integer> market, Computer computer, User person);

    void clientType(List<User> personList, Computer computer, User person);

    void dayCount(int i);

    void conterStarted();

    String getString(Scanner scanner);
}

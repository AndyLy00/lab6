package org.example.pattern;

import org.example.components.hard.HardDisk;
import org.example.components.motherboards.MotherBoard;
import org.example.components.processors.Processor;
import org.example.components.rams.Ram;
import org.example.components.video.VideoCard;
import org.example.computer.Computer;
import org.example.user.User;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Controller implements ControllerInter{
    ModelInter model = new Model();
    VIewInter view = new View();
    @Override
    public void show() {
        HardDisk hardDisk1 = model.getHardDisk1();
        HardDisk hardDisk2 = model.getHardDisk2();
        HardDisk hardDisk3 = model.getHardDisk3();
        MotherBoard motherBoard1 = model.getMotherBoard1();
        MotherBoard motherBoard2 = model.getMotherBoard2();
        MotherBoard motherBoard3 = model.getMotherBoard3();
        Processor processor1 = model.getProcessor1();
        Processor processor2 = model.getProcessor2();
        Processor processor3 = model.getProcessor3();
        Ram ram1 = model.getRam1();
        Ram ram2 = model.getRam2();
        Ram ram3 = model.getRam3();
        VideoCard videoCard1 = model.getVideoCard1();
        VideoCard videoCard2 = model.getVideoCard2();
        VideoCard videoCard3 = model.getVideoCard3();
        Computer computer1 = model.getComputer1(hardDisk1, motherBoard1, processor1, ram1, videoCard1);
        Computer computer2 = model.getComputer2(hardDisk1, motherBoard2, processor3, ram1, videoCard2);
        Computer computer3 = model.getComputer3(hardDisk3, motherBoard1, processor2, ram3, videoCard3);
        Computer computer4 = model.getComputer4(hardDisk1, motherBoard2, processor1, ram2, videoCard1);
        Computer computer5 = model.getComputer5(hardDisk2, motherBoard3, processor1, ram2, videoCard2);
        Computer computer6 = model.getComputer6(hardDisk2, motherBoard2, processor2, ram3, videoCard3);
        List<Computer> computers = model.getComputers(computer1, computer2, computer3, computer4, computer5, computer6);
        Map<Computer, Integer> market = model.getComputerIntegerMap(computer1, computer2, computer3, computer4, computer5, computer6);
        double totalSum = 0.0;
        int mouth = 1;
        int nrOfUsers;
        int mouthSum = 0;
        String a;
        Scanner scanner = model.getScanner();
        Random random = model.getRandom();
        List<User> personList = model.getUsers();
        view.conterStarted();//view
        boolean b = true;
        for (int i = 1; b; i++) {
            int sum = 0;
            nrOfUsers = model.getNrOfUsers(random);
            view.dayCount(i);
            for (int j = 0; j < nrOfUsers; j++) {
                Computer computer = computers.get(random.nextInt(computers.size()));
                User person = model.getUser(computers, random, personList, computer);
                view.clientType(personList, computer, person); //view
                //Client Buy Something
                view.productBuy(market, computer, person); //view
                if (market.get(computer) > 0) {
                    if (model.moneyCheck(computer, person)) {
                        model.marketPut1(market, computer);
                        if (model.findPerson(personList, person)) {
                            sum = model.getSum1(sum, computer);
                        } else {
                            sum = model.getSum2(sum, computer);
                        }
                    } else {
                        if (model.findProduct(market, person)) {
                            Map.Entry<Computer, Integer> entry = model.getComputerIntegerEntry(market, person);
                            if (model.presentProduct(market, entry)) {
                                model.marketPut2(market, entry);
                                if (model.findPerson2(personList, person)) {
                                    sum = model.getSum3(sum, entry);
                                } else {
                                    sum = model.getSum4(sum, entry);
                                }

                            }
                        }
                    }
                }
            }
            mouthSum = model.getMouthSum(mouthSum, sum);
            view.daySumEnd(i, sum); //view
            if (model.monthCheck(i)) {
                view.monthStatistics(mouth, mouthSum); //view
                totalSum = model.getTotalSum(totalSum, mouthSum);
                mouth = model.getMouth(mouth);
                mouthSum = model.monthRestore();
                model.marketRestore(computer1, computer2, computer3, computer4, computer5, computer6, market);
                view.endProg(); //view
                a = view.getString(scanner); //view
                if (model.stopCheck(a)) {
                    view.finalStatistics(totalSum, i); //view
                    b = false;
                }
            }
        }
    }
}


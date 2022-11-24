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

public interface ModelInter {
    int monthRestore();

    int getMouth(int mouth);

    boolean stopCheck(String a);

    void marketRestore(Computer computer1, Computer computer2, Computer computer3, Computer computer4, Computer computer5, Computer computer6, Map<Computer, Integer> market);

    double getTotalSum(double totalSum, int mouthSum);

    boolean monthCheck(int i);

    int getMouthSum(int mouthSum, int sum);

    int getSum4(int sum, Map.Entry<Computer, Integer> entry);

    int getSum3(int sum, Map.Entry<Computer, Integer> entry);

    boolean findPerson2(List<User> personList, User person);

    void marketPut2(Map<Computer, Integer> market, Map.Entry<Computer, Integer> entry);

    boolean presentProduct(Map<Computer, Integer> market, Map.Entry<Computer, Integer> entry);

    boolean findProduct(Map<Computer, Integer> market, User person);

    boolean findPerson(List<User> personList, User person);

    boolean moneyCheck(Computer computer, User person);

    int getSum2(int sum, Computer computer);

    int getSum1(int sum, Computer computer);

    void marketPut1(Map<Computer, Integer> market, Computer computer);

    Map.Entry<Computer, Integer> getComputerIntegerEntry(Map<Computer, Integer> market, User person);

    User getUser(List<Computer> computers, Random random, List<User> personList, Computer computer);

    int getNrOfUsers(Random random);

    List<User> getUsers();

    Random getRandom();

    Scanner getScanner();

    Map<Computer, Integer> getComputerIntegerMap(Computer computer1, Computer computer2, Computer computer3, Computer computer4, Computer computer5, Computer computer6);

    List<Computer> getComputers(Computer computer1, Computer computer2, Computer computer3, Computer computer4, Computer computer5, Computer computer6);

    Computer getComputer6(HardDisk hardDisk2, MotherBoard motherBoard2, Processor processor2, Ram ram3, VideoCard videoCard3);

    Computer getComputer5(HardDisk hardDisk2, MotherBoard motherBoard3, Processor processor1, Ram ram2, VideoCard videoCard2);

    Computer getComputer4(HardDisk hardDisk1, MotherBoard motherBoard2, Processor processor1, Ram ram2, VideoCard videoCard1);

    Computer getComputer3(HardDisk hardDisk3, MotherBoard motherBoard1, Processor processor2, Ram ram3, VideoCard videoCard3);

    Computer getComputer2(HardDisk hardDisk1, MotherBoard motherBoard2, Processor processor3, Ram ram1, VideoCard videoCard2);

    Computer getComputer1(HardDisk hardDisk1, MotherBoard motherBoard1, Processor processor1, Ram ram1, VideoCard videoCard1);

    VideoCard getVideoCard3();

    VideoCard getVideoCard2();

    VideoCard getVideoCard1();

    Ram getRam3();

    Ram getRam2();

    Ram getRam1();

    Processor getProcessor3();

    Processor getProcessor2();

    Processor getProcessor1();

    MotherBoard getMotherBoard3();

    MotherBoard getMotherBoard2();

    MotherBoard getMotherBoard1();

    HardDisk getHardDisk3();

    HardDisk getHardDisk2();

    HardDisk getHardDisk1();
}

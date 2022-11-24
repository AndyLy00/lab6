package org.example.pattern;

import org.example.components.hard.HardDisk;
import org.example.components.motherboards.MotherBoard;
import org.example.components.processors.Processor;
import org.example.components.rams.Ram;
import org.example.components.video.VideoCard;
import org.example.computer.Computer;
import org.example.computer.Laptops;
import org.example.user.User;
import org.example.user.VipUser;

import java.util.*;

public class Model implements ModelInter{
    @Override
    public int monthRestore() {
        int mouthSum;
        mouthSum = 0;
        return mouthSum;
    }
    @Override
    public int getMouth(int mouth) {
        mouth++;
        return mouth;
    }
    @Override
    public boolean stopCheck(String a) {
        return a.equals("0");
    }
    @Override
    public void marketRestore(Computer computer1, Computer computer2, Computer computer3, Computer computer4, Computer computer5, Computer computer6, Map<Computer, Integer> market) {
        market.put(computer1, 25);
        market.put(computer2, 34);
        market.put(computer3, 42);
        market.put(computer4, 34);
        market.put(computer5, 18);
        market.put(computer6, 32);
    }
    @Override
    public double getTotalSum(double totalSum, int mouthSum) {
        totalSum += mouthSum;
        return totalSum;
    }
    @Override
    public boolean monthCheck(int i) {
        return i % 30 == 0;
    }
    @Override
    public int getMouthSum(int mouthSum, int sum) {
        mouthSum += sum;
        return mouthSum;
    }
    @Override
    public int getSum4(int sum, Map.Entry<Computer, Integer> entry) {
        sum += entry.getKey().getPrice() * 0.05;
        return sum;
    }
    @Override
    public int getSum3(int sum, Map.Entry<Computer, Integer> entry) {
        sum += entry.getKey().getPrice();
        return sum;
    }
    @Override
    public boolean findPerson2(List<User> personList, User person) {
        return person.equals(personList.get(0));
    }
    @Override
    public void marketPut2(Map<Computer, Integer> market, Map.Entry<Computer, Integer> entry) {
        market.put(entry.getKey(), market.get(entry.getKey()) - 1);
    }
    @Override
    public boolean presentProduct(Map<Computer, Integer> market, Map.Entry<Computer, Integer> entry) {
        return market.get(entry.getKey()) > 0;
    }
    @Override
    public boolean findProduct(Map<Computer, Integer> market, User person) {
        return market.entrySet().stream().anyMatch(computerIntegerEntry -> person.getMoney() >= computerIntegerEntry.getKey().getPrice());
    }
    @Override
    public boolean findPerson(List<User> personList, User person) {
        return person.equals(personList.get(0));
    }
    @Override
    public boolean moneyCheck(Computer computer, User person) {
        return person.getMoney() >= computer.getPrice();
    }
    @Override
    public int getSum2(int sum, Computer computer) {
        sum += computer.getPrice() * 0.05;
        return sum;
    }
    @Override
    public int getSum1(int sum, Computer computer) {
        sum += computer.getPrice();
        return sum;
    }
    @Override
    public void marketPut1(Map<Computer, Integer> market, Computer computer) {
        market.put(computer, market.get(computer) - 1);
    }
    @Override
    public Map.Entry<Computer, Integer> getComputerIntegerEntry(Map<Computer, Integer> market, User person) {
        return market.entrySet().stream()
                .filter(computerIntegerEntry -> person.getMoney() >= computerIntegerEntry.getKey().getPrice())
                .findFirst().orElseThrow();
    }
    @Override
    public User getUser(List<Computer> computers, Random random, List<User> personList, Computer computer) {
        User person = personList.get(random.nextInt(personList.size()));
        person.setMoney(random.nextInt(5000, 15000));
        person.setComputer(computers.get(random.nextInt(computers.size())));
        person.setComputer(computer);
        return person;
    }
    @Override
    public int getNrOfUsers(Random random) {
        int nrOfUsers;
        nrOfUsers = random.nextInt(1, 4);
        return nrOfUsers;
    }
    @Override
    public List<User> getUsers() {
        return new ArrayList<>(List.of(new User(), new VipUser()));
    }
    @Override
    public Random getRandom() {
        return new Random();
    }
    @Override
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    @Override
    public Map<Computer, Integer> getComputerIntegerMap(Computer computer1, Computer computer2, Computer computer3, Computer computer4, Computer computer5, Computer computer6) {
        Map<Computer, Integer> market = new HashMap<>();
        market.put(computer1, 25);
        market.put(computer2, 34);
        market.put(computer3, 42);
        market.put(computer4, 34);
        market.put(computer5, 18);
        market.put(computer6, 32);
        return market;
    }
    @Override
    public List<Computer> getComputers(Computer computer1, Computer computer2, Computer computer3, Computer computer4, Computer computer5, Computer computer6) {
        return new ArrayList<>(List.of(computer1, computer2, computer3, computer4, computer5, computer6));
    }
    @Override
    public Computer getComputer6(HardDisk hardDisk2, MotherBoard motherBoard2, Processor processor2, Ram ram3, VideoCard videoCard3) {
        return new Laptops("Sistem Desktop Intel NUC Barebone", hardDisk2, motherBoard2, processor2, ram3, videoCard3, "16");
    }
    @Override
    public Computer getComputer5(HardDisk hardDisk2, MotherBoard motherBoard3, Processor processor1, Ram ram2, VideoCard videoCard2) {
        return new Laptops("Sistem Desktop Zotac Barebone Magnus", hardDisk2, motherBoard3, processor1, ram2, videoCard2, "16");
    }
    @Override
    public Computer getComputer4(HardDisk hardDisk1, MotherBoard motherBoard2, Processor processor1, Ram ram2, VideoCard videoCard1) {
        return new Laptops("Sistem Desktop Atol PC1122MP", hardDisk1, motherBoard2, processor1, ram2, videoCard1, "16");
    }
    @Override
    public Computer getComputer3(HardDisk hardDisk3, MotherBoard motherBoard1, Processor processor2, Ram ram3, VideoCard videoCard3) {
        return new Laptops("Laptop Asus ROG Strix", hardDisk3, motherBoard1, processor2, ram3, videoCard3, "16");
    }
    @Override
    public Computer getComputer2(HardDisk hardDisk1, MotherBoard motherBoard2, Processor processor3, Ram ram1, VideoCard videoCard2) {
        return new Laptops("Asus VivoBook E410MA", hardDisk1, motherBoard2, processor3, ram1, videoCard2, "14");
    }
    @Override
    public Computer getComputer1(HardDisk hardDisk1, MotherBoard motherBoard1, Processor processor1, Ram ram1, VideoCard videoCard1) {
        return new Laptops("Laptop Acer Extensa", hardDisk1, motherBoard1, processor1, ram1, videoCard1, "15.6");
    }
    @Override
    public VideoCard getVideoCard3() {
        return new VideoCard("Gigabyte GeForce RTX3090 ", 7990, 0.8, "7680x4320", 12);
    }
    @Override
    public VideoCard getVideoCard2() {
        return new VideoCard("GeForce", 3990, 0.5, "7680x4320", 12);
    }
    @Override
    public VideoCard getVideoCard1() {
        return new VideoCard("Sapphire Radeon", 1990, 0.3, "4096x2160", 12);
    }
    @Override
    public Ram getRam3() {
        return new Ram("Goodram", 660, 0.2, 1, 8);
    }
    @Override
    public Ram getRam2() {
        return new Ram("Fury Beast", 1000, 0.4, 4, 16);
    }
    @Override
    public Ram getRam1() {
        return new Ram("DDR4", 800, 0.2, 2, 8);
    }
    @Override
    public Processor getProcessor3() {
        return new Processor("Ryzen 5 5500", 3600, 0.3, 6, "AMD");
    }
    @Override
    public Processor getProcessor2() {
        return new Processor("Core i5-10400F", 2400, 0.2, 4, "Intel");
    }
    @Override
    public Processor getProcessor1() {
        return new Processor("Intel Core i3", 1500, 0.1, 2, "Intel");
    }
    @Override
    public MotherBoard getMotherBoard3() {
        return new MotherBoard("Gigabyte", 1640, 0.3, 2, "Intel UHD");
    }
    @Override
    public MotherBoard getMotherBoard2() {
        return new MotherBoard("Biostar Racing", 3000, 0.4, 8, "Intel UHD");
    }
    @Override
    public MotherBoard getMotherBoard1() {
        return new MotherBoard("TN+film", 1000, 0.4, 2, "Intel UHD");
    }
    @Override
    public HardDisk getHardDisk3() {
        return new HardDisk("Western Digital Caviar", 550, 0.3, 256);
    }
    @Override
    public HardDisk getHardDisk2() {
        return new HardDisk("Seagate Barracuda", 600, 0.4, 512);
    }
    @Override
    public HardDisk getHardDisk1() {
        return new HardDisk("PCIe M.2 NVMe", 500, 0.2, 256);
    }
}

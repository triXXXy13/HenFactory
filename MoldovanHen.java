package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements  Country {
     int getCountOfEggsPerMonth(){
        return 20;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
}

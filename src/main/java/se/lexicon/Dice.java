package se.lexicon;

import java.util.Random;

public enum Dice {

    D6(6), D10(10), D20(20), D100(100);

    private int d6;
    private int d10;
    private int d20;
    private int d100;

    Dice(int i) {
        this.d6 = d6;
        this.d10 = d10;
        this.d20 = d20;
        this.d100 = d100;
    }


//    int a = Integer.MAX_VALUE;
//    int b = Integer.MAX_VALUE;
//    int c = Integer.MAX_VALUE;
//    int d = Integer.MAX_VALUE;


    public Random roll = new Random();
    int numberD6 = 6;
    int intRandom6 = roll.nextInt(numberD6);

    Random roll2 = new Random();
    int numberD10 = 10;
    int intRandom10 = roll.nextInt(numberD10);

    Random roll3 = new Random();
    int numberD20 = 20;
    int intRandom20 = roll.nextInt(numberD20);

    Random roll4 = new Random();
    int numberD100 = 100;
    int intRandom100 = roll.nextInt(numberD100);
}
package main;

import icecream.*;

public class Main {
    public static void main(String[] args) {
        Icecream[] Ice = new Icecream[10];
        Ice[0] = new Icecream("IceA", true, 30.0);
        Ice[1] = new Icecream("IceB", true, 29.4);
        Ice[2] = new Icecream("Aw", false, 20.3);
        Ice[3] = new Icecream("IceB", true, 40.6);
        Ice[4] = new Icecream("IceB", 50);
        Ice[5] = new Icecream("IceB", 30.4);
        Ice[6] = new Icecream("IceB", 32.5);
        Ice[7] = new Icecream("IceB", false, 12.0);

        Icecream Math = new Icecream();

        System.out.println("Number of chocolate ice cream:" + Math.ChocoMath(Ice, 8));
        System.out.println("Average tallow percentage: " + String.format("%.2f", Math.TallowMath(Ice, 8)));
    }
}

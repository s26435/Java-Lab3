package com.company;
import java.util.Random;


public class RandomNumbers {
    private int tab[];

    public RandomNumbers(int tab[])
    {
            this.tab = tab;
    }

    public int randomElement()
    {
        Random rand = new Random();
        int x = rand.nextInt(tab.length-1);
        return tab[x];
    }

    public static void main(String[] args)
    {
        int tab[] = {1,2,3,4};
        RandomNumbers x = new RandomNumbers(tab);
        System.out.println(x.randomElement());
    }
}

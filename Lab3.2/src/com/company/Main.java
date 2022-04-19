package com.company;
import java.util.*;

public class Main {
    public static String firstLetter(String s)
    {
        String temp, temp2;
        temp = s.substring(0,1);
        temp2 = s.substring(1,s.length());
        s = temp.toUpperCase() + temp2.toLowerCase();
        return s;
    }

    public static String eachWord(String s)
    {
        String oldString = s;
        String newString = "";
        oldString = " "+ oldString;
        for(int i=0;i<oldString.length(); ){
            char ch  =  oldString.charAt(i);
            if(ch == ' '){
                newString = newString + ' ' + Character.toUpperCase(oldString.charAt(i+1));
                i=i+2;
            }
            else {
                newString = newString + ch;
                i++;
            }
        }
        return newString.trim();
    }

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        String napis = s.nextLine();
        System.out.println(napis.toUpperCase());
        System.out.println(napis.toLowerCase());
        System.out.println(firstLetter(napis));
        System.out.println(eachWord(napis));
    }
}

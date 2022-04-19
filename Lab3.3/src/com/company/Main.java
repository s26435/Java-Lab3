package com.company;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        String K = s.nextLine();
        Vector<String> words = new Vector<>();
        String temp = "";
        String wynikPrzed = "";
        String wynikPrzy = "";
        Boolean przedrostki[];
        Boolean przyrostki[];
        int i = 0;
        //tworzenie vectora słów
        while(i<line.length())
        {
            if(line.charAt(i)==' ')
            {
                words.add(temp.trim());
                temp = "";
            }
            temp = temp + line.charAt(i);
            i++;
        }
        //tablice przedrostków i przyrostków
        przedrostki = new Boolean[words.size()+1];
        przyrostki = new Boolean[words.size()+1];
        if(!temp.equals("")) words.add(temp.trim());
        //ustawianie tablic
        for(int j = 0; j < words.size(); j++)
        {
            przedrostki[j] = false;
            przyrostki[j] = false;
        }
        //sprawdzanie słów
        for(int j = 0; j < words.size(); j++)
        {
            temp = words.get(j);
            if(temp.contains(K))
            {
                if(temp.indexOf(K) == 0) przedrostki[j] = true;
                else przyrostki[j] = true;
            }
        }
        //zapisywanie przedrostków
        for(int j = 0; j < words.size(); j++)
        {
            if(przedrostki[j]) System.out.println(K + " jest przedrostkiem słowa " + words.get(j));
        }
        //zapisywanie przyrostków
        for(int j = 0; j < words.size(); j++)
        {
            if (przyrostki[j]) System.out.println(K + " jest przyrostkiem słowa " + words.get(j));
        }
    }
}

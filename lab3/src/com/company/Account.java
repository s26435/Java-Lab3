package com.company;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount)
    {
        this.balance += amount;
    }

    public void debit(int amount)
    {
        if(getBalance()>=amount) this.balance -= amount;
    }

    public String toString()
    {
        return "Account[id= " + getID() + ",name = " + getName() + ",balance = " + getBalance()+ "]";
    }
}

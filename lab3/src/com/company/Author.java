package com.company;

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String toString()
    {
        return "Author[name=" + getName() + ",email=" + getEmail() + ",gender=" + getGender()+"]";
    }
}

class Book
{

    private String name;
    private Author author[];
    private double price;
    private int qty = 0;

    public Book(String name, double price  , Author author[])
    {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name,double price,Author author[], int qty)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return author;
    }

    public String getAuthorNames()
    {
        String temp = "";
        Author tab[];
        tab = getAuthors();
        for(int i = 0; i < tab.length; i++) temp = temp + "," + tab[i].getName();
        temp = temp.substring(1,temp.length());
        return temp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty()
    {
        return this.qty;
    }

    public String toString()
    {
        String temp = "";
        for(int i = 0; i < author.length; i++){
            temp = temp + author[i].toString() + ", ";
        }
        temp = temp.substring(0,temp.length()-2);
        return "Book[name=" + getName() +  ",price=" + getPrice() + ",authors=[" + temp + "],qty=" + getQty() + "]";
    }

    public static void main(String[] args)
    {
        Author ja = new Author("Jan Wolski", "j112-2002@gmail.com",'m');
        Author jag = new Author("dupa", "j112-2002@gmail.com",'k');
        Author tabu[] = {ja, jag};
        Book dupa = new Book("dupa", 12.99, tabu);
        System.out.println(dupa.getAuthorNames());
        System.out.println(dupa.toString());
    }
}






package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book{

     private String name;
     private int id;

     public Book(String name, int id) {
         this.name = name;
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

 class BookCatalog{

     private List<Book> bookList;

     public BookCatalog(List<Book> bookList) {
         this.bookList = bookList;
     }

     public void addBook(){
         Scanner in = new Scanner(System.in);
         System.out.println("Enter book name: ");
         String name = in.next();
         System.out.println("Enter book id: ");
         int id = in.nextInt();

         Book book = new Book(name,id);
         bookList.add(book);
     }

     public void showBooks(){
         System.out.println(bookList);
     }

 }

public class Catalog {

    public static void main(String[] args) {

        BookCatalog bookCatalog = new BookCatalog(new ArrayList<Book>());

        bookCatalog.addBook();
        bookCatalog.showBooks();

    }

}

/*
Name: Daniel Chung
Student ID: 1331774
Course: CSCI 185 - Programming 2
Section: M03
 */

import LibraryFiles.Library;// Reporting the data from the Library class
import LibraryFiles.Book;// Reporting the data from the Book Class


public class Main {// This is the creation of a public class
    public static void main(String[] args) {// This is beginning of a string argument statements
        Book b1 = new Book();// Utilizing the default constructors for the book class
        Book b2 = new Book("The Godfather", "Mario Puzo", "Mafia");// Setting the official names for the title, author and genre of the book
        Book b3 = new Book (b2);// Creates a new book from b3
        System.out.println(b1);// Printing the Representation of b1

        Book[] books = {b1, b2, b3};// Creates an array of Book objects called books

        Library l1 = new Library();// Utilizing default constructors for the library class
        Library l2 = new Library("Nyit Library", "1855 Broadway", books );// Setting the official names for the name of the library, address and their books
        Library l3 = new Library (l2);// Creating a new Library Object
        System.out.println(l3);// Printing the representation of l3
    }
}
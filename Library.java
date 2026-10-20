package LibraryFiles;

/*
Name: Daniel Chung
Student ID: 1331774
Course: CSCI 185 - Programming 2
Section: M03
 */


import LibraryFiles.Book;

public class Library {// Declaring a public class named Library
    private String name;// Defining a private string named name
    private String address;// Defining a private string called address
    private Book[] books;// Defining a private book array named books

    public Library() {// This is a constructor for the library class
        this.name = "library name";// This is to initialize the library name
        this.address = "library address";// This is to initialize th library address
        this.books = new Book[0];// This is to inititalize the book array of one book
    }

    public Library(String name, String address, Book[] books) {// This is a parameterized constructor
        this.name = name;// assigning the name parameter to the name attribute
        this.address = address;// assigning the name address to the name attribute
        this.books = books;// assigning the name books to the parameter, similar to the attribute
    }

    public Library(Library library) {//This is a copy constructor
        this.name = library.name;// copying the name attribute
        this.address = library.address;// copying the address attribute
        this.books = library.books;// copying the book array reference
    }

    public String getName(String name) {// this is a getter method
        return this.name;// returning the getter
    }

    public String getAddress() {// this is a getter method
        return this.address;// returning the getter
    }

    public Book[] getBooks() {// this creates a new array of the same original length
        Book[] booksCopy = new Book[books.length];
        for (int i = 0; i < this.books.length; i++) {
            Book b = new Book(this.books[i]);
            booksCopy[i] = b;
        }
        return booksCopy;// return the array of copied books
    }

    public void setName(String name) {// this is a setter method
        this.name = name;// returning the set
    }

    public void setAddress(String address) {// this is a setter method
        this.address = address;// returning the set address
    }

    public void setBooks(Book[] books) {// this is a setter method
        this.books = books;// returning the set books array
    }

    private String bookTitlesFromBooks() {// This takes all of the string si the array of book titles, separating them by commas
        if(this.books.length == 0)
            return "";
        String ret = "";
        for (int i = 0; i < this.books.length - 1; i++) {
            ret += this.books[i].getTitle() + " , ";
        }
        ret += this.books[this.books.length - 1].getTitle();// handles the last title separately to avoid an extra comma
        return ret;
    }

    @Override
    public String toString(){// returns a string representation of the Library Object
        return "Name : " + this.name + "\n" +// returning the format for the official name style
                "Address: " + this.address + "\n" +// returning the format for the official address style
                "Books" + this.bookTitlesFromBooks();// returning the format for the official books style from the array
    }




}


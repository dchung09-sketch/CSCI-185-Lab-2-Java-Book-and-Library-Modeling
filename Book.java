/*
Name: Daniel Chung
Student ID: 1331774
Course: CSCI 185 - Programming 2
Section: M03
 */


package LibraryFiles;// this file comes from the package library files

public class Book {// declaring a public class named book
    private String title;// setting a string named title
    private String author;// setting a string with the variable name author
    private String genre;// stting the string with the variable name genre

    public Book(){// this is a constructor for the book class
        this.title = "book title";// this is declaring the book title input
        this.author = "book author";// declaring the author variable input
        this.genre = "book genre";// declaring the book genre variable input
    }
    public Book(String title, String author, String genre){// This is a parameterized constructor
        this.title = title;// assigning the title parameter to the title attribute
        this.author = author;// assigning the author parameter to the author attribute
        this.genre = genre;// assigning the genre parameter to the genre attribute
    }

    public Book(Book book){//This is a copy constructor
        this.title = book.title;// copying the title attribute
        this.author = book.author;// copying the author attribute
        this.genre = book.genre;// copying the genre attribute
    }

    public String getTitle(){// this is a getter method
        return this.title;
    }
    public String getAuthor(){// this is a getter method
        return this.author;
    }
    public String getgenre(){// this is a getter method
        return this.genre;
    }
    public void setTitle(String title){// this is a setter method
        this.title = title;
    }
    public void setAuthor(String author){// this is a setter method
        this.author = author;
    }
    public void setGenre(String genre){// this is a setter method
        this.genre = genre;
    }
    @Override
    public String toString() {// returns a string representation of the Book Object
        return "Title: " + this.title + "\n" +// Returning the format for the title style
                "Author: " + this.author + "\n" +// Returning the format for the author style
                "Genre: " + this.genre;// Returning the format for the genre style
    }

}

# Java Book and Library Model

**Author:** Daniel Chung  
**Course:** CSCI 185 – Programming II  
**Section:** M03  
**Institution:** New York Institute of Technology  
**Language:** Java

## Overview

This project uses Book and Library classes to represent a library and its collection. It demonstrates object creation, constructor overloading, copy constructors, getters and setters, and the distinction between sharing an array reference and returning independent copies.

A separate Main class creates sample objects and displays their information. The program uses predefined data and does not require keyboard input.

## Files

| File | Purpose |
|------|---------|
| `Main.java` | Creates sample Book and Library objects and prints their details. |
| `LibraryFiles/Book.java` | Defines a book with a title, author, and genre. |
| `LibraryFiles/Library.java` | Defines a library with a name, address, and array of books. |

The uploaded driver is named `Main-1 (1).java`. Rename it to `Main.java` before compiling.

## Book Class

The Book class stores three private fields:

- `title`
- `author`
- `genre`

It provides:

- A default constructor with placeholder values.
- A parameterized constructor for custom book information.
- A copy constructor that creates a separate Book object from an existing one.
- Getter and setter methods.
- An overridden `toString()` method displaying the title, author, and genre.

## Library Class

The Library class stores:

- A library name.
- A library address.
- An array of Book objects.

It provides:

- A default constructor with an empty book array.
- A parameterized constructor.
- A copy constructor.
- Getter and setter methods.
- A helper method that combines book titles into a comma-separated string.
- An overridden `toString()` method displaying library information.

## Copying Behavior

The project demonstrates different copying approaches:

| Operation | Behavior |
|-----------|----------|
| `new Book(existingBook)` | Creates a separate Book object containing the same field values. |
| `new Library(existingLibrary)` | Copies the name and address but shares the original book-array reference. |
| `library.getBooks()` | Returns a new array containing newly copied Book objects. |
| `library.setBooks(books)` | Stores the supplied array reference directly. |
| Parameterized Library constructor | Stores the supplied array reference directly. |

The Library copy constructor performs a shallow copy of the book collection. Changes to shared books can therefore affect both Library objects.

In contrast, `getBooks()` provides defensive copies of the array and its Book objects. Modifying those returned objects does not modify the library's internal books.

## Demonstration

The main method:

1. Creates a default Book object.
2. Creates a book titled The Godfather by Mario Puzo.
3. Creates a copy of that book.
4. Prints the default book.
5. Places the three books into an array.
6. Creates a default Library object.
7. Creates a library named Nyit Library with the book array.
8. Copies that library and prints the copy.

## Expected Output

```text
Title: book title
Author: book author
Genre: book genre
Name : Nyit Library
Address: 1855 Broadway
Booksbook title , The Godfather , The Godfather
```

The current output joins `Books` directly to the first title. Adding `": "` after `"Books"` in Library.toString() would improve readability.

The repeated title is expected because the collection contains both the original book and its copy.

## Concepts Practiced

- Classes and objects
- Encapsulation with private fields
- Constructor overloading
- Default and parameterized constructors
- Copy constructors
- Arrays of objects
- Getters and setters
- Shared references and defensive copying
- Packages and imports
- Overriding `toString()`

## How to Run

### Requirements

Install a Java Development Kit (JDK) with `javac` and `java` available in your terminal. No external libraries are required.

### Prepare the Files

1. Rename `Main-1 (1).java` to `Main.java`.
2. Create a folder named `LibraryFiles` inside the project folder.
3. Place `Book.java` and `Library.java` inside `LibraryFiles`.
4. Keep `Main.java` and `README.md` at the top level of the project folder.

The folder name must match the `package LibraryFiles;` declaration.

### Compile

Open a terminal in the project folder and run:

```sh
javac Main.java LibraryFiles/Book.java LibraryFiles/Library.java
```

### Run

```sh
java Main
```

## Current Limitations

- The program uses hardcoded sample data.
- It does not implement book searching, borrowing, or individual add/remove operations.
- The Library copy constructor shares its book collection with the original.
- Constructors and setters do not validate null inputs.
- Null book entries can cause errors during copying or title formatting.
- `getName(String name)` accepts an unused parameter; a conventional getter would be `getName()`.
- The genre getter is named `getgenre()` rather than the conventional `getGenre()`.

## Learning Objective

Practice modeling related objects in Java while understanding constructors, encapsulation, arrays of objects, and the effects of copying objects versus sharing references.

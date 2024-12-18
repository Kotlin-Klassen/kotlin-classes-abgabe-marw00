package com.example.kotlin_classes.abschluss_abgabe

/**
 * Represents a library system that manages a collection of books,
 * library addresses, and member functionalities.
 */
class Library {

    // List to store all books in the library.
    private val books = mutableListOf<Book>()

    /**
     * Nested class to represent the address of the library.
     * @property street The street name of the library.
     * @property city The city where the library is located.
     * @property zipCode The postal code of the library.
     */
    class LibraryAddress(val street: String, val city: String, val zipCode: String) {
        fun printAddress() {
            println("Address: $street, $city, $zipCode")
        }
    }

    /**
     * Inner class to represent a library member.
     * @property name The name of the library member.
     * @property memberID A unique identifier for the library member.
     */
    inner class LibraryMember(val name: String, val memberID: String) {

        /**
         * Allows the member to check out a book, updating its status to CheckedOut.
         * @param book The book to check out.
         * @param dueDate The due date for returning the book.
         */
        fun checkoutBook(book: Book, dueDate: String) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.CheckedOut(dueDate)
                println("$name checked out '${book.title}'. Due date: $dueDate")
            } else {
                println("Book '${book.title}' is not available for checkout.")
            }
        }

        /**
         * Allows the member to reserve a book, updating its status to Reserved.
         * @param book The book to reserve.
         */
        fun reserveBook(book: Book) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.Reserved(name)
                println("$name reserved '${book.title}'.")
            } else {
                println("Book '${book.title}' is not available for reservation.")
            }
        }
    }

    /**
     * Adds a new book to the library's collection.
     * @param book The book to add.
     */
    fun addBook(book: Book) {
        books.add(book)
        println("Added '${book.title}' by ${book.author} to the library.")
    }

    /**
     * Searches for books in the library by title or author.
     * @param query The search keyword.
     * @return A list of books matching the search criteria.
     */
    fun searchBooks(criteria: String): List<Book> {
        val results = books.filter {
            it.title.contains(criteria, ignoreCase = true) ||
                    it.author.contains(criteria, ignoreCase = true)
        }

        if (results.isEmpty()) {
            println("No books found matching the search criteria.")
        }

        return results
    }

    /**
     * Displays the current status of all books in the library.
     */
    fun displayBookStatuses() {
        books.forEach { book ->
            println("${book.title} by ${book.author} - ${book.status.getStatusDescription()}")
        }
    }
}

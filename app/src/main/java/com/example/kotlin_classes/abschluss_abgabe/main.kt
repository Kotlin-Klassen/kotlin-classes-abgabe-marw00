package com.example.kotlin_classes.abschluss_abgabe

fun main() {
    // Create a Library instance
    val library = Library()

    // Add a library address
    val address = Library.LibraryAddress("456 Marien", "Novel City", "67890")
    address.printAddress()

    // Add books to the library
    library.addBook(Book("The Great Gatsby", "F. Scott Fitzgerald", Genre.SCIENCE))
    library.addBook(Book("Sapiens", "Yuval Noah Harari", Genre.NON_FICTION))
    library.addBook(Book("The Catcher in the Rye", "J.D. Salinger", Genre.FICTION))
    library.addBook(Book("Percy Jackson", "Rick Riordan", Genre.HISTORY))

    // Create a library member
    val member = library.LibraryMember("Maria", "02")

    // Member checks out a book
    val bookToCheckout = library.searchBooks("The Great Gatsby").firstOrNull()
    if (bookToCheckout != null) {
        member.checkoutBook(bookToCheckout, "2024-12-25")
    }

    // Member reserves a book
    val bookToReserve = library.searchBooks("Percy Jackson").firstOrNull()
    if (bookToReserve != null) {
        member.reserveBook(bookToReserve)
    }

    // Display the status of all books
    println("\nBook statuses:")
    library.displayBookStatuses()
}
package com.example.kotlin_classes.abschluss_abgabe

fun main() {
    // Create a Library instance
    val library = Library()

    // Add a Library Address
    val address = Library.LibraryAddress("123 Main St", "Booktown", "12345")
    address.printAddress()

    // Add books to the library
    library.addBook(Book("1984", "George Orwell", Genre.FICTION))
    library.addBook(Book("A Brief History of Time", "Stephen Hawking", Genre.SCIENCE))
    library.addBook(Book("The Diary of a Young Girl", "Anne Frank", Genre.HISTORY))
    library.addBook(Book("Harry Potter", "J.K. Rowling", Genre.CHILDREN))

    // Create a Library Member
    val member = library.LibraryMember("Alice", "M001")

    // Member checks out a book
    val bookToCheckout = library.searchBooks("1984").firstOrNull()
    if (bookToCheckout != null) {
        member.checkoutBook(bookToCheckout, "2024-12-20")
    }

    // Member reserves a book
    val bookToReserve = library.searchBooks("Harry Potter").firstOrNull()
    if (bookToReserve != null) {
        member.reserveBook(bookToReserve)
    }

    // Display the status of all books
    println("\nBook Statuses:")
    library.displayBookStatuses()
}

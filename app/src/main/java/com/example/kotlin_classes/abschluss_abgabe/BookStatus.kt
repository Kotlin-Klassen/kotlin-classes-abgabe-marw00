package com.example.kotlin_classes.abschluss_abgabe

/**
 * Represents the current status of a book in the library.
 * This sealed class ensures that the possible statuses are strictly defined:
 * - Available: The book is available for checkout.
 * - CheckedOut: The book has been checked out and includes a due date.
 * - Reserved: The book has been reserved and indicates by whom.
 * Each subclass provides a description of its status through the `getStatusDescription` method.
 */
sealed class BookStatus {
    /**
     * Represents a book that is currently available.
     */
    object Available : BookStatus() {
        override fun getStatusDescription() = "The book is available."
    }

    /**
     * Represents a book that has been checked out.
     * @property dueDate The date by which the book must be returned.
     */
    data class CheckedOut(val dueDate: String) : BookStatus() {
        override fun getStatusDescription() = "The book is checked out. Due date: $dueDate"
    }

    /**
     * Represents a book that has been reserved.
     * @property reservedBy The name of the person who reserved the book.
     */
    data class Reserved(val reservedBy: String) : BookStatus() {
        override fun getStatusDescription() = "The book is reserved by $reservedBy."
    }

    /**
     * Abstract method that each subclass must implement to provide
     * a description of its specific status.
     * @return A string describing the current status of the book.
     */
    abstract fun getStatusDescription(): String
}
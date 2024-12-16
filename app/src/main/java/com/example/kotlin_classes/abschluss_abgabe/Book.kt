package com.example.kotlin_classes.abschluss_abgabe

/**
 * Represents a book with its essential properties and current status.
 * @property title The title of the book.
 * @property author The author of the book.
 * @property genre The genre of the book, defined using the `Genre` enum.
 * @property status The current status of the book, which defaults to `Available`.
 */
data class Book(
    val title: String,
    val author: String,
    val genre: Genre,
    var status: BookStatus = BookStatus.Available
)
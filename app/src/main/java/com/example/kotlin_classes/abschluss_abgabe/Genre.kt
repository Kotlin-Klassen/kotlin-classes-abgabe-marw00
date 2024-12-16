package com.example.kotlin_classes.abschluss_abgabe

/**
 * Represents the different genres of books available in the library.
 * Each genre is associated with a description that provides more details
 * about the type of books included in that category.
 * @property description A brief explanation of the genre.
 */
enum class Genre(val description: String) {
    FICTION("Fictional stories and novels"),
    NON_FICTION("Non-fictional works based on facts"),
    SCIENCE("Books about scientific topics"),
    HISTORY("Books about historical events"),
    CHILDREN("Books for children");

    /**
     * Prints the name and description of the genre to the console.
     * This method allows each genre to describe itself when called.
     */
    fun printDescription() {
        println("$name: $description")
    }
}
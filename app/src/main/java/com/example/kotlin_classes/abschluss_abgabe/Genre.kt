package com.example.kotlin_classes.abschluss_abgabe

/**
 * Represents the different genres of books available in the library.
 * Each genre is associated with a description that provides more details
 * about the type of books included in that category.
 * @property description A brief explanation of the genre.
 */
enum class Genre(val description: String) {
    FICTION("Imaginative and creative stories, including novels"),
    NON_FICTION("Informative works based on real events and facts"),
    SCIENCE("Detailed explorations of scientific topics and discoveries"),
    HISTORY("Insights into past events and historical narratives"),
    CHILDREN("Entertaining and educational books for young readers");

    /**
     * Prints the name and description of the genre to the console.
     * This method allows each genre to describe itself when called.
     */
    fun printDescription() {
        println("$name: $description")
    }
}

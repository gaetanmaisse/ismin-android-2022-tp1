package com.ismin.android

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class Bookshelf {
    private val storage = mutableMapOf<String, Book>()


    fun addBook(book: Book) {
        storage[book.isbn] = book
    }

    fun getBook(isbn: String): Book {
        return storage[isbn] ?: throw Exception("Book not found")
    }

    fun getAllBooks(): List<Book> {
        return storage.values.sortedBy { it.title }
    }

    fun getBooksOf(author: String): List<Book> {
        return storage.values.filter { it.author == author }.sortedBy { it.title }
    }

    fun getTotalNumberOfBooks(): Int {
        return storage.size
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getBooksPublishedBefore(publicationDate: LocalDate): List<Book> {
        return storage.filterValues { it.date.isBefore(publicationDate) }.values.sortedBy { it.title }
    }
}

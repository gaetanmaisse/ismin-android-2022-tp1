package com.ismin.android

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class BookshelfUnitTest {
    private val theLordOfTheRings = Book(
        isbn = "978-0544003415",
        title = "The Lord of the Rings",
        author = "J. R. R. Tolkien",
        date = "1954-02-15"
    )

    private val theHobbit = Book(
        isbn= "978-0547928227",
        title = "The Hobbit",
        author = "J. R. R. Tolkien",
        date = "1937-09-21"
    )
    private val aLaRechercheDuTempsPerdu = Book(
        isbn = "978-2070107299",
        title = "À la recherche du temps perdu",
        author = "Marcel Proust",
        date = "1927"
    );

    private lateinit var bookshelf: Bookshelf

    @Before
    fun setup() {
        bookshelf = Bookshelf()
    }

    @Test
    fun getBook_returns_stored_book() {
        bookshelf.addBook(theLordOfTheRings);

        assertEquals(theLordOfTheRings, bookshelf.getBook("978-0544003415"))
    }

    @Test
    fun getAllBooks_returns_all_stored_books_ordered_by_title() {
        bookshelf.addBook(theLordOfTheRings);
        bookshelf.addBook(theHobbit);
        bookshelf.addBook(aLaRechercheDuTempsPerdu);

        assertEquals(
            arrayListOf(theHobbit, theLordOfTheRings, aLaRechercheDuTempsPerdu),
            bookshelf.getAllBooks()
        )
    }

    @Test
    fun getBooksOf_returns_all_books_of_given_author() {
        bookshelf.addBook(theLordOfTheRings);
        bookshelf.addBook(theHobbit);
        bookshelf.addBook(aLaRechercheDuTempsPerdu);

        assertEquals(
            arrayListOf(theHobbit, theLordOfTheRings),
            bookshelf.getBooksOf("J. R. R. Tolkien")
        )
    }

    @Test
    fun getTotalNumberOfBooks_returns_number_of_stored_books() {
        bookshelf.addBook(theLordOfTheRings);
        bookshelf.addBook(theHobbit);
        bookshelf.addBook(aLaRechercheDuTempsPerdu);

        assertEquals(3, bookshelf.getTotalNumberOfBooks())
    }

    @Test
    fun should_not_duplicate_a_book_already_stored() {
        bookshelf.addBook(theLordOfTheRings);
        assertEquals(1, bookshelf.getTotalNumberOfBooks())

        bookshelf.addBook(theLordOfTheRings);
        assertEquals(1, bookshelf.getTotalNumberOfBooks())
    }
}
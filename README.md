Part of Android Development - ISMIN

Course followed by students of Mines St Etienne, ISMIN - M2 Computer Science.

[![Mines St Etienne](./logo.png)](https://www.mines-stetienne.fr/)

# TP1: Introduction to Kotlin

## 📝 Goal

The goal is to discover Kotlin and its ecosystem by implementing:

- 📙 A `Book` data class containing 4 string attributes:
  - `isbn`: International Standard Book Number
  - `title`: Title of the book
  - `author`: Author of the book
  - `date`: Date of publication of the book

- 📚 A `Bookshelf` class that internally store books and have the following public functions:
  - `addBook(book: Book)`
  - `getBook(isbn: String)` returning a `Book`
  - `getBooksOf(author: String)` returning an `List of `Book`s, alpha sorted by title
  - `getAllBooks()` returning a `List of `Book`s, alpha sorted by title
  - `getTotalNumberOfBooks()` returning a number

To guide you and help you find out if everything is ✅ a test suite is available in `BookshelfUnitTest.kt`.
These tests can be ran directly inside your IDE.

## 🚀 Getting Started

 - Start Android Studio
 - Select `Open an existing Android Studio project` and pick this directory

That's it! You can code!

## 🛰 Extra:

- Handle the `date` attribute as a LocaleDate and not a string
- Add a test, and a function `getBooksPublishedBefore(aDate: LocaleDate)` returning a `List` of `Book`s

## 🔑 Solution

An implementation of the TP is available on `solution` branch. To switch to the solution just do:

```
# Commit or revert your local changes
# git add . && git commit -m "YOUR_MSG" 

# Update your repository
git pull

# Switch to `solution` branch
git checkout solution
```
package com.ismin.android

import java.time.LocalDate

data class Book(
    val isbn: String,
    val title: String,
    val author: String,
    val date: LocalDate
)
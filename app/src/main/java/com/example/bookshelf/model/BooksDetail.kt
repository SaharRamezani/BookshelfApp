package com.example.bookshelf.model

data class BookDetail(
    val id: String,
    val title: String,
    val authors: List<String>,
    val description: String,
    val thumbnail: String
)

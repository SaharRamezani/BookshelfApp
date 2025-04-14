package com.example.bookshelf.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Data class that defines an amphibian which includes a name, type, description, and image URL.
 */

@Serializable
data class BooksResponse(
    val items: List<BookItem>
)

@Serializable
data class BookItem(
    val id: String
)

@Serializable
data class BookDetail(
    val id: String,
    val volumeInfo: VolumeInfo
)

@Serializable
data class VolumeInfo(
    val title: String,
    val imageLinks: ImageLinks?
)

@Serializable
data class ImageLinks(
    val thumbnail: String
)

package com.example.bookshelf.model

import kotlinx.serialization.Serializable

@Serializable
data class BooksResponse(
    val items: List<Volume> = emptyList()
)

@Serializable
data class Volume(
    val id: String,
    val volumeInfo: VolumeInfo
)


@Serializable
data class VolumeInfo(
    val title: String = "",
    val authors: List<String> = emptyList(),
    val description: String = "",
    val imageLinks: ImageLinks? = null
)

@Serializable
data class ImageLinks(
    val thumbnail: String? = null
)

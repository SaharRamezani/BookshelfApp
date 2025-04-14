package com.example.bookshelf.data

import com.example.bookshelf.model.BookDetail
import com.example.bookshelf.network.BookshelfApiService

/**
 * Repository interface for retrieving book data from a data source.
 */
interface BookshelfRepository {
    suspend fun getBooks(query: String): List<BookDetail>
}



/**
 * Implementation of the repository that retrieves book data from the Google Books API.
 */
class DefaultBookshelfRepository(
    private val bookshelfApiService: BookshelfApiService
) : BookshelfRepository {

    override suspend fun getBooks(query: String): List<BookDetail> {
        val response = bookshelfApiService.searchBooks(query)
        return response.items.map {
            BookDetail(
                id = it.id,
                title = it.volumeInfo.title,
                authors = it.volumeInfo.authors,
                description = it.volumeInfo.description,
                thumbnail = it.volumeInfo.imageLinks?.thumbnail?.replace("http://", "https://") ?: ""
            )
        }
    }
}


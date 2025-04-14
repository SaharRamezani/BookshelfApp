package com.example.bookshelf.data

import com.example.bookshelf.model.BookDetail
import com.example.bookshelf.network.BookshelfApiService

/**
 * Repository interface for retrieving book data from a data source.
 */
interface BookshelfRepository {
    /**
     * Fetches a list of detailed book information based on the provided search query.
     */
    suspend fun getBooks(query: String): List<BookDetail>
}

/**
 * Implementation of the repository that retrieves book data from the Google Books API.
 */
class DefaultBookshelfRepository(
    private val apiService: BookshelfApiService
) : BookshelfRepository {

    override suspend fun getBooks(query: String): List<BookDetail> {
        val booksResponse = apiService.getBooks(query)
        return booksResponse.items.map { item ->
            apiService.getBookDetail(item.id)
        }
    }
}

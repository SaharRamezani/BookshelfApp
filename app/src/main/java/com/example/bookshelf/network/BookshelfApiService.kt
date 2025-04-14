package com.example.bookshelf.network

import com.example.bookshelf.model.BookDetail
import com.example.bookshelf.model.BooksResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BookshelfApiService {
    @GET("volumes")
    suspend fun getBooks(@Query("q") query: String): BooksResponse

    @GET("volumes/{id}")
    suspend fun getBookDetail(@Path("id") bookId: String): BookDetail

}

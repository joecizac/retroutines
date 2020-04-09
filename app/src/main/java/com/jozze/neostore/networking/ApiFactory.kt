package com.jozze.neostore.networking

import com.jozze.neostore.model.Todo
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiFactory {

    @GET("/todos/{id}")
    suspend fun getTodo(@Path(value = "id") todoId: Int): Todo
}
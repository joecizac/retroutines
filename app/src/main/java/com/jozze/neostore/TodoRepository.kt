package com.jozze.neostore

import com.jozze.neostore.networking.ApiFactory
import com.jozze.neostore.networking.NetworkClient

class TodoRepository {
    private var client: ApiFactory = NetworkClient.factory

    suspend fun getTodo(id: Int) = client.getTodo(id)
}
package com.jozze.neostore

import com.jozze.neostore.networking.ApiFactory
import com.jozze.neostore.networking.NetworkClient

object TodoRepository {
    var client: ApiFactory = NetworkClient.factory

    suspend fun getTodo(id: Int) = client.getTodo(id)
}
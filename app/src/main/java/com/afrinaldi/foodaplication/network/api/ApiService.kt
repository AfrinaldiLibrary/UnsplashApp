package com.afrinaldi.foodaplication.network.api

import com.afrinaldi.foodaplication.network.model.PhotosModel
import com.afrinaldi.foodaplication.network.model.PhotosModelItem
import com.afrinaldi.foodaplication.network.model.RelatedPhotosModel
import com.afrinaldi.foodaplication.network.model.UserModel
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("photos/")
    fun getPhoto(
        @Query("client_id") client_id: String
    ):Call<List<PhotosModelItem>>

    @GET("photos/{id}/")
    fun getRelated(
        @Path("id") id: String,
        @Query("client_id") client_id: String
    ):Call<RelatedPhotosModel>

    @GET("users/{username}/")
    fun getUser(
        @Path("username") username: String,
        @Query("client_id") client_id: String
    ):Call<UserModel>
}
package com.afrinaldi.foodaplication.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.afrinaldi.foodaplication.network.api.ApiConfig
import com.afrinaldi.foodaplication.network.model.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {
    private var _photo = MutableLiveData<List<PhotosModelItem>>()
    val photo: LiveData<List<PhotosModelItem>> = _photo

    private var _user = MutableLiveData<UserModel>()
    val user: LiveData<UserModel> = _user

    private var _related = MutableLiveData<List<ResultsItem>>()
    val relate: LiveData<List<ResultsItem>> = _related

    fun getRelate(id: String, client_id: String) {
        val client = ApiConfig.getApiService().getRelated(id, client_id)
        client.enqueue(object : Callback<RelatedPhotosModel> {
            override fun onResponse(call: Call<RelatedPhotosModel>, response: Response<RelatedPhotosModel>) {
                if (response.isSuccessful) {
                    _related.postValue(response.body()?.relatedCollections?.results)
                    Log.e(TAG, "Done")
                } else {
                    Log.e(TAG, "Gagal")
                }
            }

            override fun onFailure(call: Call<RelatedPhotosModel>, t: Throwable) {
                Log.e(TAG, "onFailure: ${t.message}")
            }
        })
    }


    fun getPhoto(client_id: String) {
        val client = ApiConfig.getApiService().getPhoto(client_id)
        client.enqueue(object : Callback<List<PhotosModelItem>> {
            override fun onResponse(call: Call<List<PhotosModelItem>>, response: Response<List<PhotosModelItem>>) {
                if (response.isSuccessful) {
                    _photo.postValue(response.body())
                    Log.e(TAG, "Done")
                } else {
                    Log.e(TAG, "Gagal")
                }
            }

            override fun onFailure(call: Call<List<PhotosModelItem>>, t: Throwable) {
                Log.e(TAG, "onFailure: ${t.message}")
            }
        })
    }

    fun getUser(username: String, client_id: String){
        val client = ApiConfig.getApiService().getUser(username, client_id)
        client.enqueue(object : Callback<UserModel>{
            override fun onResponse(call: Call<UserModel>, response: Response<UserModel>) {
                if (response.isSuccessful) {
                    _user.postValue(response.body())
                } else {
                    Log.e(TAG, "Gagal")
                }
            }

            override fun onFailure(call: Call<UserModel>, t: Throwable) {
                Log.e(TAG, "onFailure: ${t.message}")
            }

        })
    }

    companion object {
        const val TAG = "MainViewModel"
    }
}

package com.example.hutech.network

import com.example.hutech.models.ResponseModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/home_test_section?category_id=2")
    fun getData(): Call<ResponseModel>
}
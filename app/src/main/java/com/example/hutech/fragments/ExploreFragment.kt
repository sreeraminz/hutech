package com.example.hutech.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.hutech.R
import com.example.hutech.models.Component
import com.example.hutech.models.ResponseModel
import com.example.hutech.network.ApiClient
import com.example.hutech.utils.Constants
import kotlinx.android.synthetic.main.fragment_shop.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ExploreFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        getData()
        return inflater.inflate(R.layout.fragment_shop,container,false)

    }

    private fun getData(){
        val call: Call<ResponseModel> = ApiClient.instance.getData()
        call.enqueue(object : Callback<ResponseModel?> {
            override fun onResponse(
                call: Call<ResponseModel?>,
                response: Response<ResponseModel?>
            ) {
                if (response.isSuccessful) {
                    if (response.code() == 200) {
                        Log.d("TEST123","="+response.body()!!.components[0].name)
                        setData(response.body()!!.components)
                    }
                } else {

                }
            }

            override fun onFailure(call: Call<ResponseModel?>, t: Throwable) {
                Log.d("TEST123", "=$t")
            }
        })
    }

    private fun setData(components: List<Component>) {
        Log.d("TEST123", "="+components.first().StaticBanner.first().banner_image)

        Glide.with(requireContext())
            .load(Constants.BASE_URL_P+components.first().StaticBanner.first().banner_image)
            .placeholder(R.drawable.place_holder)
            .error(R.drawable.error)
            .into(ivStaticBanner)
    }
}
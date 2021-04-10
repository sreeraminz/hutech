package com.example.hutech.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.hutech.R
import com.example.hutech.adapters.CategoryAdapter
import com.example.hutech.models.ResponseModel
import com.example.hutech.network.ApiClient
import com.example.hutech.utils.Constants
import com.example.hutech.utils.LoadingDialog
import kotlinx.android.synthetic.main.fragment_explore.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ExploreFragment : Fragment(), CategoryAdapter.ClickListener {
    lateinit var categoryAdapter: CategoryAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_explore, container, false)

    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)

        initAdapter()
        getData()
    }

    private fun initAdapter() {
        categoryAdapter = CategoryAdapter(requireContext(), this)
        rvCategories.layoutManager = GridLayoutManager(requireContext(), 3)
        rvCategories.setHasFixedSize(false)
        rvCategories.adapter = categoryAdapter
        rvCategories.isNestedScrollingEnabled = false
    }

    private fun getData() {
        val call: Call<ResponseModel> = ApiClient.instance.getData()
        call.enqueue(object : Callback<ResponseModel?> {
            override fun onResponse(
                call: Call<ResponseModel?>,
                response: Response<ResponseModel?>
            ) {
                if (response.isSuccessful) {
                    if (response.code() == 200) {
                        setData(response.body()!!.components)
                        Log.d("TEST123","="+response.body()!!.components[2].adsBanners[0].banner_image)
                        categoryAdapter.setUpDataToUIForAdapterData(response.body()!!.components[1].categoryData)
                    }
                } else {

                }
            }

            override fun onFailure(call: Call<ResponseModel?>, t: Throwable) {
                Toast.makeText(context, t.message , Toast.LENGTH_LONG).show()
            }
        })
    }

    private fun setData(components: List<ResponseModel.Components>) {

        Glide.with(requireContext())
            .load(Constants.BASE_URL_P + components.first().StaticBanner.first().banner_image)
            .placeholder(R.drawable.place_holder)
            .error(R.drawable.error)
            .into(ivStaticBanner)


        Glide.with(requireContext())
            .load(Constants.BASE_URL_P + components[2].adsBanners[0].banner_image)
            .placeholder(R.drawable.place_holder)
            .error(R.drawable.error)
            .into(ivAdBanner)


    }

    override fun categoryItemOnClick(id: String) {

    }



}
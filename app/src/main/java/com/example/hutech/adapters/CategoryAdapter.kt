package com.example.hutech.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hutech.R
import com.example.hutech.models.ResponseModel
import com.example.hutech.utils.Constants
import kotlinx.android.synthetic.main.fragment_shop.*
import kotlinx.android.synthetic.main.item_category.view.*


class CategoryAdapter(private val context: Context, private val categoryItemListener: ClickListener) :
    RecyclerView.Adapter<CategoryAdapter.TypeViewHolder>() {
    private var typeList = ArrayList<ResponseModel.Components.Categorydata>()

    fun setUpDataToUIForAdapterData(result: List<ResponseModel.Components.Categorydata>) {
        typeList.clear()
        typeList.addAll(result)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TypeViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_category, parent, false)
        return TypeViewHolder(view)
    }

    override fun onBindViewHolder(holder: TypeViewHolder, position: Int) {

        val cartItems = typeList
        holder.view.tvCategory.text = cartItems[position].category_name
        Glide.with(context)
            .load(Constants.BASE_URL_P+cartItems[position].category_picture)
            .placeholder(R.drawable.place_holder)
            .error(R.drawable.error)
            .into(holder.view.ivCategory)

    }

    override fun getItemCount(): Int {
        return typeList.size

    }

    interface ClickListener {
        fun categoryItemOnClick(id: String)
    }

    class TypeViewHolder(var view: View) : RecyclerView.ViewHolder(view)

}
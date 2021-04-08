package com.example.hutech.activities

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hutech.utils.LoadingDialog

open class BaseActivity : AppCompatActivity() {
    private var sActivity: BaseActivity? = null
    private var loadingDialog: LoadingDialog? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sActivity = this
        checkInternet()
    }

    private fun checkInternet() {
        if (!isNetworkAvailable(this)){
            snackBarToast("Please check your internet")
        }
    }

    private fun isNetworkAvailable(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        var activeNetworkInfo: NetworkInfo? = null
        activeNetworkInfo = cm.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting
    }

    fun snackBarToast(message: String?) {
        val toast = Toast.makeText(sActivity, message, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP, 0, 250)
        toast.show()
    }
}
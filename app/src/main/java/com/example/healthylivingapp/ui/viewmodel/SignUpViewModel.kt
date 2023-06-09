//package com.example.healthylivingapp.ui.viewmodel
//
//import android.telecom.Call
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//
//class SignUpViewModel : ViewModel() {
//    private val _message = MutableLiveData<String>()
//    val message: LiveData<String> = _message
//    private val _isLoading = MutableLiveData<Boolean>()
//    val isLoading: LiveData<Boolean> = _isLoading
//    var isError: Boolean = false
//    fun getResponseRegister(requestRegister: RequestRegister) {
//        _isLoading.value = true
//        val api = ApiConfig.getApiService().createUser(requestRegister)
//        api.enqueue(object : retrofit2.Callback<ResponseMsg> {
//            override fun onResponse(
//                call: Call<ResponseMsg>,
//                response: Response<ResponseMsg>
//            ) {
//                _isLoading.value = false
//                val responseBody = response.body()
//                if (response.isSuccessful) {
//                    isError = false
//                    _message.value = responseBody?.message.toString()
//                } else {
//                    isError = true
//                    _message.value = response.message() }
//            }
//            override fun onFailure(call: Call<ResponseMsg>, t: Throwable) {
//                isError = true
//                _isLoading.value = false
//            }
//        })
//    }
//}
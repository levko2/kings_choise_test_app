package levkovskiy.dev.testapp.network

import androidx.lifecycle.LiveData
import levkovskiy.dev.testapp.model.Data
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("top.json")
    fun getData() : Call<Data>
}
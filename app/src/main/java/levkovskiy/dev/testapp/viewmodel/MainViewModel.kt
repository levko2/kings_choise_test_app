package levkovskiy.dev.testapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import levkovskiy.dev.testapp.model.Data
import levkovskiy.dev.testapp.network.Api
import levkovskiy.dev.testapp.network.ApiService

class MainViewModel : ViewModel() {

    private val api: ApiService = Api.createService(
        ApiService::class.java
    )

    private val liveData = MutableLiveData<Data>()

    fun getData(): LiveData<Data> {
        return liveData
    }

}
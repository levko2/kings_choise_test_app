package levkovskiy.dev.testapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import levkovskiy.dev.testapp.viewmodel.MainViewModel
import levkovskiy.dev.testapp.R

class MainActivity : AppCompatActivity() {

  private lateinit  var viewModel: MainViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

    viewModel.getData().observe(this, Observer {

    })
  }
}

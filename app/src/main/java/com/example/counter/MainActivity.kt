package com.example.counter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter.databinding.ActivityMainBinding
import com.example.counter.helper.Injector
import com.example.counter.presenter.Presenter
import com.example.counter.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            incrementBtn.setOnClickListener{
                presenter.increment()
            }
        }
    }

    override fun showNewCount(count: Int) {
        binding.resultTv.text = count.toString()
    }
    override fun showToast() {
        Toast.makeText(this, "Десять", Toast.LENGTH_SHORT).show()
    }

    override fun paintGreen() {
        binding.resultTv.setTextColor(Color.GREEN)
    }


}
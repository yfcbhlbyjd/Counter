package com.example.counter.presenter

import android.os.Bundle
import com.example.counter.helper.Injector
import com.example.counter.model.CounterModel
import com.example.counter.view.CounterView

class Presenter {
    private val model = Injector.getModel()
    lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.showNewCount(model.count)
        checkCounter()
    }

    fun decrement() {
        model.decrement()
        view.showNewCount(model.count)
        checkCounter()
    }

    fun attachView(view:CounterView){
        this.view = view

    }

    private fun checkCounter() {
        if (model.count == 10) {
            view.showToast()
        }else if(model.count == 15) {
            view.painGreen()
        }
    }


}

package com.example.counter.helper

import com.example.counter.model.CounterModel
import com.example.counter.presenter.Presenter

class Injector {

    companion object {
        fun getPresenter(): Presenter {
            return Presenter()
        }

        fun getModel(): CounterModel {
            return CounterModel()
        }
    }
}
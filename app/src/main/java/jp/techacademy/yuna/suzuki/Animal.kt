package jp.techacademy.yuna.suzuki

import android.telephony.mbms.StreamingServiceInfo
import android.util.Log

abstract class Animal {

    var name: String
    var age: Int


    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    abstract fun say()
}
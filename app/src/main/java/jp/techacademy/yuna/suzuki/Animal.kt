package jp.techacademy.yuna.suzuki

import android.telephony.mbms.StreamingServiceInfo
import android.util.Log

abstract class Animal {

    var name: String
    var age: Int
    var hobby: String

    constructor(name: String, age: Int, hobby: String){
        this.name = name
        this.age = age
        this.hobby = hobby
    }

    abstract fun say()
}
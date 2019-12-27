package jp.techacademy.yuna.suzuki

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("鈴木", 25, "旅行")     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        val human2 = Human("suzuki", 25, "語学")

        human1.say()  // ポチが吠えます（ログ出力）
        human1.think()

        human2.say()
        human2.think()

    }
}

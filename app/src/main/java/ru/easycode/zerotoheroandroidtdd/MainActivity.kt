package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    val linearLayout = LinearLayout(this)
        linearLayout.id = R.id.rootLayout
        linearLayout.orientation = LinearLayout.VERTICAL

        val textView = TextView(this)
        textView.text = "Hello World!"
        textView.id = R.id.titleTextView
        linearLayout.addView(textView)

        val button = Button(this)
        button.text = "change"
        button.id = R.id.changeButton
        linearLayout.addView(button)

        setContentView(linearLayout)

        button.setOnClickListener {
            textView.text = ("I am an Android Developer!") }

    }
    }

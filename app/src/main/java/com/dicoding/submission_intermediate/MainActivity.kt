package com.dicoding.submission_intermediate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.submission_intermediate.component.Button
import com.dicoding.submission_intermediate.component.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var myButton: Button
    private lateinit var myEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myEditText = findViewById(R.id.password)
        myButton = findViewById(R.id.button)

        setEnableButton()
    }

    private fun setEnableButton() {
        val result = myEditText.text
        myButton.isEnabled = result != null && result.toString().isNotEmpty()
    }
}
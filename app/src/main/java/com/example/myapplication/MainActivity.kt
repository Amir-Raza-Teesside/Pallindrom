package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var et:EditText
    lateinit var btn:Button;


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et = findViewById(R.id.et);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(View.OnClickListener {


            if(et.text != null)
            {
                val data: String = IsPalinddrom(et.text.toString());
                Toast.makeText(this,data.toLowerCase(),Toast.LENGTH_LONG).show()
            }
            else
            {
                et.requestFocus()
                et.setError("Cant empty")
            }
        })



    }


    private fun IsPalinddrom(txt:String): String
    {
        var isPalindrom:Boolean
        var staringIndex=0;
        var lastIndex = txt.length-1;

        while (staringIndex < lastIndex) {
            if (txt[staringIndex] != txt[lastIndex]) {
                return "Not a palindrom";

            }
            staringIndex++
            lastIndex--;

        }
       ;
        return  "Palindrom";



    }
}
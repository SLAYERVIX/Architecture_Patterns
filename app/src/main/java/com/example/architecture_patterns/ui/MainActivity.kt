package com.example.architecture_patterns.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import com.example.architecture_patterns.R
import com.example.architecture_patterns.data.MovieModel

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var btnGetMovieName : Button
    private lateinit var tvMovieName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMovieName = findViewById(R.id.tvName)
        btnGetMovieName = findViewById(R.id.button)

        btnGetMovieName.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button) {
            getMovie()
        }
    }

    private fun getMovieFromDB() : MovieModel {
        return MovieModel("Venom")
    }

    private fun getMovie() {
        tvMovieName.text = getMovieFromDB().name
    }
}
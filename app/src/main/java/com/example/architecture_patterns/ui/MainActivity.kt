package com.example.architecture_patterns.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import com.example.architecture_patterns.R
import com.example.architecture_patterns.data.MovieModel

class MainActivity : AppCompatActivity(), OnClickListener, MovieView {

    private lateinit var btnGetMovieName : Button
    private lateinit var tvMovieName : TextView

    private lateinit var moviePresenter: MoviePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moviePresenter = MoviePresenter(this)

        tvMovieName = findViewById(R.id.tvName)
        btnGetMovieName = findViewById(R.id.button)

        btnGetMovieName.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button) {
            moviePresenter.getMovieName()
        }
    }

    override fun onGetMovieName(name: String) {
        tvMovieName.text = name
    }
}
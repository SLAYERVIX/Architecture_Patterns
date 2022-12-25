package com.example.architecture_patterns.ui

import com.example.architecture_patterns.data.MovieModel

class MoviePresenter(val movieView: MovieView) {

    val movieModel = MovieModel("Venom")

    fun getMovieFromDB() : MovieModel {
        return MovieModel("Venom")
    }

    fun getMovieName() {
        movieView.onGetMovieName(movieModel.name)
    }
}
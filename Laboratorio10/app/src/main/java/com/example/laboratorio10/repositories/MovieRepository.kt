package com.example.laboratorio10.repositories

import com.example.laboratorio10.data.dao.MovieDao
import com.example.laboratorio10.data.model.MovieModel

class MovieRepository(private val moviesDao: MovieDao) {

    // TODO: complete getMovies method
    suspend fun getMovies() = moviesDao.getAllMovies()

    // TODO: complete addMovies method
   suspend fun addMovies(movie: MovieModel) = moviesDao.insertMovie(movie)

    // TODO: complete getMoviesWithActors method
    suspend fun getMoviesWithActors(id: Int) = moviesDao.getMovieWithActorsById(id)
}
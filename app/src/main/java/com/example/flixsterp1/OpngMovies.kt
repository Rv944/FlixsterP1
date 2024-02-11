package com.example.flixsterp1

import com.google.gson.annotations.SerializedName

class OpngMovies {
    @JvmField
    @SerializedName("movie_title")
    var title: String? = null

    //TODO bookImageUrl
    @SerializedName("movie_image")
    var movieImageUrl: String? = null

    //TODO description
    @SerializedName("movie_description")
    var description: String? = null
}
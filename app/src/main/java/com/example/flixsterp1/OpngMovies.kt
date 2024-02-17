package com.example.flixsterp1

import com.google.gson.annotations.SerializedName

class OpngMovies {
    @JvmField
    @SerializedName("title")
    var title: String? = null

    //TODO bookImageUrl
    @SerializedName("backdrop_path")
    var movieImageUrl: String? = null

    //TODO description
    @SerializedName("overview")
    var description: String? = null
}

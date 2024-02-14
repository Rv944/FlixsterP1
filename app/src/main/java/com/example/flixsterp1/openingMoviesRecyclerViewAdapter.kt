package com.example.flixsterp1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.flixsterp1.R.id

class openingMoviesRecyclerViewAdapter (
    private val movies: List<OpngMovies>,
    private val mListener: OnListFragmentInteractionListener?
)
    : RecyclerView.Adapter<openingMoviesRecyclerViewAdapter.MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.now_opening_movies, parent, false)
        return MovieViewHolder(view)

    }

    /**
     * This inner class lets us refer to all the different View elements
     * (Yes, the same ones as in the XML layout files!)
     */

    inner class MovieViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var mItem: OpngMovies? = null
        val mMovieTitle: TextView = mView.findViewById<View>(id.movie_title) as TextView
        val mMovieDescription: TextView = mView.findViewById<View>(id.movie_description) as TextView
        val mMovieImage: ImageView = mView.findViewById<View>(id.movie_image) as ImageView

        override fun toString(): String {
            return "$mMovieTitle '"
        }
    }

    /**
     * This lets us "bind" each Views in the ViewHolder to its' actual data!
     */

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

        val movie = movies[position]

        holder.mItem = movie
        holder.mMovieTitle.text = movie.title
        holder.mMovieDescription.text = movie.description

        Glide.with(holder.mView)
            .load(movie.movieImageUrl)
            .centerInside()
            .into(holder.mMovieImage)

        holder.mView.setOnClickListener {
            holder.mItem?.let { book ->
                mListener?.onItemClick(book)
            }

        }
    }
        /**
         * Remember: RecyclerView adapters require a getItemCount() method.
         */

        override fun getItemCount(): Int {
            return movies.size
        }
    }



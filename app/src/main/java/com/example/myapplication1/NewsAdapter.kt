package com.example.myapplication1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.widget.Toast


class NewsAdapter(private val newsList: List<News>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.newsImage)
        val title: TextView = itemView.findViewById(R.id.newsTitle)
        val description: TextView = itemView.findViewById(R.id.newsDescription)

        val extra: TextView = itemView.findViewById(R.id.newsExtra)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = newsList[position]
        holder.title.text = news.title
        holder.description.text = news.description
        holder.image.setImageResource(news.imageResId)
        holder.extra.text = news.extraInfo


        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                news.title,
                Toast.LENGTH_SHORT
            ).show()

            if (holder.extra.visibility == View.GONE) {
                holder.extra.visibility = View.VISIBLE
            } else {
                holder.extra.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int = newsList.size
}
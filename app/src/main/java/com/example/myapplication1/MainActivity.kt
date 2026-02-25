package com.example.myapplication1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val divider = androidx.recyclerview.widget.DividerItemDecoration(
            recyclerView.context,
            LinearLayoutManager.VERTICAL
        )
        val newsList = listOf(
            News("Title 1", "Description 1", R.mipmap.ic_launcher),
            News("Title 2", "Description 2", R.mipmap.ic_launcher),
            News("Title 3", "Description 3", R.mipmap.ic_launcher),
            News("Title 4", "Description 4", R.mipmap.ic_launcher)
        )

        recyclerView.addItemDecoration(divider)
        recyclerView.adapter = NewsAdapter(newsList)
    }
}
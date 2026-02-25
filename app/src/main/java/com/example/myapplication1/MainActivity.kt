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
            News("Basket Ball Updates", "Local team wins championship", R.drawable.sports_basket),
            News("Technology", "New AI system released worldwide", R.drawable.technology),
            News("Health", "Doctors discover new treatment", R.drawable.health),
            News("Business", "Stock market shows strong growth", R.drawable.business)
        )

        recyclerView.addItemDecoration(divider)
        recyclerView.adapter = NewsAdapter(newsList)
    }
}
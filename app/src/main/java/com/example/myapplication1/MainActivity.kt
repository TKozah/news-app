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
            News("Basket Ball Updates", "Local team wins championship", R.drawable.sports_basket,"The team secured a dramatic victory in the final minutes of the match, marking their third championship title in five years."),
            News("Technology", "New AI system released worldwide", R.drawable.technology,"The new AI system improves performance by 40% and is now being integrated into hospitals to assist doctors with faster and more accurate diagnoses."),
            News("Health", "Doctors discover new treatment", R.drawable.health,"Researchers announced promising clinical trial results, showing a 30% improvement in patient recovery rates using the new treatment method."),
            News("Business", "Stock market shows strong growth", R.drawable.business,"Market analysts reported steady growth this quarter, driven by increased investment in renewable energy and emerging technology sectors.")
        )

        recyclerView.addItemDecoration(divider)
        recyclerView.adapter = NewsAdapter(newsList)
    }
}
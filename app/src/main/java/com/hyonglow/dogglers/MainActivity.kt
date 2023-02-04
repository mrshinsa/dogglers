package com.hyonglow.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.hyonglow.dogglers.adapter.DogCardAdapter
import com.hyonglow.dogglers.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource.dogs
        val recyclerView = findViewById<RecyclerView>(R.id.rvDogList)
        recyclerView.adapter = DogCardAdapter(this, myDataset)

    }
}
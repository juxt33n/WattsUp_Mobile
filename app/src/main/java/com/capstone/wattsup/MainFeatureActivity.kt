package com.capstone.wattsup.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.capstone.wattsup.R
import com.capstone.wattsup.adapter.ApplianceAdapter
import com.capstone.wattsup.model.Appliance

class MainFeatureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_feature) // Set layout for the main feature

        // Sample data for appliances
        val applianceList = listOf(
            Appliance("Blender", "Kitchen", 300),
            Appliance("TV", "Entertainment", 100),
            Appliance("Fridge", "Appliance", 150)
        )

        // Set up RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.applianceRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ApplianceAdapter(applianceList)
    }
}

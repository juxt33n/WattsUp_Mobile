package com.capstone.wattsup.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.capstone.wattsup.R
import com.capstone.wattsup.model.Appliance

class ApplianceAdapter(private val applianceList: List<Appliance>) :
    RecyclerView.Adapter<ApplianceAdapter.ApplianceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApplianceViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_appliance, parent, false)
        return ApplianceViewHolder(view)
    }

    override fun onBindViewHolder(holder: ApplianceViewHolder, position: Int) {
        val appliance = applianceList[position]
        holder.bind(appliance)
    }

    override fun getItemCount(): Int = applianceList.size

    class ApplianceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val applianceName = itemView.findViewById<TextView>(R.id.tvApplianceName)
        private val applianceCategory = itemView.findViewById<TextView>(R.id.tvCategory)
        private val appliancePowerConsumption = itemView.findViewById<TextView>(R.id.tvWattage)

        fun bind(appliance: Appliance) {
            applianceName.text = appliance.name
            applianceCategory.text = appliance.category
            appliancePowerConsumption.text = "${appliance.powerConsumption}W"
        }
    }
}

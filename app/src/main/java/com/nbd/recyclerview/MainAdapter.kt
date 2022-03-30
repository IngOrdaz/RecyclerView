package com.nbd.recyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nbd.recyclerview.databinding.ItemVideoBinding
import org.json.JSONObject

class MainAdapter(private val videos:Array<JSONObject>):RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(videos[position])
    }

    override fun getItemCount(): Int =videos.size

    class MainHolder(val binding: ItemVideoBinding):RecyclerView.ViewHolder(binding.root){
        fun render(video:JSONObject){
            //TODO assign textview and imagevie values
        }
    }
}
package com.kiro.taskapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kiro.taskapp.databinding.RvItemBinding

class AdapterMain: RecyclerView.Adapter<AdapterMain.ViewHolder>() {

    private lateinit var list:MutableList<ModelTitle>
    fun addNote(note: ModelTitle){
        list.add(note)
        notifyItemInserted(list.size)}

    inner class ViewHolder(private var binding: RvItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(note: ModelTitle){
            binding.txtTitle.text = note.title
            binding.txtDescription.text = note.description

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RvItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size

    }



}




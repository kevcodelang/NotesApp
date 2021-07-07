package com.kelvin.notesapp.activities

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kelvin.notesapp.databinding.ActivityMainBinding
import com.kelvin.notesapp.models.Note

class NoteAdapter(val notes: List<Note>): RecyclerView.Adapter<>() {
    class  NoteViewHolder(val binding: ): RecyclerView.ViewHolder(binding
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ??? {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ???, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
package com.kelvin.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.kelvin.notesapp.databinding.ActivityMainBinding
import com.kelvin.notesapp.models.Note
import com.kelvin.notesapp.models.NoteDatabase
import java.security.AccessControlContext

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var database: NoteDatabase
    private  lateinit var noteAdapter: Note

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = Room.databaseBuilder(applicationContext,NoteDatabase::class.java,
            "notes_database").allowMainThreadQueries().build()
    }

    private  fun saveNote(title: String, context: String){
        val note = Note(id=0,title,context)

    }
}
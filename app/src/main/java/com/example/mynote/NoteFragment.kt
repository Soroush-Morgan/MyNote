package com.example.mynote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NoteFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_note)
    }
}
package com.zaid.todomvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.zaid.todomvvm.data.Word
import com.zaid.todomvvm.data.WordDao
import com.zaid.todomvvm.data.WordDb

class MainActivity : AppCompatActivity() {
    lateinit var wordDao: WordDao
    lateinit var wordDb: WordDb

    lateinit var etName: EditText
    lateinit var tvRes: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wordDb = WordDb.getNoteDb(this)
        wordDao = wordDb.wordDao()

        etName = findViewById(R.id.etName)
        tvRes = findViewById(R.id.tvRes)
    }

    fun roomHandler(view: android.view.View) {

        var word: String = "MohammedZaid"
      
        //etTitle.text.toString()
        insertWordAsync(Word("MohammedZaid"))
    }

    private fun insertWordAsync(word: Word) {
        var insertTask = InsertNoteAsyncTask(word,wordDao)
        insertTask.execute()
    }
}
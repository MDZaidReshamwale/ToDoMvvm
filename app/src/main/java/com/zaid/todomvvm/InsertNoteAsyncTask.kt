package com.zaid.todomvvm

import android.os.AsyncTask
import com.zaid.todomvvm.data.Word
import com.zaid.todomvvm.data.WordDao

class InsertNoteAsyncTask (var word: Word, var wordDao: WordDao) : AsyncTask<Void, Void, Void>() {


    override fun doInBackground(vararg p0: Void?): Void? {
        wordDao.insert(word)
        return null
    }

}
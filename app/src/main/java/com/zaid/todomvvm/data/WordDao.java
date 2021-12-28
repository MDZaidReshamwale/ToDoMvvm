package com.zaid.todomvvm.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Query("SELECT * FROM Word WHERE title LIKE :word ")
    public List<Word> findNote(String word);
}

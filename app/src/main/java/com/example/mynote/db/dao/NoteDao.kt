package com.example.mynote.db.dao
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.mynote.model.Note
@Dao
interface NoteDao {
    @Query("SELECT * FROM Note")
    fun getAll(): List<Note>
    @Query("SELECT * FROM Note WHERE nid IN (:noteIds)")
    fun loadAllByIds(noteIds: IntArray): List<Note>
    @Query("SELECT * FROM Note WHERE NoteName LIKE :first AND " + "ModifiedDate LIKE :second " )
    fun findByName(first: String, second: String): Note
    @Insert
    fun insertAll(vararg notes: Note)
    @Delete
    fun delete(note: Note)
}
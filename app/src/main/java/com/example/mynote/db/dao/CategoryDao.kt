package com.example.mynote.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.mynote.model.Category

@Dao
interface CategoryDao {
    @Query("SELECT * FROM Category")
    fun getAll(): List<Category>

    @Query("SELECT * FROM Category WHERE Cid IN (:categoryIds)")
    fun loadAllByIds(categoryIds: IntArray): List<Category>

    @Query("SELECT * FROM Category WHERE CName LIKE :first")
    fun findByName(first: String): Category

    @Insert
    fun insertAll(vararg users: Category)

    @Delete
    fun delete(user: Category)
}
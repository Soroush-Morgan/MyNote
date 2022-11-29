package com.example.mynote.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mynote.model.Category
import com.example.mynote.db.dao.CategoryDao

@Database(entities = [Category::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun categoryDao():CategoryDao
}
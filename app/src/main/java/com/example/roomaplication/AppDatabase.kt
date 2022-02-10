package com.example.roomaplication

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room.databaseBuilder
import android.arch.persistence.room.RoomDatabase

@Database(entities = [User::class], version = 2, exportSchema = false)
abstract class AppDatabase: RoomDatabase(){
    abstract fun userDao(): UserDao
}
package com.example.roomaplication

import android.arch.persistence.room.Room
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val db = Room.databaseBuilder(
        applicationContext,
        AppDatabase::class.java, "database-name"
    ).build()
    val userDao = db.userDao()
    val users: List<User> = userDao.getAll()

    }


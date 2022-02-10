package com.example.roomaplication


import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters


@Entity
@TypeConverters(DateConverter::class)
class User (
    val firstName: String?,
    val lastName: String?
        )
{
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

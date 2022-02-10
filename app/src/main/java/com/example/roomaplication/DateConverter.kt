package com.example.roomaplication
import android.arch.persistence.room.TypeConverter
import java.util.*
class DateConverter {
    @TypeConverter
    fun fromDate(value:Long?): Date? = value?.let { Date(it)}
    @TypeConverter
    fun toDate(date:Date?):Long?= date?.time



}
package com.example.recipeapp.activity.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.recipeapp.pojo.Meal

@Database(entities = [Meal::class], version = 1, exportSchema = false)
abstract class MealDatabase : RoomDatabase() {
    abstract fun mealDao():MealDao

    @Volatile
    private var INSTANCE: MealDatabase? = null

    @Synchronized
    fun getInstance(context: Context): MealDatabase {
        if(INSTANCE != null)
        synchronized(this){
            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                MealDatabase::class.java,
                "meal_db"
            ).fallbackToDestructiveMigration()
                .build()
        }
        return INSTANCE as MealDatabase
    }
}

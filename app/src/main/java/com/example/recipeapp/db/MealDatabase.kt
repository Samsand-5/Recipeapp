package com.example.recipeapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.recipeapp.activity.MealActivity
import com.example.recipeapp.pojo.Meal

@Database(entities = [Meal::class], version = 6)
@TypeConverters(MealTypeConverter::class)
abstract class MealDatabase : RoomDatabase() {
    abstract fun mealDao(): MealDao

    companion object {
        @Volatile
        private var INSTANCE: MealDatabase? = null

        @Synchronized
        fun getInstance(context: Context): MealDatabase {
            if (INSTANCE != null)
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    MealDatabase::class.java,
                    "meal_db"
                ).fallbackToDestructiveMigration()
                    .build()
            return INSTANCE as MealDatabase
        }
    }


}

package com.example.recipeapp.activity.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.recipeapp.pojo.Meal

@Dao
interface MealDao {

    @Insert
    suspend fun insertMeal(meal: Meal)

    @Update
    suspend fun updateFavorite(meal:Meal)

    @Delete
    suspend fun deleteMeal(meal:Meal)

    @Query("SELECT * FROM mealInformation")
    fun getAllMeals(): LiveData<List<Meal>>


}
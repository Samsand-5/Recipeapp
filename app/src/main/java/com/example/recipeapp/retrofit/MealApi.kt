package com.example.recipeapp.retrofit

import com.example.recipeapp.pojo.MealList
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call

interface MealApi {
    @GET ("random.php")
    fun getRandomMeal():Call<MealList>

}
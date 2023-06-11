package com.example.recipeapp.retrofit

import com.example.recipeapp.pojo.MealList
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call

interface MealApi {
    @GET("categories.php")
    fun getCategories(): Call<MealList>

    @GET("filter.php?")
    fun getMealsByCategory(@Query("i") category:String):Call<MealList>

    @GET ("random.php")
    fun getRandomMeal():Call<MealList>

    @GET("lookup.php?")
    fun getMealById(@Query("i") id:String):Call<MealList>

    @GET("search.php?")
    fun getMealByName(@Query("s") s:String):Call<MealList>
}
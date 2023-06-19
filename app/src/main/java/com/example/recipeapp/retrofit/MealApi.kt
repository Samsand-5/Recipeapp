package com.example.recipeapp.retrofit

import com.example.recipeapp.pojo.CategoryList
import com.example.recipeapp.pojo.MealsByCategoryList
import com.example.recipeapp.pojo.MealList
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call

interface MealApi {
    @GET ("random.php")
    fun getRandomMeal():Call<MealList>
    @GET ("lookup.php?")
    fun getMealDetails(@Query("i") id:String) :Call<MealList>
    @GET("filter.php?")
    fun getPopularItems(@Query("c") categoryName:String) :Call<MealsByCategoryList>

    @GET("categories.php")
    fun getCategories() :Call<CategoryList>
}
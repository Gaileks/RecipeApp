package com.example.recipeapp.json_data_class

data class Recipe(
    val id: Int,
    val imageUrl: String,
    val ingredients: List<Ingredient>,
    val method: List<String>,
    val title: String,
)
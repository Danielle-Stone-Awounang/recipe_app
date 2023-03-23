package com.example.fastfood_recipe.data

import androidx.annotation.DrawableRes
import com.example.fastfood_recipe.R


data class Recipe(
    val title: String,
    val category: String,
    val cookingTime: String,
    val energy: String,
    val rating: String,
    val description: String,
    val reviews: String,
    val ingredients: List<Ingredient>
)

data class Ingredient(@DrawableRes val image: Int, val title: String, val subtitle: String)

val burger = Recipe(
    title = "Burger",
    category = "Fast-food",
    cookingTime = "30 min",
    energy = "1000 kcal",
    rating = "4,9",
    description = "Quoi de mieux qu'un bon burger pour pimenter vos papilles!! ",
    reviews = "84 photos     430 comments",
    ingredients = listOf(
        Ingredient(R.drawable.viande, "Viande de boeuf", "450 g"),
        Ingredient(R.drawable.pain, "Pain rond", "2"),
        Ingredient(R.drawable.oignon, "Oignon", "2"),
        Ingredient(R.drawable.fromage, "Fromage", "200 g"),
        Ingredient(R.drawable.letu, "Salade", "3 feuilles")
    )
)
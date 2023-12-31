package com.kartik.superheroapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class HeroesScreen(
    @DrawableRes val imageResourceId : Int,
    @StringRes val name:Int,
    @StringRes val description:Int
)
val Heroes = listOf(
    HeroesScreen(R.drawable.android_superhero1,R.string.hero1,R.string.description1),
    HeroesScreen(R.drawable.android_superhero2,R.string.hero2,R.string.description2),
    HeroesScreen(R.drawable.android_superhero3,R.string.hero3,R.string.description3),
    HeroesScreen(R.drawable.android_superhero4,R.string.hero4,R.string.description4),
    HeroesScreen(R.drawable.android_superhero5,R.string.hero5,R.string.description5),
    HeroesScreen(R.drawable.android_superhero6,R.string.hero6,R.string.description6)
)
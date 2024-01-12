package com.example.comp319assignment2

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class FitnessProgram(
    @DrawableRes val imageResourceId: Int,
    @StringRes val title: Int,
    val workoutTime: Int,
    @StringRes val equipment: Int,
    @StringRes val youtubeLink: Int
)

val fitnessPrograms = listOf(
    FitnessProgram(R.drawable.fitness_image1 ,R.string.day_1, 20, R.string.equipment_dumbbells, R.string.youtube_link_day_1) ,
    FitnessProgram(R.drawable.fitness_image2, R.string.day_2, 30, R.string.equipment_bodyweight, R.string.youtube_link_day_2),
    FitnessProgram(R.drawable.fitness_image3,R.string.day_3, 60, R.string.equipment_dumbbells_chair, R.string.youtube_link_day_3) ,
    FitnessProgram(R.drawable.fitness_image4, R.string.day_4, 120, R.string.equipment_dumbbells_miniloop, R.string.youtube_link_day_4),
    FitnessProgram(R.drawable.fitness_image5, R.string.day_5, 40, R.string.equipment_kettlebell, R.string.youtube_link_day_5) ,
    FitnessProgram(R.drawable.fitness_image6, R.string.day_6, 40, R.string.equipment_dumbbells, R.string.youtube_link_day_6),
    FitnessProgram(R.drawable.fitness_image7, R.string.day_7, 30, R.string.equipment_dumbbells_miniloop, R.string.youtube_link_day_7) ,
    FitnessProgram(R.drawable.fitness_image8 ,R.string.day_8, 30, R.string.equipment_dumbbells_resistanceband, R.string.youtube_link_day_8),
    FitnessProgram(R.drawable.fitness_image9, R.string.day_9, 20, R.string.equipment_dumbbells_chair_bench, R.string.youtube_link_day_9) ,
    FitnessProgram(R.drawable.fitness_image1, R.string.day_10, 22, R.string.equipment_lightdumbbells_miniloop, R.string.youtube_link_day_10),
    FitnessProgram(R.drawable.fitness_image1, R.string.day_11, 27, R.string.equipment_dumbbells_resistanceband, R.string.youtube_link_day_11) ,
    FitnessProgram(R.drawable.fitness_image1, R.string.day_12, 33, R.string.equipment_kettlebell, R.string.youtube_link_day_12),
    FitnessProgram(R.drawable.fitness_image1, R.string.day_13, 44, R.string.equipment_dumbbells_chair, R.string.youtube_link_day_13) ,
    FitnessProgram(R.drawable.fitness_image1, R.string.day_14, 50, R.string.equipment_dumbbells_chair, R.string.youtube_link_day_14),
    FitnessProgram(R.drawable.fitness_image1, R.string.day_15, 60, R.string.equipment_kettlebell, R.string.youtube_link_day_15) ,
    FitnessProgram(R.drawable.fitness_image1, R.string.day_16, 79, R.string.equipment_bodyweight, R.string.youtube_link_day_16),
    FitnessProgram(R.drawable.fitness_image1, R.string.day_17, 80, R.string.equipment_dumbbells, R.string.youtube_link_day_17) ,
    FitnessProgram(R.drawable.fitness_image1, R.string.day_18, 20, R.string.equipment_bodyweight, R.string.youtube_link_day_18),
    FitnessProgram(R.drawable.fitness_image1, R.string.day_19, 20, R.string.equipment_dumbbells_chair, R.string.youtube_link_day_19) ,
    FitnessProgram(R.drawable.fitness_image1, R.string.day_20, 20, R.string.equipment_dumbbells_chair, R.string.youtube_link_day_20),
    FitnessProgram(R.drawable.fitness_image1, R.string.day_21, 20, R.string.equipment_bodyweight, R.string.youtube_link_day_21) ,
    FitnessProgram(R.drawable.fitness_image1, R.string.day_22, 20, R.string.equipment_dumbbells_chair, R.string.youtube_link_day_22),
    FitnessProgram(R.drawable.fitness_image1, R.string.day_23, 20, R.string.equipment_kettlebell, R.string.youtube_link_day_23) ,
    FitnessProgram(R.drawable.fitness_image1, R.string.day_24, 20, R.string.equipment_dumbbells_chair, R.string.youtube_link_day_24),
    FitnessProgram(R.drawable.fitness_image1, R.string.day_25, 20, R.string.equipment_dumbbells_chair, R.string.youtube_link_day_25) ,
    FitnessProgram(R.drawable.fitness_image1, R.string.day_26, 20, R.string.equipment_dumbbells, R.string.youtube_link_day_26),
    FitnessProgram(R.drawable.fitness_image1, R.string.day_27, 20, R.string.equipment_dumbbells_chair, R.string.youtube_link_day_27) ,
    FitnessProgram(R.drawable.fitness_image1, R.string.day_28, 20, R.string.equipment_dumbbells, R.string.youtube_link_day_28),
    FitnessProgram(R.drawable.fitness_image1, R.string.day_29, 20, R.string.equipment_dumbbells, R.string.youtube_link_day_29) ,
    FitnessProgram(R.drawable.fitness_image1, R.string.day_30, 20, R.string.equipment_dumbbells_chair, R.string.youtube_link_day_30)

)
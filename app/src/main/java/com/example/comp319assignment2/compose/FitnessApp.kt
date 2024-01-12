package com.example.comp319assignment2.compose

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.comp319assignment2.R
import com.example.comp319assignment2.fitnessPrograms

@Composable
fun FitnessApp() {
    Scaffold(
        topBar = {
            TopBar()
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            items(fitnessPrograms) {
                FitnessProgramItem(
                    fitnessProgram = it,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                )
            }
        }
    }
}
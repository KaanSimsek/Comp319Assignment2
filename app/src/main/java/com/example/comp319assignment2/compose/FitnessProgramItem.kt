package com.example.comp319assignment2.compose

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.comp319assignment2.FitnessProgram
import com.example.comp319assignment2.R

@Composable
fun FitnessProgramItem(
    fitnessProgram: FitnessProgram,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(R.dimen.padding_small))
            ) {
                FitnessItemButton(expanded = expanded, onClick = {expanded = !expanded})
                Column(modifier = modifier) {
                    Text(
                        text = stringResource(fitnessProgram.title),
                        style = MaterialTheme.typography.displayMedium,
                        modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
                    )
                    Text(
                        text = fitnessProgram.workoutTime.toString() + " mins",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
            if (expanded) {

                FitnessProgramDetail(
                    imageResource = fitnessProgram.imageResourceId,
                    youtubeLink = stringResource(fitnessProgram.youtubeLink),
                    modifier = Modifier.padding(
                        start = dimensionResource(R.dimen.padding_medium),
                        top = dimensionResource(R.dimen.padding_small),
                        bottom = dimensionResource(R.dimen.padding_medium),
                        end = dimensionResource(R.dimen.padding_medium)
                    ))
            }
        }
    }
}
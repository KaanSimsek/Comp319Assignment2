package com.example.comp319assignment2.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun FitnessProgramDetail(
    imageResource: Int,
    youtubeLink: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Image(painter = painterResource(imageResource), contentDescription = "AA")
        Text(
            text = "Youtube Link",
            style = MaterialTheme.typography.labelSmall
        )
        Text(
            text = youtubeLink,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
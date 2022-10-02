package com.felix.composecourse2.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.felix.composecourse2.ui.theme.AndroidGreen

@Composable
fun Title(title: String) {
    Text(text = title, fontSize = 16.sp, color = AndroidGreen)
}

@Preview
@Composable
fun TitlePreview() {
    Title(title = "Android Dev")
}
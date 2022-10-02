package com.felix.composecourse2.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun Fullname(name: String) {
    Text(text = name, fontSize = 24.sp, color = Color.White)
}

@Preview
@Composable
fun FullnamePreview() {
    Fullname(name = "Felix")
}
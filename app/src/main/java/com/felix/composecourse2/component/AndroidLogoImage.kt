package com.felix.composecourse2.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.felix.composecourse2.R
import com.felix.composecourse2.ui.theme.ComposeCourse2Theme

@Composable
fun AndroidLogoImage() {
    val resource = painterResource(id = R.drawable.android_logo)
    Image(painter = resource, contentDescription = null)
}

@Preview
@Composable
fun AndroidLogoImagePreview() {
    ComposeCourse2Theme {
        AndroidLogoImage()
    }
}
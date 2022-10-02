package com.felix.composecourse2.component

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.felix.composecourse2.R
import com.felix.composecourse2.ui.theme.AndroidGreen
import com.felix.composecourse2.ui.theme.ComposeCourse2Theme

@Composable
fun ContactDetail(@DrawableRes drawable: Int, contact: String) {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .border(width = 1.dp, color = Color.White),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(painterResource(id = drawable),
            contentDescription = null,
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp),
            tint = AndroidGreen)

        Text(text = contact,
            textAlign = TextAlign.Justify,
            color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun ContactDetailPreview() {
    ComposeCourse2Theme {
        ContactDetail(drawable = R.drawable.ic_baseline_call_24, contact = "08123456789")
    }
}
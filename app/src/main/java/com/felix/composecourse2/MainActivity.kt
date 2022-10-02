package com.felix.composecourse2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.felix.composecourse2.component.AndroidLogoImage
import com.felix.composecourse2.component.ContactDetail
import com.felix.composecourse2.component.Fullname
import com.felix.composecourse2.component.Title
import com.felix.composecourse2.ui.theme.ComposeCourse2Theme
import com.felix.composecourse2.ui.theme.DarkBlue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCourse2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = DarkBlue
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun Intro() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(DarkBlue)
            .padding(16.dp)
    ) {
        AndroidLogoImage()
        Fullname(name = "Felix")
        Title(title = "Android Dev")
    }
}

@Preview(showBackground = true)
@Composable
fun IntroPreview() {
    ComposeCourse2Theme {
        Intro()
    }
}

@Composable
fun ContactDetailList() {
    Column(
        modifier = Modifier.background(DarkBlue)
    ) {
        ContactDetail(drawable = R.drawable.ic_baseline_call_24, contact = "085155491717")
        ContactDetail(drawable = R.drawable.ic_baseline_email_24, contact = "chiumanfelix@hotmail.com")
    }
}

@Preview
@Composable
fun ContactDetailListPreview() {
    ComposeCourse2Theme {
        ContactDetailList()
    }
}

@Composable
fun BusinessCard() {
    Column (){
        Intro()
        ContactDetailList()
    }
}
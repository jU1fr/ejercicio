package com.example.ejercicio.views

import android.widget.Space
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SpaceH(size: Dp = 5.dp){
    Spacer(modifier= Modifier.height(size))
}


@Composable
fun SpaceV(size: Dp = 5.dp){
    Spacer(modifier= Modifier.width(size))
}


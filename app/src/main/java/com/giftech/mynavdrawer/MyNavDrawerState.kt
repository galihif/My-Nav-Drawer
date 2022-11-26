package com.giftech.mynavdrawer

import android.content.Context
import androidx.compose.material.ScaffoldState
import kotlinx.coroutines.CoroutineScope

class MyNavDrawerState(
    val scaffoldState: ScaffoldState,
    private val scope: CoroutineScope,
    private val context: Context
) {

}
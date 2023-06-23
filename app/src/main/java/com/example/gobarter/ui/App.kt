package com.example.gobarter.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.gobarter.ui.components.ActionButton
import com.example.gobarter.ui.components.Banner
import com.example.gobarter.ui.components.Content
import com.example.gobarter.ui.components.Title
import com.example.gobarter.ui.theme.GoBarterTheme

@Composable
fun App(
    viewModel: AppViewModel,
    modifier: Modifier
) {
    Column(modifier = modifier.fillMaxSize()) {
        Banner(viewModel = viewModel) {
            viewModel.setStatus(viewModel.favourite.value)
        }
        Column {
            Title()
            Content(viewModel = viewModel, modifier = modifier.weight(1f))
            ActionButton()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PhonePreview() {
    GoBarterTheme {
        App(viewModel = AppViewModel(), modifier = Modifier.fillMaxSize())
    }
}
@Preview(showBackground = true, device = Devices.FOLDABLE)
@Composable
fun FoldablePreview() {
    GoBarterTheme() {
        App(viewModel = AppViewModel(),Modifier.fillMaxSize())
    }
}
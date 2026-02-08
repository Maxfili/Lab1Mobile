package com.example.lab1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.foundation.layout.Arrangement.SpaceEvenly
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp

@Composable
fun BusinessCardApp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(R.dimen.screen_padding))
    ) {
        TopSection(modifier = Modifier.align(Alignment.Center))
        BottomSection(modifier = Modifier.align(Alignment.BottomCenter))
    }
}

@Composable
fun TopSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = SpaceEvenly
    ) {
        Box(
            modifier = Modifier
                .size(dimensionResource(R.dimen.logo_size))
                .background(color = colorResource(R.color.icon)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.size(dimensionResource(R.dimen.icon_size))
            )
        }

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.space_medium)))

        Text(
            text = stringResource(R.string.name),
            fontSize = dimensionResource(R.dimen.name_size).value.sp
        )

        Text(
            text = stringResource(R.string.title),
            color = MaterialTheme.colorScheme.primary,
            fontSize = dimensionResource(R.dimen.group_size).value.sp
        )
    }
}

@Composable
fun BottomSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(bottom = dimensionResource(R.dimen.bottom_padding)),
        verticalArrangement = SpaceBetween
    ) {
        ContactRow(Icons.Default.Call, stringResource(R.string.phone))
    }
}

@Composable
fun ContactRow(icon: ImageVector, text: String) {
    Row(
        modifier = Modifier.padding(dimensionResource(R.dimen.space_small)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(icon, contentDescription = null)
        Spacer(modifier = Modifier.width(dimensionResource(R.dimen.space_small)))
        Text(
            text = text,
            fontSize = dimensionResource(R.dimen.contact_size).value.sp
        )
    }
}

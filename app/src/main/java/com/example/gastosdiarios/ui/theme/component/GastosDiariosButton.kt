package com.example.gastosdiarios.ui.theme.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LancarCreditoButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    iconRes: Int? = null,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Green
        ),
        onClick = onClick
    ) {
        text?.let { Text(text = text.uppercase()) }
    }
}

@Composable
fun LancarDebitoButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    iconRes: Int? = null,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red
        ),
        onClick = onClick
    ) {
        text?.let { Text(text = text.uppercase()) }
    }
}

@Preview
@Composable
private fun LancarCreditoButtonPreview() {
    LancarCreditoButton(modifier = Modifier.fillMaxWidth(), text = "Confirmar", iconRes = null) {}
}

@Preview
@Composable
private fun LancarDebitoButton() {
    LancarDebitoButton(modifier = Modifier.fillMaxWidth(), text = "Confirmar", iconRes = null) {}
}
package com.example.akmobileapp.demos

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.activity.compose.BackHandler
enum class CampusPlace(val title: String) {
    Library("Library"),
    ComputingLabs("Computing Labs"),
    Cafeteria("Cafeteria"),
    SportsCentre("Sports Centre"),
    StudentSupport("Student Support")
}

@Composable
fun CampusGuide() {

    var selectedPlace: CampusPlace? by rememberSaveable {
        mutableStateOf<CampusPlace?>(null)
    }
    BackHandler(enabled = selectedPlace != null) {
        selectedPlace = null
    }

    if (selectedPlace == null) {
        CampusMenu(
            onSelect = { selectedPlace = it }
        )
    } else {
        CampusScreen(
            place = selectedPlace!!,
            onBack = { selectedPlace = null }
        )
    }
}

@Composable
fun CampusMenu(onSelect: (CampusPlace) -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Campus Guide");
        Text("Explore The New Campus")
        Button(
            modifier =  Modifier.fillMaxWidth(),
            onClick = { onSelect(CampusPlace.Library) }

        ) {
            Text("Library")
        }

        Button(
            modifier =  Modifier.fillMaxWidth(),
            onClick = { onSelect(CampusPlace.ComputingLabs) }
        ) {
            Text("Computing Labs")
        }
        Button(
            modifier =  Modifier.fillMaxWidth(),
            onClick = { onSelect(CampusPlace.Cafeteria) }
        ) {
            Text("Cafeteria")
        }
        Button(
            modifier =  Modifier.fillMaxWidth(),
            onClick = { onSelect(CampusPlace.SportsCentre) }
        ) {
            Text("Sports Centre")
        }
        Button(
            modifier =  Modifier.fillMaxWidth(),
            onClick = { onSelect(CampusPlace.StudentSupport) }
        ) {
            Text("Student Support")
        }
    }
}

@Composable
fun CampusScreen(
    place: CampusPlace,
    onBack: () -> Unit
) {
    when (place) {
        CampusPlace.Library -> LibraryScreen(onBack)
        CampusPlace.ComputingLabs -> ComputingLabsScreen(onBack)
        CampusPlace.Cafeteria -> CafeteriaScreen(onBack)
        CampusPlace.SportsCentre -> SportsCentreScreen(onBack)
        CampusPlace.StudentSupport -> StudentSupportScreen(onBack)
    }
}

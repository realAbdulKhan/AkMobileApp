package com.example.akmobileapp.demos

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

enum class Exercise(val title: String) {
    StaticProfile("1. Static profile"),
    Counter("2. Counter"),
    NameInput("3. Name input"),
    InteractiveProfile("4. Interactive profile"),
    ShoppingList("5. Shopping list")
}

@Composable
fun ExerciseApp() {

    var selectedExercise: Exercise? by rememberSaveable {
        mutableStateOf(null)
    }

    if (selectedExercise == null) {

        ExerciseMenu(
            onSelect = { selectedExercise = it }
        )

    } else {

        ExerciseScreen(
            exercise = selectedExercise!!,
            onBack = {
                selectedExercise = null
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExerciseMenu(
    onSelect: (Exercise) -> Unit
) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Choose an exercise")
                }
            )
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Exercise.entries.forEach { exercise ->

                Button(
                    onClick = {
                        onSelect(exercise)
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(exercise.title)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExerciseScreen(
    exercise: Exercise,
    onBack: () -> Unit
) {

    BackHandler {
        onBack()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(exercise.title)
                },
                navigationIcon = {
                    TextButton(
                        onClick = onBack
                    ) {
                        Text("Back")
                    }
                }
            )
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp)
        ) {

            when (exercise) {

                Exercise.StaticProfile -> {
                    StaticProfile()
                }

                Exercise.Counter -> {
                    Exercise2Counter()
                }

                Exercise.NameInput -> {
                    Exercise3NameInput()
                }

                Exercise.InteractiveProfile -> {
                    Exercise4InteractiveProfile()
                }

                Exercise.ShoppingList -> {
                    Exercise5ShoppingList()
                }
            }
        }
    }
}
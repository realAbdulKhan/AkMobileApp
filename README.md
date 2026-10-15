📱 Campus Guide App A Jetpack Compose practical lab that builds a simple campus exploration app for new students. The app demonstrates menus, state management, callbacks, images, cards, scrolling layouts, and Compose UI structure.

🎯 Overview This app helps a new student explore key areas of campus. The main menu presents five choices:

Library

Computing Labs

Cafeteria

Sports Centre

Student Support

Each choice opens a dedicated content screen with an image, description, and useful information.

🧩 Features 🏠 Main Menu Displays heading Campus Guide

Includes a short introduction

Shows all five menu choices

Each choice opens its corresponding screen

Uses state + callbacks to manage screen selection

📄 Content Screens Each screen includes:

Correct title

Relevant image (from drawable-nodpi)

Short description

At least one Card showing useful info (opening hours, facilities, contact details, etc.)

A Back button returning to the menu

Consistent padding, spacing, and theme colours

A Row for horizontal information

Scrollable content for smaller screens

🎨 Layout & Appearance Consistent padding (e.g., 24.dp)

Material 3 typography and colours

Images sized with fillMaxWidth() and fixed height

Cards styled using CardDefaults and RoundedCornerShape

Scrollable content using verticalScroll(rememberScrollState())

Content stays clear of system bars using consumeWindowInsets(innerPadding)

🖼️ Images Images are stored in:

Code app/src/main/res/drawable-nodpi/ Displayed using:

kotlin Image( painter = painterResource(id = R.drawable.campus_library), contentDescription = "Campus library", modifier = Modifier .fillMaxWidth() .height(180.dp), contentScale = ContentScale.Crop ) 🗂️ Cards Example card used in content screens:

kotlin Card( modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(16.dp), colors = CardDefaults.cardColors( containerColor = MaterialTheme.colorScheme.surfaceVariant, contentColor = MaterialTheme.colorScheme.onSurfaceVariant ) ) { Column( modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp) ) { Text( text = "Facilities", style = MaterialTheme.typography.titleMedium ) Text("Study spaces, computers and book loans") } } 🔄 Screen Selection Logic The app uses a single state variable to track the selected screen. Example:

null → menu

"library" → Library screen

"cafeteria" → Cafeteria screen

etc.

Clicking a menu item updates the state. Clicking Back resets the state to null.

🧪 Testing Checklist ✔ Open all five screens ✔ Test Back buttons ✔ Test Android system Back ✔ Test large font sizes ✔ Test light/dark theme ✔ Ensure images have meaningful descriptions ✔ Ensure menu cards scroll on small screens ✔ Test scrolling on small devices ✔ Keep all Kotlin files ✔ Provide screenshots of menu + two content screens ✔ Explain one full sequence: click → callback → state change → updated screen ✔ Explain one image choice and one layout choice

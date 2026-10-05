package com.example.akmobileapp
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.material3.Surface
//import com.example.akmobileapp.demos.MobileAppDemos
//import com.example.akmobileapp.ui.theme.AkMobileAppTheme
//
//class MainActivity : ComponentActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        enableEdgeToEdge()
//
//        setContent {
//            AkMobileAppTheme {
//                Surface {
//                    MobileAppDemos()
//                }
//            }
//        }
//    }
//}

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import com.example.akmobileapp.demos.CampusGuide
import com.example.akmobileapp.ui.theme.AkMobileAppTheme

//class MainActivity : ComponentActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        enableEdgeToEdge()
//
//        setContent {
//            AkMobileAppTheme {
//                Surface {
//                    CampusGuide()
//                }
//            }
//        }
//    }
//}



import com.example.akmobileapp.demos.ExerciseApp


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            AkMobileAppTheme {
                Surface {
                    ExerciseApp()
                }
            }
        }
    }
}


package xyz.teamgravity.koindemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import org.koin.androidx.compose.getViewModel
import xyz.teamgravity.koindemo.ui.theme.KoinDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KoinDemoTheme {
                val viewmodel = getViewModel<MainViewModel>()
                viewmodel.onGetRonaldo()
            }
        }
    }
}


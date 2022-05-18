package xyz.teamgravity.koindemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import xyz.teamgravity.koindemo.ui.theme.KoinDemoTheme

class MainActivity : ComponentActivity() {

    private val activityViewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("raheem: activityViewModel.onGetRonaldo(): ${activityViewModel.onGetRonaldo()}")

        setContent {
            KoinDemoTheme {
                val viewmodel = getViewModel<MainViewModel>()
                viewmodel.onGetRonaldo()
            }
        }
    }
}


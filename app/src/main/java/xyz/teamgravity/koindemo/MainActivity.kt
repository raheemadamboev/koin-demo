package xyz.teamgravity.koindemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.activityScope
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope
import xyz.teamgravity.koindemo.ui.theme.KoinDemoTheme

class MainActivity : ComponentActivity(), AndroidScopeComponent {

    override val scope: Scope by activityScope()

    private val strong by inject<String>(named(Power.Strong))
    private val goat by inject<String>(named(Power.Goat))

    private val activityViewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("raheem: activityViewModel.onGetRonaldo(): ${activityViewModel.onGetRonaldo()}")

        println("raheem: strong: $strong")
        println("raheem: goat: $goat")

        setContent {
            KoinDemoTheme {
                val viewmodel = getViewModel<MainViewModel>()
                viewmodel.onGetRonaldo()
            }
        }
    }
}


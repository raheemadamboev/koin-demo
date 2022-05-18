package xyz.teamgravity.koindemo

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<MainRepository> { MainRepositoryImpl() }
    viewModel { MainViewModel(get()) }
}
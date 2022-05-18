package xyz.teamgravity.koindemo

import org.koin.core.qualifier.named
import org.koin.dsl.module

val activityModule = module {
    scope<MainActivity> {
        scoped(qualifier = named(Power.Goat)) { "Messi" }
        scoped(qualifier = named(Power.Strong)) { "Robben" }
    }
}

enum class Power {
    Strong, Goat
}
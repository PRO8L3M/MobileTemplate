package com.my.template.di

import com.my.template.data.repository.Repository
import com.my.template.ui.start.StartViewModel
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

object AppModules : ModuleLoader() {
    override val modules: List<Module> =
        listOf(
            viewModelModule,
            repositoryModule
        )
}

private val viewModelModule = module {
    viewModel { StartViewModel(get()) }
}

private val repositoryModule = module {
    single { Repository() }
}

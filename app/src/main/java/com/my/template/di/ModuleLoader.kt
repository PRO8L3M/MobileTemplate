package com.my.template.di

import org.koin.core.module.Module

abstract class ModuleLoader {
    abstract val modules: List<Module>
}
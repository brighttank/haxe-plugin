package com.github.brighttank.haxeplugin.services

import com.intellij.openapi.project.Project
import com.github.brighttank.haxeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

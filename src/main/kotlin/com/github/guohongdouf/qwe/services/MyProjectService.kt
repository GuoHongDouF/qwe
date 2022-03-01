package com.github.guohongdouf.qwe.services

import com.intellij.openapi.project.Project
import com.github.guohongdouf.qwe.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

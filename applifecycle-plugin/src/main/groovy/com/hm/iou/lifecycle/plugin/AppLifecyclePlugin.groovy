package com.hm.iou.lifecycle.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class AppLifecyclePlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        println "------LifeCycle plugin entrance1111-------"
        def android = project.extensions.getByType(AppExtension)
        android.registerTransform(new AppLifecycleTransform(project))
    }

}
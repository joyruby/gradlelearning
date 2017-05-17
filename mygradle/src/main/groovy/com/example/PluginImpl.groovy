package com.example

import com.example.extensions.PluginExtension
import com.example.extensions.PluginNestExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

public class PluginImpl implements Plugin<Project> {

    @Override
    void apply(Project project) {
        //hello demo
        project.task('testGradle') <<{
            println 'Hello my first gradle'
        }
        //timeListener demo
        project.gradle.addListener(new TimeListener())

        //extension demo
        project.extensions.create('PluginExt',PluginExtension)
        project.PluginExt.extensions.create('NestExt',PluginNestExtension)
        project.task('ExtTask',type: ExtParamTask)

    }
}
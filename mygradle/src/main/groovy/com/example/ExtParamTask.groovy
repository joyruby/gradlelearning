package com.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction


public class ExtParamTask extends DefaultTask{
    @TaskAction
    void output(){
        println "param1 is ${project.PluginExt.param1}"
        println "param2 is ${project.PluginExt.param2}"
        println "param3 is ${project.PluginExt.param3}"
        println "paramNext1 is ${project.PluginExt.NestExt.paramNest1}"
        println "paramNext2 is ${project.PluginExt.NestExt.paramNest2}"
        println "paramNext3 is ${project.PluginExt.NestExt.paramNest3}"
    }
}
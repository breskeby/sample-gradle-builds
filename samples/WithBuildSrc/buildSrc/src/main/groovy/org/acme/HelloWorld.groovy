package org.acme

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class HelloWorld extends DefaultTask {
    @TaskAction void sayHello(){
        println "Hello World!"
    }
}

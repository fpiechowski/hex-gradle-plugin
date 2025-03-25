package io.github.fpiechowski.hex

import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.jvm.tasks.Jar
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.withType
import javax.inject.Inject

@Suppress("UnnecessaryAbstractClass", "EmptyClassBlock")
abstract class HexExtension
    @Inject
    constructor(private val project: Project) {
        @Suppress("unused")
        fun setupJars() {
            with(project.extensions.getByType(JavaPluginExtension::class.java)) {
                project.tasks.withType<Jar> {
                    from(sourceSets["domain"].output)
                }
            }
        }
    }

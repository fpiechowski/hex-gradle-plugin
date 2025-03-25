plugins {
    kotlin("jvm") version "2.1.10"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("io.github.fpiechowski.hex")
    application
}

application {
    mainClass.set("MainKt")
}

group = "com.github.fpiechowski"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("repository")
}

dependencies {
    implementation("com.github.fpiechowski:dependency:1.0-SNAPSHOT")
    domainImplementation("com.github.fpiechowski:dependency-domain:1.0-SNAPSHOT")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

hex {
    setupJars()
}

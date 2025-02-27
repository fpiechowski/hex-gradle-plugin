plugins {
    kotlin("jvm") version "2.1.10"
    `maven-publish`
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("io.github.fpiechowski.hex")
}

group = "com.github.fpiechowski"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

publishing {
    repositories {
        maven("../repository")
    }

    publications {
        create<MavenPublication>("main") {
            from(components["java"])
        }
    }
}

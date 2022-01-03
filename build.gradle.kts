plugins {
    kotlin("jvm")
    java
}

group = "io.novasql"
version = "0.0.0-SNAPSHOT"

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    // Project dependencies
    api(project(":API")) // Replace with external dependency
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
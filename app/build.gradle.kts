plugins {
    application
}

application {
    mainClassName = "multi.project.example.app.MainKt"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":api"))
}

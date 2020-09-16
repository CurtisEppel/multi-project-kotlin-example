plugins {
    kotlin("jvm") version "1.3.50" apply false
}

allprojects {
  group = "multi.project.example"
  version = "1.0"

  repositories {
    jcenter()
  }

  tasks.register("hello") {
    doLast {
      println("I'm ${this.project.name}")
    }
  }
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }
}

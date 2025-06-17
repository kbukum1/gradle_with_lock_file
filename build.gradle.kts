plugins {
    kotlin("jvm") version "2.1.21"       // or whatever Kotlin you prefer
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:33.2.0-jre")
    testImplementation(kotlin("test"))
}

application {
    // App.kt’s top-level main becomes AppKt in bytecode
    mainClass.set("AppKt")
}

/* ------------  DEPENDENCY LOCKING  ------------ */
dependencyLocking {
    lockAllConfigurations()          // lock everything (compile + runtime + test)
}
/* ---------------------------------------------- */

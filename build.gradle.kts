plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.lagradost.cloudstream3.gradle")
}

android {
    namespace = "com.cinestream"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlin.RequiresOptIn"
    }
}

cloudstream {
    setRepo("chichidelacrus577/CloudstreamPlugins")
}

dependencies {
    // CloudStream 3 Core API & Extractors
    val cloudstreamVersion = "pre-release"
    compileOnly("com.lagradost:cloudstream3:$cloudstreamVersion")

    // Jackson JSON parser
    compileOnly("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.2")
    compileOnly("com.fasterxml.jackson.core:jackson-databind:2.15.2")

    // Kotlin Coroutines
    compileOnly("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
}

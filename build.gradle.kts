// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
  repositories {
    google()
    jitpack()
    jcenter() // Warning: this repository is going to shut down soon
  }

  dependencies {
    classpath("com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_PLUGIN}")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}")
    classpath("com.github.momodae.AndroidSampleLibrary:plugin:${Versions.SAMPLE}")
    // NOTE: Do not place your application dependencies here; they belong
    // in the individual module build.gradle files
  }
}

tasks.register<Delete>("clean") {
  delete(rootProject.buildDir)
}
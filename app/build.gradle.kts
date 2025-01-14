plugins {
  id("com.android.application")
  kotlin("android")
}
val isApplyPlugin: Boolean by project.rootProject.extra
if (isApplyPlugin) {
  apply(plugin = "com.airsaid.sample")
}

android {
  compileSdk = Versions.App.COMPILE_SDK

  defaultConfig {
    applicationId = "com.cz.sample"
    minSdk = Versions.App.MIN_SDK
    targetSdk = Versions.App.TARGET_SDK
    versionCode = Versions.App.VERSION_CODE
    versionName = Versions.App.VERSION_NAME

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  kotlinOptions {
    jvmTarget = "1.8"
  }

  buildFeatures{
    viewBinding = true
  }
}

dependencies {
  implementation(Libs.AndroidX.KTX)
  implementation(Libs.AndroidX.APPCOMPAT)
  implementation(Libs.MATERIAL)
  implementation(Libs.AndroidX.CONSTRAINTLAYOUT)
  testImplementation(Libs.Test.JUNIT)
  androidTestImplementation(Libs.Test.ANDROIDX_JUNIT)
  androidTestImplementation(Libs.Test.ESPRESSO)
  implementation(project(":extension"))
}
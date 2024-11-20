plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.weather_defender"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.weather_defender"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation (libs.androidx.core.ktx.v170)
    implementation (libs.androidx.appcompat.v140)
    implementation (libs.material.v140)
    implementation (libs.androidx.constraintlayout.v212)
    implementation (libs.androidx.lifecycle.livedata.ktx.v240)
    implementation (libs.androidx.lifecycle.viewmodel.ktx.v240)
    implementation (libs.retrofit)
    implementation (libs.retrofit2.converter.gson)
}

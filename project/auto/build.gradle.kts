//plugins {
////    java
////    kotlin("jvm")
//    id("com.android.library")
//    kotlin("android")
//}
//android {
//    compileSdkVersion(com.x930073498.Versions.compileSdk)
//    defaultConfig {
//        minSdkVersion(com.x930073498.Versions.minSdk)
//        targetSdkVersion(com.x930073498.Versions.targetSdk)
//        versionCode(com.x930073498.Versions.versionCode)
//        versionName(com.x930073498.Versions.versionName)
//        consumerProguardFile("consumer-rules.pro")
//    }
//
//    lintOptions {
//        disable("GoogleAppIndexingWarning")
//        baseline(file("lint-baseline.xml"))
//    }
//}
import com.x930073498.*
group=com.x930073498.plugin.Publish.GROUP
version=com.x930073498.plugin.Publish.VERSION
description="自动任务基础库"
plugins{
    kotlin("jvm")
}

dependencies{
    compileOnly(Libraries.kotlin)
}
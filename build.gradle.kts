import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.springBoot)
    alias(libs.plugins.springDependency)
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.kotlinSpring)
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.springBootStarterWeb)
    implementation(libs.springBootStarterDataJpa)
    implementation(libs.jacksonModuleKotlin)
    implementation(libs.kotlinReflect)
    developmentOnly(libs.springBootDevtools)
    runtimeOnly(libs.h2)
    testImplementation(libs.springBootStarterTest)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

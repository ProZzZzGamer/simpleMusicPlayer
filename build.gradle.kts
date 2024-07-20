plugins {
    id("java")
}

group = "prozzzz.musicplayer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven (url = "https://jitpack.io")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.github.umjammer:jlayer:1.0.3")
}

tasks.test {
    useJUnitPlatform()
}
plugins {
    kotlin("jvm") version "1.9.22"
    id("maven-publish")
}

group = "fun.eternalblue"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    testImplementation(kotlin("test"))
    compileOnly("org.spigotmc:spigot-api:1.20.1-R0.1-SNAPSHOT")
    implementation(kotlin("stdlib"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin{
    jvmToolchain(17)
}
publishing{
    publications{
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
        }
    }
}
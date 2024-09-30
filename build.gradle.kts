plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("net.serenity-bdd:serenity-core:2.5.5")
    implementation("net.serenity-bdd:serenity-screenplay:2.5.5")
    implementation("net.serenity-bdd:serenity-rest-assured:2.5.5")
    implementation("net.serenity-bdd:serenity-screenplay-webdriver:2.5.5")
    implementation("org.seleniumhq.selenium:selenium-java:3.141.59")
    testImplementation("junit:junit:4.13.2")
    testImplementation("net.serenity-bdd:serenity-junit:2.5.5")
    testImplementation("io.cucumber:cucumber-java:6.10.4")
    testImplementation("io.cucumber:cucumber-junit:6.10.4")
}

tasks.test {
    useJUnitPlatform()
}
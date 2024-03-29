plugins {
    kotlin("jvm") version "1.7.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.javalin:javalin:5.6.3") 
    implementation(kotlin("stdlib"))
    implementation("org.slf4j:slf4j-simple:2.0.0")
}

application {
    mainClass.set("com.wallet.WalletKt")
}

tasks.processResources {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

sourceSets {
    main {
        resources {
            srcDirs ("src/main/resources/")
            include ("**/*.html")
        }
    }
}

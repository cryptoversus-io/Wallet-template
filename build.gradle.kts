plugins {
    kotlin("jvm") version "1.7.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.javalin:javalin:4.0.0") 
    implementation(kotlin("stdlib"))
    implementation("org.slf4j:slf4j-simple:1.7.32")
}

application {
    mainClass.set("com.wallet.WalletKt")
}

sourceSets {
    main {
        resources {
            srcDirs ("src/main/kotlin")
            include ("**/*.html")
        }
    }
}
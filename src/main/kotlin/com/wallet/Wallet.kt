package com.wallet

import io.javalin.Javalin
import io.javalin.http.staticfiles.Location

fun main() {
    val app = Javalin.create { config ->
        // Set the location of static files
        config.addStaticFiles("/com", Location.CLASSPATH)
    }.start(8080)

    app.get("/") { ctx ->
        ctx.redirect("/home.html")
    }

    // Other routes and logic add here
}

// Implement the rest of the Wallet class below needed
class Wallet {
    // Wallet class implementation
}

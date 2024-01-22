README.txt
==========

Project: Wallet Application ***EXAMPLE***
===========================

Introduction
------------
This Wallet Application is a simple Kotlin-based web project using Javalin to serve a web page and handle backend logic. The project includes a `Wallet.kt` Kotlin file as the main class and a `home.html` file for the frontend.

Prerequisites
-------------
- JDK (Java Development Kit) 1.8 or higher https://hg.openjdk.java.net/
      'sudo apt install openjdk-17-jdk'
- Kotlin 1.7.10 or higher https://kotlinlang.org/download/ (1.9.21)
- Gradle Build Tool (preferably the latest version) https://javalin.io/tutorials/gradle-setup
- An IDE that supports Kotlin https://github.com/VSCodium/vscodium/releases (1.82.2)
- Maven https://javalin.io/tutorials/maven-setup (3.6.3)
- Javalin https://github.com/javalin/javalin (5.6.3)

Project Structure
-----------------
- src/main/kotlin/com/wallet/Wallet.kt: Main Kotlin file for backend logic.
- src/main/resources/ : Static HTML file(s) for the frontend.

Setup Instructions
------------------
1. Clone or download the project to your local machine.
2. Open the project in your IDE.
3. Ensure that the JDK is properly set up in your IDE.

Building the Project
--------------------
1. Navigate to the root directory of the project via the terminal or command prompt.
2. Run the following command to build the project: 'gradle clean build'
  - To use the Gradle Wrapper use './gradlew clean build'
  - If ./gradlew permission is denied run 'chmod +x gradlew'
3. If the build is successful, you should see a BUILD SUCCESSFUL message in the terminal.

Running the Application
-----------------------
1. To run the application, execute:
   '''gradle run'''
   or
   '''./gradlew run'''

4. Once the application starts, it will be accessible at `http://localhost:8080`.
5. Open a web browser and navigate to `http://localhost:8080` to view the `home.html` page.

Important Notes
---------------
- The `home.html` file is served as a static file by the Javalin server running in `Wallet.kt`.
- Any changes to the Kotlin files will require a rebuild of the project.
- For detailed information on the project's functionality and API endpoints, refer to the inline comments in the `Wallet.kt` file.


***************************************************
*  ____  ___   ___  ____    _    _   _  ____ _  __*
* / ___|/ _ \ / _ \|  _ \  | |  | | | |/ ___| |/ /*
*| |  _| | | | | | | | | | | |  | | | | |   | ' / *
*| |_| | |_| | |_| | |_| | | |__| |_| | |___| . \ *
* \____|\___/ \___/|____/  |_____\___/ \____|_|\_\*
***************************************************
-------
contact @NinjaAssPirate.


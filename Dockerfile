# Use OpenJDK 17 Debian-based as the base image
FROM openjdk:17-bullseye

# Install necessary tools
RUN apt-get update && apt-get install -y curl unzip zip \
    && rm -rf /var/lib/apt/lists/*

# Install SDKMAN
RUN curl -s "https://get.sdkman.io" | bash

# Install Kotlin and the latest version of Gradle using SDKMAN
RUN bash -c "source $HOME/.sdkman/bin/sdkman-init.sh \
    && sdk install kotlin \
    && sdk install gradle"

# Install Maven
RUN apt-get update && apt-get install -y maven \
    && rm -rf /var/lib/apt/lists/*

# Set the working directory in the container
WORKDIR /app

# Copy the local project files to the container's workspace
COPY . /app

# Default command to run on container start
CMD /bin/bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && gradle run"
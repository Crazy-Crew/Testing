plugins {
    `java-library`

    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

tasks {
    compileJava {
        options.release.set(25)
        options.encoding = Charsets.UTF_8.name()
    }

    jar {
        manifest {
            attributes("Main-Class" to "com.ryderbelserion.App")
        }
    }
}

application {
    mainClass.set("com.ryderbelserion.App")
}
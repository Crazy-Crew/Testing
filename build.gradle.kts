plugins {
    `java-library`

    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks {
    compileJava {
        options.release.set(21)
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
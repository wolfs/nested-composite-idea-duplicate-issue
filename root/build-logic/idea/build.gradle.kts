plugins {
    `groovy-gradle-plugin`
}

tasks.register("ideaTask") {
    doLast {
        println("Hello from buildLogic:idea")
    }
}
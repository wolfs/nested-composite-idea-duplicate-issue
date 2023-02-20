plugins {
    `kotlin-dsl`
}

tasks.register("nestedIdeaTask") {
    doLast {
        println("Hello from included:buildLogic:idea")
    }
}
package dev.hijikatanasu

import dev.hijikatanasu.databese.configureDatabases
import dev.hijikatanasu.routing.configureRouting
import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    configureHTTP()
    configureSerialization()
    configureDatabases()
    configureFrameworks()
    configureRouting()
}

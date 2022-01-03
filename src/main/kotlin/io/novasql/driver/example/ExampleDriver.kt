package io.novasql.driver.example

import io.novasql.api.driver.Driver
import io.novasql.api.driver.DriverMetadata
import java.util.logging.Logger

val logger = Logger.getLogger("ExampleDriver")!!

@DriverMetadata(name = "ExampleDriver", version = "0.0.0")
sealed class ExampleDriver : Driver {

    override fun onLoad() {
        logger.info("ExampleDriver loaded.")
    }

    override fun onEnable() {
        logger.info("ExampleDriver enabled.")
    }

    override fun onDisable() {
        logger.info("ExampleDriver disabled.")
    }
}
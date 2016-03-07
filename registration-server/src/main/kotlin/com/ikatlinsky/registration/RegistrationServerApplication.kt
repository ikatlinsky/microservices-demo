package com.ikatlinsky.registration

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
 * @author ikatlinsky
 * @since 3/6/16
 */
@SpringBootApplication
@EnableEurekaServer
open class RegistrationServerApplication {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(RegistrationServerApplication::class.java, *args);
        }
    }
}
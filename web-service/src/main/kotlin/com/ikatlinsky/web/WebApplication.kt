package com.ikatlinsky.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

/**
 * @author ikatlinsky
 * @since 3/6/16
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
open class WebApplication {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(WebApplication::class.java, *args);
        }
    }

    @Autowired
    @LoadBalanced
    lateinit var restTemplate: RestTemplate;

    @RequestMapping(value = "/test")
    fun test(): String {
        return restTemplate.getForObject("http://ACCOUNTS-SERVICE/accounts/get", String::class.java);
    }
}
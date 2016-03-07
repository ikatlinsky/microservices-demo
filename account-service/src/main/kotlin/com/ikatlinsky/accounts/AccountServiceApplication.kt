package com.ikatlinsky.accounts

import com.ikatlinsky.accounts.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

/**
 * @author ikatlinsky
 * @since 3/6/16
 */
@SpringBootApplication
@EnableDiscoveryClient
open class AccountServiceApplication {

    @Autowired
    lateinit var accountRepository: AccountRepository

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(AccountServiceApplication::class.java, *args);
        }
    }
}
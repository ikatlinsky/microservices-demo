package com.ikatlinsky.accounts.controller

import com.ikatlinsky.accounts.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author ikatlinsky
 * @since 3/6/16
 */
@RestController
@RequestMapping("/accounts")
open class AccountController {

    @Autowired
    lateinit var accountRepository: AccountRepository;

    @RequestMapping(value = "/get")
    fun getTest() ="Hello World!"
}
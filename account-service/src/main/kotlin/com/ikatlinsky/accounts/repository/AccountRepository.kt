package com.ikatlinsky.accounts.repository

import com.ikatlinsky.accounts.model.Account
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @author ikatlinsky
 * @since 3/6/16
 */
interface  AccountRepository: JpaRepository<Account, Long>
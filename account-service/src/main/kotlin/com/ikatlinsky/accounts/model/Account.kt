package com.ikatlinsky.accounts.model

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * @author ikatlinsky
 * @since 3/6/16
 */
@Entity
data class Account(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long,
        val number: String,
        val owner: String
): Serializable
package com.example.kotlin.springboot.practice.datasource

import com.example.kotlin.springboot.practice.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}
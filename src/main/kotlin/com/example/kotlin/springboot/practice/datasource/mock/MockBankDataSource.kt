package com.example.kotlin.springboot.practice.datasource.mock

import com.example.kotlin.springboot.practice.datasource.BankDataSource
import com.example.kotlin.springboot.practice.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource{

    val banks = listOf(
        Bank("0001", 0.1, 1),
        Bank("0002", 0.3, 2),
        Bank("0003", 0.4, 3),
    );

    override fun retrieveBanks(): Collection<Bank> {
        return banks;
    }
}
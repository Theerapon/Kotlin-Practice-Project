package com.example.kotlin.springboot.practice.datasource.mock

import com.example.kotlin.springboot.practice.datasource.BankDataSource
import com.example.kotlin.springboot.practice.model.Bank
import org.springframework.stereotype.Repository
import java.lang.IllegalArgumentException

@Repository
class MockBankDataSource : BankDataSource{

    val banks = mutableListOf(
        Bank("0001", 0.1, 1),
        Bank("0002", 0.3, 2),
        Bank("0003", 0.4, 3),
    );

    override fun retrieveBanks(): Collection<Bank> {
        return banks;
    }

    override fun retrieveBanks(accountNumber: String): Bank {
        return banks.firstOrNull() {it.accountNumber == accountNumber}
            ?: throw  NoSuchElementException("Could not found a bank account number $accountNumber")
    }

    override fun createBank(bank: Bank): Bank {
        if(banks.any {it.accountNumber == bank.accountNumber}){
            throw  IllegalArgumentException("Bank with account number ${bank.accountNumber} already exists.")
        }
        banks.add(bank)

        return bank
    }
}
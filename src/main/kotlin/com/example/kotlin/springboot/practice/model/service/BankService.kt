package com.example.kotlin.springboot.practice.model.service

import com.example.kotlin.springboot.practice.datasource.BankDataSource
import com.example.kotlin.springboot.practice.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private  val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> {
        return dataSource.retrieveBanks();
    }

    fun getBanks(accountNumber: String): Bank {
        return  dataSource.retrieveBanks(accountNumber);
    }

    fun addBank(bank: Bank): Bank {
        return  dataSource.createBank(bank)
    }

    fun updateBank(bank: Bank): Bank {
        return  dataSource.updateBank(bank)
    }

}
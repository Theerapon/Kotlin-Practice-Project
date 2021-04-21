package com.example.kotlin.springboot.practice.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest{

    private  val mockBankDataSource = MockBankDataSource();

    @Test
    fun `should provide a collection of banks`() {
        //when
        val banks = mockBankDataSource.retrieveBanks();

        //then
        assertThat(banks).isNotEmpty;
        assertThat(banks.size).isGreaterThanOrEqualTo(3);
    }

    @Test
    fun `should provide some mock data`(){
        //when
        val banks = mockBankDataSource.retrieveBanks();

        //then
        assertThat(banks).allMatch() {
            it.accountNumber.isNotBlank();
            it.trust != 0.0;
            it.transactionFee != 0;
        }
    }
}
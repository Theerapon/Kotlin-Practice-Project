package com.example.kotlin.springboot.practice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class PracticeApplication{

	@Bean
	fun restTemplate(builder: RestTemplateBuilder): RestTemplate? {
		// Do any additional configuration here
		return builder.build()
	}
}

fun main(args: Array<String>) {
	runApplication<PracticeApplication>(*args)
}

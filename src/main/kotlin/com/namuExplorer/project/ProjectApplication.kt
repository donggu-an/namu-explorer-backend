package com.namuExplorer.project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableNeo4jRepositories
@EnableTransactionManagement
@ComponentScan(basePackages = ["com.namuExplorer.project"])
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}

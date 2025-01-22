package com.namuExplorer.project.model

import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node

@Node
data class Person(
    @Id @GeneratedValue
    val id: Long? = null,
    val name: String,
    val age: Int
)
package com.namuExplorer.project.repository

import com.namuExplorer.project.model.Person
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : Neo4jRepository<Person, Long> {
    fun findByName(name: String): List<Person>
}


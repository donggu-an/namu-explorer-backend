package com.namuExplorer.project.service
import com.namuExplorer.project.model.Person
import com.namuExplorer.project.repository.PersonRepository
import org.springframework.transaction.annotation.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.support.TransactionTemplate

@Service
class PersonService(
    private val personRepository: PersonRepository
) {
    @Transactional
    fun savePerson(name: String, age: Int): Person {
            val person = Person(name = name, age = age)
        return personRepository.save(person)
    }
    @Transactional
    fun findByName(name: String): List<Person> {
        return personRepository.findByName(name)
    }

    @Transactional
    fun findAll(): List<Person> {
        return personRepository.findAll() // 트랜잭션 내에서 모든 Person 조회
    }
}
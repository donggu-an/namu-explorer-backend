package com.namuExplorer.project.controller

import com.namuExplorer.project.model.Person
import com.namuExplorer.project.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/person")
class PersonController(@Autowired val personService: PersonService) {

    @PostMapping
    fun createPerson(@RequestParam name: String, @RequestParam age: Int): Person {
        return personService.savePerson(name, age)
    }

    @GetMapping
    fun getAllPersons(): List<Person> {
        return personService.findAll()
    }

    @GetMapping("/{name}")
    fun getPersonByName(@PathVariable name: String): List<Person> {
        return personService.findByName(name)
    }


}
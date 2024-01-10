package com.naveen.cloneLinkedIn.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.naveen.cloneLinkedIn.entity.Person;
import com.naveen.cloneLinkedIn.repository.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping("/save")
	public String insertPerson(@RequestParam long id,@RequestParam String name,@RequestParam String place,@RequestParam("file") MultipartFile file,@RequestParam LocalDate Date_of_Joining)
	{
		try {
			Person person = new Person();
			person.setId(id);
			person.setName(name);
			person.setPlace(place);
			person.setImage(file.getBytes());
			person.setDate_of_Joining(Date_of_Joining);
			personRepository.save(person);
			return "Person Data Inserted successfully";
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return "Failed to insert person data";
		}
	}
	@GetMapping("/all")
	public List<Person> getAllDetails()
	{
		return personRepository.findAll();
	}
	@GetMapping("/{id}")
	public Person getById(@PathVariable Long id)
	{
		return personRepository.findById(id).get();
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id)
	{
		personRepository.deleteById(id);
		return "Person data deleted successfully and the id is :" +  id;
	}
}

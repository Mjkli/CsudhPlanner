package com.example.CsudhPlanner.service;

import com.example.CsudhPlanner.dao.personDao;
import com.example.CsudhPlanner.model.Course;
import com.example.CsudhPlanner.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class PersonService {

    private final personDao personDao;

    @Autowired
    public PersonService(@Qualifier("postgres") personDao personDao){
        this.personDao = personDao;
    }

    //Repeating Methods to return back to the front end

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }

    public Optional<Person> getPersonById(Integer id){
        return personDao.selectPersonById(id);
    }

    public Optional<Person> getPersonByEmail(String email){
        return personDao.selectPersonByEmail(email);
    }

    public Integer deletePersonById(int id){return personDao.deletePersonById(id);}

    public Integer updatePerson(int id, Person newPerson){return personDao.updatePersonById(id,newPerson);}

    public ArrayList<ArrayList<Course>> standardPlan(int id){ return personDao.standardPlan(id);}

    public ArrayList<ArrayList<Course>> acceleratedPlan(int id){return personDao.acceleratedPlan(id);}

    public ArrayList<ArrayList<Course>> partTimePlan(int id){return  personDao.partTimePlan(id);}

    public boolean checkPassword(String email,String password){return  personDao.checkPassword(email,password);}

    public ArrayList<Integer> currentCourses(int id){return personDao.currentCourses(id);}

    public ArrayList<Integer> neededCourses(int id){return personDao.neededCourses(id);}

    public Integer schoolPlan(int id){return personDao.schoolPlan(id);}
}

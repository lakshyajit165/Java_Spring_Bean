package com.stackroute.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class ClassRoom {

    Student student;
    Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }



    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }



//    @PostConstruct
//    public void setDetails(){
//        s.studentId = 1;
//        s.age = 12;
//        s.name = "John";
//        s.gen = "Male";
//    }
//
//    @Bean
//    public void setLocation(){
//        this.area = "Kormangala";
//        this.city = "Bangalore";
//        System.out.println(this.area + " " + this.city);
//    }
//
//
//    public void showDetails(){
//
//        System.out.println(
//                "id: "+ s.studentId +
//                " Name: " + s.name +
//                " Gender: "+ s.gen +
//                " Age: " + s.age
//        );
//    }
     public void showDetails(){
         System.out.println(student);
         System.out.println(location);
     }


}

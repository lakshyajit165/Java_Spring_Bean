package com.stackroute.DI;




public class Student {


    String name;
    String gen;
    int studentId, age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gen='" + gen + '\'' +
                ", studentId=" + studentId +
                ", age=" + age +
                '}';
    }


//    public Student(int id, String name, String gen, int age){
//        this.studentId = id;
//        this.name = name;
//        this.gen = gen;
//        this.age = age;
//    }

}

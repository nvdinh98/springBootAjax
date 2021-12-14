package com.example.springajaxblog.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classRoom")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(targetEntity = Student.class, fetch = FetchType.EAGER)
    private List<Student> students;

    public ClassRoom() {
    }

    public ClassRoom(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public ClassRoom(Long id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}

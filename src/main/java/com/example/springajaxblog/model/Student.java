package com.example.springajaxblog.model;


import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String img;
    @ManyToOne
    @JoinColumn(name = "classRoom_id")
    private ClassRoom classRoom;

    public Student() {
    }

    public Student(String name, String address, String img, ClassRoom classRoom) {
        this.name = name;
        this.address = address;
        this.img = img;
        this.classRoom = classRoom;
    }

    public Student(Long id, String name, String address, String img, ClassRoom classRoom) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.img = img;
        this.classRoom = classRoom;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
}

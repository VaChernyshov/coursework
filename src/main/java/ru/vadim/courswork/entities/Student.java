package ru.vadim.courswork.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
public class Student {
    int id;
    String name;
    Speciality speciality;
    float score;

    public int getId() {
        return id;
    }

    @XmlElement(name = "id", required = true)
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name", required = true)
    public void setName(String name) {
        this.name = name;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    @XmlElement(name = "speciality", required = true)
    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public float getScore() {
        return score;
    }

    @XmlElement(name = "score", required = true)
    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speciality=" + speciality +
                ", score=" + score +
                '}';
    }
}

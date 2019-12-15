package com.example.demo.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int  idCar;
String name;
String photo;
String modele;

    public Car() {
    }

    public Car(int idCar, String name, String photo, String modele) {
        this.idCar = idCar;
        this.name = name;
        this.photo = photo;
        this.modele = modele;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
}

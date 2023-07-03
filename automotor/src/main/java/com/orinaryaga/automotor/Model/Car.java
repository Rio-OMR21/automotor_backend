package com.orinaryaga.automotor.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_brand")
    private String carBrand;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "production_date")
    private int productionDate;

    @Column(name = "car_type")
    private String carType;

    @Column(name = "car_description", length = 1000)
    private String carDescription;

    public Car() {
    }

    public Car(Long id, String carBrand, String carModel, int productionDate, String carType, String carDescription) {
        this.id = id;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.productionDate = productionDate;
        this.carType = carType;
        this.carDescription = carDescription;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarBrand() {
        return this.carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getProductionDate() {
        return this.productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public String getCarType() {
        return this.carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarDescription() {
        return this.carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    public Car id(Long id) {
        setId(id);
        return this;
    }

    public Car carBrand(String carBrand) {
        setCarBrand(carBrand);
        return this;
    }

    public Car carModel(String carModel) {
        setCarModel(carModel);
        return this;
    }

    public Car productionDate(int productionDate) {
        setProductionDate(productionDate);
        return this;
    }

    public Car carType(String carType) {
        setCarType(carType);
        return this;
    }

    public Car carDescription(String carDescription) {
        setCarDescription(carDescription);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(carBrand, car.carBrand)
                && Objects.equals(carModel, car.carModel) && productionDate == car.productionDate
                && Objects.equals(carType, car.carType) && Objects.equals(carDescription, car.carDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, carBrand, carModel, productionDate, carType, carDescription);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", carBrand='" + getCarBrand() + "'" +
                ", carModel='" + getCarModel() + "'" +
                ", productionDate='" + getProductionDate() + "'" +
                ", carType='" + getCarType() + "'" +
                ", carDescription='" + getCarDescription() + "'" +
                "}";
    }

    // Constructors, getters, setters
}
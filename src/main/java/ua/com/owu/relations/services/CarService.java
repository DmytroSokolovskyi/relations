package ua.com.owu.relations.services;

import org.springframework.stereotype.Service;
import ua.com.owu.relations.models.Car;

import java.util.List;


public interface CarService {

    void save(Car car);

    List<Car> findAll();
}

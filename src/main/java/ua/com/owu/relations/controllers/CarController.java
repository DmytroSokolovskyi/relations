package ua.com.owu.relations.controllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.owu.relations.models.Car;
import ua.com.owu.relations.services.CarService;

@RestController

public class CarController {


    private CarService carService;

    public CarController(@Qualifier("s1") CarService carService) {
        this.carService = carService;
    }


    @PostMapping("/car/save")
    public void saveCar() {
        carService.save(new Car("ahsgdfhasgfdhg"));

    }
}

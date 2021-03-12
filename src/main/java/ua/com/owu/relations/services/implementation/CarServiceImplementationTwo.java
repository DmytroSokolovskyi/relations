package ua.com.owu.relations.services.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.com.owu.relations.dao.CarDAO;
import ua.com.owu.relations.models.Car;
import ua.com.owu.relations.services.CarService;

import java.util.List;

@AllArgsConstructor
@Service("s2")
public class CarServiceImplementationTwo implements CarService {

    private CarDAO carDAO;


    @Override
    public void save(Car car) {
        carDAO.save(car);

    }

    @Override
    public List<Car> findAll() {
        return carDAO.findAll();
    }
}

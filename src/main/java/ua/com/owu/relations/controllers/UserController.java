package ua.com.owu.relations.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.com.owu.relations.dao.UserDAO;
import ua.com.owu.relations.models.Car;
import ua.com.owu.relations.models.Product;
import ua.com.owu.relations.models.User;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {



    private UserDAO userDAO;


    @GetMapping()
    public List<User> getUsers() {
        return userDAO.findAll();
    }

    @GetMapping("/save")
    public void save() {
        User user = new User();
        user.setName("vasya");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("milk"));
        productList.add(new Product("kokos"));
        user.setProducts(productList);

//        for (Product product : productList) {
//            product.setUser(user);
//        }
        userDAO.save(user);
    }


    @GetMapping("/saveWithCars")
    public void saveWithCars() {

        User user = new User("max");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("suba"));
        cars.add(new Car("mazda"));
        user.setCars(cars);
        userDAO.save(user);

    }

}

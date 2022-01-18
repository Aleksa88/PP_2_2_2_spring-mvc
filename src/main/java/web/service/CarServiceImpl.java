package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Toyota", "red", 1999));
        cars.add(new Car ("BMW", "white", 2020));
        cars.add(new Car ("Lada", "black", 2018));
        cars.add(new Car ("Audi", "blue", 2017));
        cars.add(new Car ("Kia", "black", 2014));
    }

    @Override
    public List<Car> getCarsList(Integer count) {
        return cars.stream().limit(count).toList();
    }
}
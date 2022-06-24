package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> getCountOfCars(int count) {
        List<Car> cars = carDAO.getCars();
        if (count > 5) {
            return cars.subList(0, 5);
        }
        return cars.subList(0, count);
    }
}

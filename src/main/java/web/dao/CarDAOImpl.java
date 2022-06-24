package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO{
    private final List<Car> cars = new ArrayList<>();
    @Override
    public List<Car> getCars() {
        cars.add(new Car(1, "model1", "owner1"));
        cars.add(new Car(2, "model2", "owner2"));
        cars.add(new Car(3, "model3", "owner3"));
        cars.add(new Car(4, "model4", "owner4"));
        cars.add(new Car(5, "model5", "owner5"));

        return cars;
    }
}

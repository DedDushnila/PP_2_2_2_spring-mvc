package web.service;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car("Mustang", 5, 200));
        cars.add(new Car("Camaro", 4, 210));
        cars.add(new Car("Skyline", 34, 250));
        cars.add(new Car("Camry", 6, 180));
        cars.add(new Car("LandCruiser", 200, 280));

    }

    @Override
    public List<Car> getCars(int count) {
        if (count > cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }


}

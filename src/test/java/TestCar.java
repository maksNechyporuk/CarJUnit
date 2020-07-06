import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestCar {
    Car[]cars;
String[]Makes;
Car[] CarByYear;
Car CarByYearAndPrice;
    @Before
public void CreateCar(){
        cars=new Car[3];
        CarByYear=new Car[2];
        cars[0]=new Car("BMW","X5", 2018, "Red", 20000,1);
        cars[1]=new Car("Audi","A6", 2016, "Black", 15000,2);
        cars[2]=new Car("Volkswagen","Passat", 2017, "Black", 12900,3);
        CarByYearAndPrice=new Car("Volkswagen","Passat", 2017, "Black", 12900,3);
        Makes=new String [3];
        Makes[0]="BMW";
        Makes[1]="Audi";
        Makes[2]="Volkswagen";//
        CarByYear[0]=new Car("Audi","A6", 2016, "Black", 15000,2);
        CarByYear[1]=new Car("Volkswagen","Passat", 2017, "Black", 12900,3);

    }

    @Test
    public void GetMake()
    {
        for (int i = 0; i < cars.length; i++) {
            Assert.assertEquals(Makes[i],  cars[i].GetMake());
        }
    }
    @Test
    public void GetCarByYear()
    {
        ArrayList<Car> list=new ArrayList<Car>();
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].GetCarByYear(3)!=null)
                list.add(cars[i]);
        }
        Assert.assertArrayEquals(CarByYear,  list.toArray());
    }
    @Test
    public void GetCarByYearAndPrice()
    {

        for (int i = 0; i < cars.length; i++) {
            if(cars[i].GetCarByYearAndPrice(2017,10000)!=null)
            Assert.assertEquals(CarByYearAndPrice.GetCarByYearAndPrice(2017,10000),
                    cars[i].GetCarByYearAndPrice(2017,10000));
        }
    }
}

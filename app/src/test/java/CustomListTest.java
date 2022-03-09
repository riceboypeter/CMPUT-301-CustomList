import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("halifax","NS"));
        assertEquals(list.getCount(),listSize+1);
    }

    @Test
    void testHasCity(){
        City myCity = new City("Vancouver","British Columbia");
        assertFalse(list.hasCity(myCity));
        list.add(myCity);
        assertTrue(list.hasCity(myCity));
    }

    @Test
    void testDelete(){
        City myCity = new City("Vancouver","British Columbia");
        int listSize = list.getCount();
        list.addCity(myCity);
        list.delete(myCity);
        assertEquals(list.getCount(),listSize);
    }

    @Test
    void testCountCities(){
        City myCity = new City("Vancouver","British Columbia");
        int listSize = list.getCount();
        assertEquals(list.countCities(),listSize);
        list.addCity(myCity);
        assertEquals(list.countCities(),listSize+1);
    }


}

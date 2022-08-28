import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {
    Car car;

    @BeforeEach
    void newCar() {
        car = new Car("Toyota", "qwert-123", 2022, "Oleg Olegovich");
    }

   @Test
    void getManufacturer() {
        assertEquals("Toyota", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("qwert-123", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("qwert-123");
        assertEquals("qwert-123", car.getNumber());
    }

    @Test
    void getYear() {
        assertEquals(2022, car.getYear());
    }

    @Test
    void getOwner() {
        assertEquals("Oleg Olegovich", car.getOwner());
    }

    @Test
    void setOwner() {
        car.setOwner("Ivan Ivanov");
        assertEquals("Ivan Ivanov", car.getOwner());
    }

    @Test
    void getListOwners() {
        assertArrayEquals(new String[]{"Oleg Olegovich"}, car.getOwners().toArray());
    }

    @Test
    void getListAllOwners() {
        car.setOwner("Ivan Ivanov");
        assertArrayEquals(new String[]{"Oleg Olegovich", "Ivan Ivanov"}, car.getOwners().toArray());
    }

}
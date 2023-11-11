package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    //    - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010, 4, 0);
        assertTrue(car instanceof Vehicle);
    }

//            - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testCarQuantityWheels() {
        Car car = new Car("Dodge", "Ram", 2010, 4, 0);
        assertThat(car.getNumWheels()).isEqualTo(4);
}
//            - Проверить, что объект Motorcycle создается с 2-мя колесами.

    @Test
    public void testMotorcycleQuantityWheels() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Gotto", 2022, 2, 0);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
//            - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testCarTestSpeed() {
        Car car = new Car("Dodge", "Ram", 2010, 4, 0);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }
    //            - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testMotorcycleTestSpeed() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Gotto", 2022, 2, 0);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }
//            - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void testCarTestStop() {
        Car car = new Car("Dodge", "Ram", 2010, 4, 0);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
//            - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void testMotorcycleTestStop() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Gotto", 2022, 2, 0);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
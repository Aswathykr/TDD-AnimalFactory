package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        DogHouse.clear();

        // When
        DogHouse.add(animal);
        DogHouse.add(animal);
        DogHouse.add(animal);

        Integer expectedNumberOfDogs = 3;
        // Then
        Integer numberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumberOfDogs, numberOfDogs);
    }
    @Test
    public void testAdd() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        Integer id = animal.getId();

        DogHouse.clear();

        // When
        DogHouse.add(animal);
        Dog retrievedDog = DogHouse.getDogById(id);

        Assert.assertEquals(animal, retrievedDog);
    }




    @Test
    public void testRemoveByReference() {
        // Given Dog1
        String name1 = "Milo";
        Date birthDate1 = new Date();
        Dog animal1 = AnimalFactory.createDog(name1, birthDate1);
        Integer id = animal1.getId();


        // When
        DogHouse.add(animal1);
        Animal dog = DogHouse.getDogById(id);
        Assert.assertEquals(animal1, dog);

        DogHouse.remove(animal1);
        Animal dog1 = DogHouse.getDogById(id);
        Assert.assertNull(dog1);

    }

    @Test
    public void testRemoveById() {
        // Given Dog1
        String name1 = "dog1";
        Date birthDate1 = new Date();
        Dog animal1 = AnimalFactory.createDog(name1, birthDate1);
        Integer id = animal1.getId();


        // When
        DogHouse.add(animal1);
        Animal dog = DogHouse.getDogById(id);
        Assert.assertEquals(animal1, dog);
        DogHouse.remove(id);

        //Then
        Animal dog1 = DogHouse.getDogById(id);
        Assert.assertNull(dog1);

    }

    @Test
    public void testGetDogById() {
        // Given Dog1
        String name1 = "Milo";
        Date birthDate1 = new Date();
        Dog animal1 = AnimalFactory.createDog(name1, birthDate1);
        Integer id = animal1.getId();


        // When
        DogHouse.add(animal1);
        Animal dog = DogHouse.getDogById(id);

        //Then
        Assert.assertEquals(animal1, dog);

    }
}

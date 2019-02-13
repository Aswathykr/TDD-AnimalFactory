package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);

        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.add(animal);
        CatHouse.add(animal);

        Integer expectedNumberOfCats = 3;
        // Then
        Integer numberOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumberOfCats, numberOfCats);
    }
    @Test
    public void testAdd() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        Integer id = animal.getId();

        CatHouse.clear();

        // When
        CatHouse.add(animal);
        Cat retrievedCat = CatHouse.getCatById(id);

        Assert.assertEquals(animal, retrievedCat);
    }




    @Test
    public void testRemoveByReference() {
        // Given Cat1
        String name = "Milo";
        Date birthDate1 = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate1);
        Integer id = animal.getId();


        // When
        CatHouse.add(animal);
        Animal cat = CatHouse.getCatById(id);
        Assert.assertEquals(animal, cat);

        CatHouse.remove(animal);
        Animal cat1 = CatHouse.getCatById(id);
        Assert.assertNull(cat1);

    }

    @Test
    public void testRemoveById() {
        // Given Cat1
        String name1 = "Cat1";
        Date birthDate1 = new Date();
        Cat animal1 = AnimalFactory.createCat(name1, birthDate1);
        Integer id = animal1.getId();


        // When
        CatHouse.add(animal1);
        Animal cat = CatHouse.getCatById(id);
        Assert.assertEquals(animal1, cat);
        CatHouse.remove(id);

        //Then
        Animal cat1 = CatHouse.getCatById(id);
        Assert.assertNull(cat1);

    }

    @Test
    public void testGetCatById() {
        // Given Cat1
        String name1 = "Milo";
        Date birthDate1 = new Date();
        Cat animal1 = AnimalFactory.createCat(name1, birthDate1);
        Integer id = animal1.getId();


        // When
        CatHouse.add(animal1);
        Animal cat = CatHouse.getCatById(id);

        //Then
        Assert.assertEquals(animal1, cat);

    }
}

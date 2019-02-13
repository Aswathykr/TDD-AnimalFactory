package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //call setName
        String newName = "Aswathy";
        cat.setName(newName);

        //Retrieve name
        String retrievedName = cat.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newName, retrievedName);

    }

    @Test
    public void speakTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String expectedStr = "meow!";

        //Retrieve speak
        String retrievedString = cat.speak();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedStr, retrievedString);

    }
    @Test
    public void setBirthDateTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //call setBirthDate
        Date newBirthDate = new Date(2010, 5,5);
        cat.setBirthDate(newBirthDate);

        //Retrieve name
        Date retrievedBirthDate = cat.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newBirthDate, retrievedBirthDate);

    }

    @Test
    public void eatTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        int initialNumberOfMealsEaten = cat.getNumberOfMealsEaten();
        //call setBirthDate
        cat.eat(new Food());

        int finalNumberOfMealsEaten = cat.getNumberOfMealsEaten();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(finalNumberOfMealsEaten, initialNumberOfMealsEaten + 1);

    }


    @Test
    public void getIDTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 21;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //Retrieve name
        Integer retrievedId  = cat.getId();;

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenId, retrievedId);

    }

    @Test
    public void animalInheritanceTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 21;

        // When (a cat is constructed)
        Animal animal = new Cat(givenName, givenBirthDate, givenId);

        //Use Animal Interface to Retrieve cats id
        Integer retrievedId  = animal.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(retrievedId, givenId);

    }
    @Test
    public void mammalInheritanceTest() {
        // Given (cat data)
        String givenName = "Aswathy";
        Date givenBirthDate = new Date();
        Integer givenId = 21;

        // When (a cat is constructed)
        Mammal mammal = new Cat(givenName, givenBirthDate, givenId);

        //Use Mammal Interface to Retrieve cats name
        String retrievedName = mammal.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(retrievedName, retrievedName);

    }
}

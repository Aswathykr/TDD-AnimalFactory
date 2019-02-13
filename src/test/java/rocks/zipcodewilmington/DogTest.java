package rocks.zipcodewilmington;

        import org.junit.Assert;
        import org.junit.Test;
        import rocks.zipcodewilmington.animals.Animal;
        import rocks.zipcodewilmington.animals.Dog;
        import rocks.zipcodewilmington.animals.Mammal;

        import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void contructorTest() {
        //Given
        String givenName = "Meeks";
        Date birthDate = new Date();
        Integer id = 12;

        //When
        Dog dog = new Dog(givenName, birthDate, id);

        //Then
        String retrievedName = dog.getName();
        Date retrievedDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(retrievedName, givenName);
        Assert.assertEquals(birthDate, retrievedDate);
        Assert.assertEquals(retrievedId, id);
    }

    @Test
    public void setBirthDateTest() {
        //Given
        String givenName = "Meeks";
        Date birthDate = new Date();
        Integer id = 12;

        Dog dog = new Dog(givenName, birthDate, id);
        //When
        Date newBirthdate = new Date(2019, 11,11);
        dog.setBirthDate(newBirthdate);
        //Then
        Date retrievedDate = dog.getBirthDate();

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(retrievedDate, newBirthdate);
    }
    @Test
    public void speakTest() {
        //Given
        String givenName = "Meeks";
        Date birthDate = new Date();
        Integer id = 12;
        String expectedString = "bark!";
        //When
        Dog dog = new Dog(givenName, birthDate, id);

        //Then
        String retrievedString = dog.speak();

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(retrievedString, expectedString);
    }

    @Test
    public void eatTest() {
        //Given
        String givenName = "Meeks";
        Date birthDate = new Date();
        Integer id = 12;
        String expectedString = "bark!";
        //When
        Dog dog = new Dog(givenName, birthDate, id);
        Integer numberofFoodBeforeEat = dog.getNumberOfMealsEaten();
        dog.eat(new Food());
        numberofFoodBeforeEat++;
        //Then

        // Then (we expect to get the given name from the dog)
        Integer numberofFoodAfterEat = dog.getNumberOfMealsEaten();
        Assert.assertEquals(numberofFoodBeforeEat, numberofFoodAfterEat);
    }

    @Test
    public void getIdTest() {
        //Given
        String givenName = "Meeks";
        Date birthDate = new Date();
        Integer actualId = 12;
        Dog dog = new Dog(givenName, birthDate, actualId);

        //When
        Integer retrievedId = dog.getId();

        //Then
        Assert.assertEquals(actualId, retrievedId);
    }
    @Test
    public void animalInheritanceTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 21;

        // When (a cat is constructed)
        Animal animal = new Dog(givenName, givenBirthDate, givenId);

        //Use Animal Interface to Retrieve dogs id
        Integer retrievedId  = animal.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(retrievedId, givenId);

    }
    @Test
    public void mammalInheritanceTest() {
        // Given (cat data)
        String givenName = "Ammies";
        Date givenBirthDate = new Date();
        Integer givenId = 21;

        // When (a cat is constructed)
        Mammal mammal = new Dog(givenName, givenBirthDate, givenId);

        //Use Mammal Interface to Retrieve dogs name
        String retrievedName = mammal.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(retrievedName, retrievedName);
    }
}

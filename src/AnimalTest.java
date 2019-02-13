/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

	void testAnimalStringStringDoubleDouble() throws AssertException {
		Animal pupper = new Animal("Blue", "Pupper", 5.5, 6.0);
		
		Assert.assertEquals("Blue", pupper.getColor());
		Assert.assertEquals("Pupper", pupper.getName());
		Assert.assertEquals(5.5, pupper.getWeight());
		Assert.assertEquals(6.0, pupper.getHeight());
	}


	void testGetColor() throws AssertException {
		Animal animal = new Animal("Pink", "", 0, 0);
		
		Assert.assertEquals("Pink", animal.getColor());
	}

	void testGetName() throws AssertException {
		Animal animal = new Animal("", "Doggo", 0, 0);
		
		Assert.assertEquals("Doggo", animal.getName());
	}

	void testGetWeight() throws AssertException {
		Animal animal = new Animal("", "", 2.2, 0);
		
		Assert.assertEquals(2.2, animal.getWeight());
	}

	void testGetHeight() throws AssertException {
		Animal animal = new Animal("", "", 0, 3.3);
		
		Assert.assertEquals(3.3, animal.getHeight());
	}

	void testToString() throws AssertException {
		Animal animal = new Animal("Purple", "Dog", 7.77, 8.88);
		
		Assert.assertEquals("Dog, a Purple-colored animal. 7.8 pounds, 8.9 inches\n", animal.toString());
	}

	void testEqualsObject() throws AssertException {
		Animal pupper = new Animal("Blue", "Doggo", 6.6, 4.4);
		Animal doggo = new Animal("Blue", "Doggo", 6.6, 4.4);

		Animal penguin = new Animal("Black", "Pengi", 4, 5);
		
		Object fakeDoggo = new Object();
		
		Assert.assertEquals(true, pupper.equals(doggo));
		Assert.assertEquals(true, pupper.equals(doggo));
		Assert.assertEquals(false, penguin.equals(doggo));
		Assert.assertEquals(false, doggo.equals(fakeDoggo));
	}
}



class ZooTest {

	void testZoo() throws AssertException {
		Zoo zoo = new Zoo(5);
		
		Assert.assertEquals(5, zoo.getAnimals().length);
		Assert.assertEquals(5, zoo.getCapacity());
	}

	void testAddAnimal() throws AssertException {
		Zoo zoo = new Zoo(1);
		zoo.addAnimal(new Animal());
		zoo.addAnimal(new Animal());
		
		// Test increase in capacity
		Assert.assertEquals(2, zoo.getCapacity());

		Zoo pupperZoo = new Zoo(1);
		Animal pupper = new Animal("Blue", "Pupper", 5.5, 6.0);
		pupperZoo.addAnimal(pupper);
		
		// Test animal is added to array
		Assert.assertEquals(pupper, pupperZoo.getAnimals()[0]);
	}

	void testGetTotalHeight() throws AssertException {
		Zoo zoo = new Zoo(1);
		zoo.addAnimal(new Animal("Blue", "Pupper", 8.1, 5.5));
		zoo.addAnimal(new Animal("Pink", "Doggo", 5.5, 6.5));
		
		Assert.assertEquals(12.0, zoo.getTotalHeight());
	}

	void testGetAverageWeight() throws AssertException {
		Zoo zoo = new Zoo(1);
		zoo.addAnimal(new Animal("Blue", "Pupper", 8.1, 5.5));
		zoo.addAnimal(new Animal("Pink", "Doggo", 5.5, 6.5));
		zoo.addAnimal(new Animal("Yellow", "Durk", 6.7, 6.5));
		
		// Actual 6.76 -> 7, but method rounds down so expected is 6
		Assert.assertEquals(6, zoo.getAverageWeight());
	}

	void testGetAverageWeightString() throws AssertException {
		Zoo zoo = new Zoo(1);
		zoo.addAnimal(new Animal("Blue", "Pupper", 8.1, 5.5));
		zoo.addAnimal(new Animal("Blue", "Doggo", 5.5, 6.5));
		zoo.addAnimal(new Animal("Blue", "Durk", 6.7, 6.5));
		
		// Should ignore this one 
		zoo.addAnimal(new Animal("Purple", "Dork", 6.7, 6.5));
		
		// Actual 6.76 -> 7, but method rounds down so expected is 6
		Assert.assertEquals(6, zoo.getAverageWeight("Blue"));
	}

	void testGetAnimals() throws AssertException {
		Animal[] animals = new Animal[3];
		animals[0] = new Animal("Blue", "Pupper", 8.1, 5.5);
		animals[1] = new Animal("Pink", "Doggo", 5.5, 6.5);
		animals[2] = new Animal("Yellow", "Durk", 6.7, 6.5);
		
		Zoo zoo = new Zoo(3);
		zoo.addAnimal(animals[0]);
		zoo.addAnimal(animals[1]);
		zoo.addAnimal(animals[2]);
		
		Assert.assertEquals(animals[0], zoo.getAnimals()[0]);
		Assert.assertEquals(animals[1], zoo.getAnimals()[1]);
		Assert.assertEquals(animals[2], zoo.getAnimals()[2]);
	}

	void testGetCapacity() throws AssertException {
		Zoo zoo = new Zoo(1);
		
		// Get initial
		Assert.assertEquals(1, zoo.getCapacity());
		
		zoo.addAnimal(new Animal("Blue", "Pupper", 8.1, 5.5));
		zoo.addAnimal(new Animal("Blue", "Doggo", 5.5, 6.5));
		zoo.addAnimal(new Animal("Blue", "Durk", 6.7, 6.5));
		
		// Double twice 1 * 2 = 2, 2 * 2 = 4
		Assert.assertEquals(4, zoo.getCapacity());
	}
    
	void testToString() throws AssertException {
		Zoo zoo = new Zoo(3);
		
		zoo.addAnimal(new Animal("Blue", "Pupper", 1, 1));
		zoo.addAnimal(new Animal("Pink", "Doggo", 2, 2));
		zoo.addAnimal(new Animal("Purple", "Durk", 3, 3));
		
		Assert.assertEquals("These animals live in the zoo: \nPupper, a Blue-colored animal. 1.0 pounds, 1.0 inches\nDoggo, a Pink-colored animal. 2.0 pounds, 2.0 inches\nDurk, a Purple-colored animal. 3.0 pounds, 3.0 inches\n", zoo.toString());
	}
}


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
}

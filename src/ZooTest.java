
class ZooTest {

	void testZoo() throws AssertException {
		Zoo zoo = new Zoo(5);
		
		Assert.assertEquals(5, zoo.getAnimals().length);
		Assert.assertEquals(5, zoo.getCapacity());
	}

}

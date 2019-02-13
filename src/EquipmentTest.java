
class EquipmentTest {

	void testEquipment() throws AssertException {
		Equipment equip = new Equipment("Bucky/2,3.3,4.4,BadBoy");
		
		Assert.assertEquals("Bucky", equip.getName());
		Assert.assertEquals(2, equip.getCount());
		Assert.assertEquals(3.3, equip.getTotalWeight());
		Assert.assertEquals(4.4, equip.getTotalPrice());
		Assert.assertEquals("BadBoy", equip.getDescription());
	}

	void testToString() throws AssertException {
		Equipment equip = new Equipment("Bucky/2,3.3,4.4,BadBoy");

		Assert.assertEquals("Name: Bucky, Number: 2, Weight: 3.30 lbs, Price: $4.40 - BadBoy", equip.toString());
	}


	void testGetName() throws AssertException {
		Equipment equip = new Equipment("Bucky/2,3.3,4.4,BadBoy");
		
		Assert.assertEquals("Bucky", equip.getName());
	}

	void testGetCount() throws AssertException {
		Equipment equip = new Equipment("Bucky/2,3.3,4.4,BadBoy");
		
		Assert.assertEquals(2, equip.getCount());
	}

	void testGetTotalWeight() throws AssertException {
		Equipment equip = new Equipment("Bucky/2,3.3,4.4,BadBoy");
		
		Assert.assertEquals(3.3, equip.getTotalWeight());
	}

	void testGetTotalPrice() throws AssertException {
		Equipment equip = new Equipment("Bucky/2,3.3,4.4,BadBoy");
		
		Assert.assertEquals(4.4, equip.getTotalPrice());
	}

	void testGetDescription() throws AssertException {
		Equipment equip = new Equipment("Bucky/2,3.3,4.4,BadBoy");
		
		Assert.assertEquals("BadBoy", equip.getDescription());
	}
}

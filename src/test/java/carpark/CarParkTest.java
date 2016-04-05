package carpark;

import org.junit.Assert;
import org.junit.Test;

public class CarParkTest {

	@Test
	public void park() throws Exception {

	}

	@Test
	public void test() {
		CarPark p = new CarPark(2, 1);
		int c1 = p.parkCar();
		int c2 = p.parkCar();
		int c3 = p.parkCar();
		int c4 = p.parkCar();
		p.unpark(c2);
		int t1 = p.parkTruck();
		int c5 = p.parkCar();
		p.unpark(c3);
		int t2 = p.parkTruck();
		p.unpark(t2);
		int t3 = p.parkTruck();
		Assert.assertEquals(true, c1 > 0);
		Assert.assertEquals(true, c2 > 0);
		Assert.assertEquals(true, c3 > 0);
		Assert.assertEquals(true, c4 < 0);
		Assert.assertEquals(true, t1 < 0);
		Assert.assertEquals(true, c5 > 0);
		Assert.assertEquals(true, t2 > 0);
		Assert.assertEquals(true, t3 > 0);
	}
}
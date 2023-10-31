package adda_midterm_package;
import org.testng.Assert;
import org.testng.annotations.*;
public class apptest {
	@Test
	public void logintest1() {
		app obj = new app();
		int test1 = obj.login("Kishan", "2312");
		Assert.assertEquals(0, test1);
		
	}
	@Test
	public void logintest2() {
		app obj = new app();
		int test2 = obj.login("ram", "3025");
		Assert.assertEquals(1, test2);
	}
}

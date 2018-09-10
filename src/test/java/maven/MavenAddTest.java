package maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MavenAddTest {

	MavenAdd mavenAdd=new MavenAdd();
	@Test
	public void test() {
		assertEquals(20, mavenAdd.add(10, 10));
	}

}

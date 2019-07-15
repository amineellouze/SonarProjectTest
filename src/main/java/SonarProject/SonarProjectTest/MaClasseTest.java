package SonarProject.SonarProjectTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaClasseTest {
	@Test(expected =ExceptionInvalide.class)
	public void testCalculer() throws Exception {
	assertEquals(2,MaClasse.diviser(4,null));
	assertEquals(6,MaClasse.add(4,2));
	}
	}


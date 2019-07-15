package SonarProject.SonarProjectTest;


public class MaClasse {
	public static int add(int a, int b) {
		return a + b;
    	}
	public static int diviser(int a, Integer b) {
		if(b==null) throw 
		new ExceptionInvalide("la diviseur est null");
		if(b!=0) {
			return a / b;
		}
		return -1;
	}
}

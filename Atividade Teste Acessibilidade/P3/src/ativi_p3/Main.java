package ativi_p3;

public class Main {
	
	public static void main (String args[]){
		Singleton sin = Singleton.getInstancia();
		System.out.println(sin.getInstancia());
	}

}

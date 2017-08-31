package ativi_p3;

public class Singleton {

	

	private static Singleton instancia;

	protected Singleton() {
	}

	public static Singleton getInstancia(){
		return instancia;
	}

}

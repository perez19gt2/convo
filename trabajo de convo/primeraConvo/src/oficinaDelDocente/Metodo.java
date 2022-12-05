package oficinaDelDocente;

public abstract class Metodo {
	
	public static int generanNumerosAleatorios(int minimo, int maximo) {
		return 	(int)(Math.floor(Math.random()*(minimo-(maximo+1))+(maximo*+1)));
	}
	public abstract void asistencia();
	public abstract void notas();
}

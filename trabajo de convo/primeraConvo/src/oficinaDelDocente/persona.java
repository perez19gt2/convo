package oficinaDelDocente;

public class persona {
	private  String Nombre;
	private  int Edad;
	private  String genero;
	private   String correo;
	
	public persona(String nombre, int edad, String genero, String correo) {
		super();
		Nombre = nombre;
		Edad = edad;
		this.genero = genero;
		this.correo = correo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	

}

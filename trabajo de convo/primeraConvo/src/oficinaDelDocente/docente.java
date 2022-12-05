package oficinaDelDocente;

public class docente extends persona {

	public docente(String nombre, int edad, String genero, String correo) {
		super(nombre, edad, genero, correo);
	}

	public void mostrar() {
		System.out.println("nombre del docente: " + super.getNombre() +" la edad del docente es: " +super.getEdad() + " genero del docente: " + super.getGenero() + " su correoelectronico es: " + super.getCorreo()) ;
		
	}
	
}
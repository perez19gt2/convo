package oficinaDelDocente;

public class appoficina {

	public static void main(String[] args) {
		System.out.println("biemvenido a la oficina del prfe de programacion");
		oficina oficina = new oficina();
		oficina.asistencia();
		
		docente p1 = new docente ("steven perez", 32, "hombre", "stevenjps08@gmail.com");
		System.out.println("el docente actual de la asignatura es: ");
		p1.mostrar();
		
		Estudiante p2 = new Estudiante("kevin alexander", 22, "hombre", "kevinjps08@gmail.com");
		System.out.println("el estudiante que pide la nota es: ");
		p2.mostrar();
		
		System.out.println("sus notas son");
		oficina.notas();
	}
}
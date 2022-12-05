package oficinaDelDocente;

public class oficina  extends Metodo{
		public oficina() {
		super();

	}

		@Override
		public void asistencia() {
			int Docente=Metodo.generanNumerosAleatorios(1,3);
			if (Docente > 1)  {
				System.out.println("el Docente no esta en la oficina pero dejo su nota en esta hoja");
			}
			else{
				System.out.println("el docente se encuentra en la oficina ya lo atendera");
			}
		}

		@Override
		public void notas() {
			int Notas=Metodo.generanNumerosAleatorios(40,100);
			if (Notas < 60)  {
				System.out.println("la nota es menor a 60 reprobaste la clase"+Notas);
			}else  {
				System.out.println("la nota es mayor a 60 felicidades pasaste mi clase"+Notas);
			}
		
		}	
}

package Estudiantes;
import java.util.ArrayList;

public class GestionEstudiantes {

    public static void main(String[] args) {
		
		ArrayList<Estudiantes> estudiantes = new ArrayList<>();
		
		Estudiantes est1 = new Estudiantes("Dani", "Diaz", 9.5);
		Estudiantes est2 = new Estudiantes("Dami", "Blanco", 4.5);
		Estudiantes est3 = new Estudiantes("Hernan", "Pinto", 8.0);
		Estudiantes est4 = new Estudiantes("Lucho", "Repor", 90.0);
		Estudiantes est5 = new Estudiantes("Mati", "Elgart", 6.0);
		
		estudiantes.add(est1);
		estudiantes.add(est2);
		estudiantes.add(est3);
		estudiantes.add(est4);
		estudiantes.add(est5);
		
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println("Estudiante: " + estudiantes.get(i).toString());
		}
		
		est1.setCalificacion(7.0);
		System.out.println(est1);
		
		estudiantes.remove(est1);
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println("Estudiante: " + estudiantes.get(i).toString());
		}
		
	}
    
}

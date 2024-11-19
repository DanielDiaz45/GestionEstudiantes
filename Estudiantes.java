package Estudiantes;

public class Estudiantes {
    private String nombre;
	private String apellido;
	private double calificacion;
	
	public Estudiantes(String nombre, String apellido, double calificacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.calificacion = calificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellido: " + apellido + ", Calificacion: " + calificacion;
	}
	
}

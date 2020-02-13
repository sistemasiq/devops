package mx.edu.itlapiedad.models;

public class Alumno {
	int id;
	String nombre;
	String nocontrol;
	int carrera_id;
	
	public Alumno() {
		super();
	}

	public Alumno(int id, String nombre, String nocontrol, int carrera_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nocontrol = nocontrol;
		this.carrera_id = carrera_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNocontrol() {
		return nocontrol;
	}

	public void setNocontrol(String nocontrol) {
		this.nocontrol = nocontrol;
	}

	public int getCarrera_id() {
		return carrera_id;
	}

	public void setCarrera_id(int carrera_id) {
		this.carrera_id = carrera_id;
	}
	
	
}

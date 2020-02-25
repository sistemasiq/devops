package mx.edu.itlapiedad.dao;

import java.util.List;
import mx.edu.itlapiedad.models.Alumno;

public interface AlumnoDAO {
	public List<Alumno> consultar();	
	public void insertar(Alumno alumno);
	public Alumno buscar(int id);
	public void eliminar(int id);
	
	//memo es el pro
	public void actualizar(Alumno alumno);
}

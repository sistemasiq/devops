package mx.edu.itlapiedad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.models.Alumno;

@Repository
public class AlumnoJDBC implements AlumnoDAO {

	@Autowired
	JdbcTemplate conexion;
	
	String sql;
	
	@Override
	public List<Alumno> consultar() {
		sql = "SELECT * FROM alumnos";
		return conexion.query(sql, new AlumnoRM());
	}

	@Override
	public void insertar(Alumno alumno) {
		sql = "INSERT INTO alumnos (nombre, nocontrol, carrera_id) VALUES(?, ?, ?)";
		conexion.update(sql, alumno.getNombre(), alumno.getNocontrol(), 
				alumno.getCarrera_id());
	}

	@Override
	public Alumno buscar(int id) {
		sql = "SELECT * FROM alumnos WHERE id = ?";
		return conexion.queryForObject(sql, new AlumnoRM(), id);
	}

	@Override
	public void eliminar(int id) {
		sql = "DELETE FROM alumnos WHERE id = ?";
		conexion.update(sql, id);
	}

	@Override
	public void actualizar(Alumno alumno) {
		sql = "UPDATE alumnos SET nombre = ?, nocontrol = ?, carrera_id = ? WHERE id = ?";
		conexion.update(sql, alumno.getNombre(), 
							 alumno.getNocontrol(), 
							 alumno.getCarrera_id(), 
							 alumno.getId());		
	}

}

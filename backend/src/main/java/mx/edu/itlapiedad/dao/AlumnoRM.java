package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import mx.edu.itlapiedad.models.Alumno;

public class AlumnoRM implements RowMapper<Alumno> {

	@Override
	public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException {
		Alumno alumno = new Alumno();
		alumno.setId(rs.getInt("id"));
		alumno.setNombre(rs.getString("nombre"));
		alumno.setNocontrol(rs.getString("nocontrol"));
		alumno.setCarrera_id(rs.getInt("carrera_id"));
		return alumno;
	}

}

package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.dao.AlumnoDAO;
import mx.edu.itlapiedad.models.Alumno;

@RestController
@RequestMapping("/hola")
public class Mensaje {
	
	@Autowired
	AlumnoDAO repositorio;
	
	@GetMapping("servicio")
	public String enviarSaludo() {
		return "Hola WS!";
	}
	
	@GetMapping("alumno")
	public Alumno mostrarAlumno() {
		Alumno alumno = new Alumno();
		alumno.setNombre("Pacheco");
		alumno.setNocontrol("16640121");
		alumno.setCarrera_id(1);
		return alumno;
	}
	
	@GetMapping("alumnos")
	public List<Alumno> consultarAlumnos(){
		return repositorio.consultar();
	}
	
	@PostMapping("alumno")
	public void insertarAlumno(@RequestBody Alumno alumno) {
		repositorio.insertar(alumno);
	}
	
	@GetMapping("alumnos/{id}")
	public Alumno buscarAlumno(@PathVariable int id) {
		return repositorio.buscar(id);
	}
	
	@DeleteMapping("alumnos/{id}")
	public void eliminarAlumno(@PathVariable int id) {
		repositorio.eliminar(id);
	}
	
	@PutMapping("alumnos")
	public void actualizarAlumno(@RequestBody Alumno alumno) {
		repositorio.actualizar(alumno);
	}
	//hola, vamos a reprobar loser
	
	// Aveces la vida no e como nosotros creiamos
	@GetMapping("sumarNumeros/{operacion}/{num1}/{num2}")
	  public float sumar_numeros(@PathVariable int operacion, @PathVariable float num1,@PathVariable float num2) {
	  float total=0;
	  
	  if(operacion==1) {
		  total=num1+num2;
	  }else if(operacion==2){
		  total=num1-num2;
	  }else if(operacion==3){
		  total=num1*num2;
	  }else if(operacion==4){
		  total=num1/num2;
	  }
		return total;
	  }
	
}

package cr.ac.una.unaplanilla.service;

import cr.ac.una.unaplanilla.model.EmpleadoDto;
import cr.ac.una.unaplanilla.util.Respuesta;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cbcar
 */
public class EmpleadoService {
    
    public Respuesta getUsuario(String usuario, String clave){
        try{
            
            return null;// TODO return new Respuesta(true,"","", "Usuario",empleadoDto);
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, "Error obteniendo el usuario [" + usuario + "]", ex);
            return new Respuesta(false, "Error obteniendo el usuario.", "getUsuario " + ex.getMessage());
        } 
    }
    
    public Respuesta getEmpleado(Long id){
        try{
            
            return null;// TODO return new Respuesta(true,"","", "Empleado",empleadoDto);
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, "Error obteniendo el empleado [" + id + "]", ex);
            return new Respuesta(false, "Error obteniendo el empleado.", "getEmpleado " + ex.getMessage());
        } 
    }
    
    public Respuesta getEmpleados(String cedula, String nombre, String pApellido, String sApellido) {
        try {
            
            return null;// TODO return new Respuesta(true, "", "", "Empleados", empleadosDto);
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, "Error obteniendo empleados.", ex);
            return new Respuesta(false, "Error obteniendo empleados.", "getEmpleados " + ex.getMessage());
        }
    }
    
    public Respuesta guardarEmpleado(EmpleadoDto empleadoDto){
        try {
            
            return null;// TODO return new Respuesta(true, "", "", "Empleado", new EmpleadoDto(empleado));
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, "Ocurrio un error al guardar el empleado.", ex);
            return new Respuesta(false, "Ocurrio un error al guardar el empleado.", "guardarEmpleado " + ex.getMessage());
        }
    }
    
    public Respuesta eliminarEmpleado(Long id){
        try{
            
            return new Respuesta(true, "", "");
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, "Error eliminando el empleado", ex);
            return new Respuesta(false, "Error eliminando el empleado.", "eliminarEmpleado " + ex.getMessage());
        }
    }
}

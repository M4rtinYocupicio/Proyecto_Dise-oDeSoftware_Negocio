/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfaces.*;
import Entities.Congreso;
import Entities.Profesor;
import Entities.Proyecto;
import Entities.Publicacion;
import Entities.Revista;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author marti
 */
public interface IFachadaBO 
{
    boolean agregarProyecto(Proyecto proyecto);
    List<Proyecto> consultarTodosProyectos();
    Proyecto consultarProyectos(ObjectId idProyecto);
    
    boolean agregarProfesores(Profesor profesor);
    List<Profesor> consultarTodosProfesores();
    Profesor consultarProfesores(ObjectId idProfesor);
    
    boolean agregarPublicaciones(Publicacion publicacion);
    
    boolean agregarRevistas(Revista revista);
    
    boolean agregarCongreso(Congreso congreso);
}

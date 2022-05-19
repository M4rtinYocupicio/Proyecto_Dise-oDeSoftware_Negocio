/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import Entities.Profesor;
import Entities.Proyecto;
import Entities.Publicacion;
import Entities.Revista;
import interfaces.IFachadaBO;
import interfaces.IProfesorBO;
import interfaces.IProyectoBO;
import interfaces.IPublicacionBO;
import interfaces.IRevistaBO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author marti
 */
public class FachadaBO implements IFachadaBO
{
    private IProyectoBO proyectoBO;
    private IProfesorBO profesorBO;
    private IPublicacionBO publicacionBO;
    private IRevistaBO revistaBO;

    public FachadaBO() 
    {
        this.proyectoBO = BOFactory.crearProyectoBO();
    }

    @Override
    public boolean agregarProyecto(Proyecto proyecto) 
    {
        return proyectoBO.agregar(proyecto);
    }

    @Override
    public List<Proyecto> consultarTodosProyectos() 
    {
        return proyectoBO.consultarTodos();
    }

    @Override
    public Proyecto consultarProyectos(ObjectId idProyecto) 
    {
        return proyectoBO.consultar(idProyecto);
    }

    @Override
    public boolean agregarProfesores(Profesor profesor) 
    {
        return profesorBO.agregar(profesor);
    }

    @Override
    public List<Profesor> consultarTodosProfesores()
    {
        return profesorBO.consultarTodos();
    }

    @Override
    public Profesor consultarProfesores(ObjectId idProfesor) 
    {
        return profesorBO.consultar(idProfesor);
    }

    @Override
    public boolean agregarPublicaciones(Publicacion publicacion) 
    {
        return publicacionBO.agregar(publicacion);
    }

    @Override
    public boolean agregarRevistas(Revista revista) 
    {
        return revistaBO.agregar(revista);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Entities.Proyecto;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author marti
 */
public interface IProyectoBO 
{
    boolean agregar(Proyecto proyecto);
    List<Proyecto> consultarTodos();
    Proyecto consultar(ObjectId idProyecto);
}

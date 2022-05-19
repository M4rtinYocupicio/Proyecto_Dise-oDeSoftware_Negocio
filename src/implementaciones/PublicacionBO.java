/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import DAOs.Persistencia;
import Entities.Publicacion;
import Interfaces.IPersistencia;
import interfaces.IPublicacionBO;

/**
 *
 * @author marti
 */
public class PublicacionBO implements IPublicacionBO
{
    IPersistencia persistencia = new Persistencia();
    
    @Override
    public boolean agregar(Publicacion publicacion) 
    {
        return persistencia.agregarPublicacion(publicacion);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import DAOs.Persistencia;
import Entities.Revista;
import Interfaces.IPersistencia;
import interfaces.IRevistaBO;

/**
 *
 * @author marti
 */
public class RevistaBO implements IRevistaBO
{
    IPersistencia persistencia = new Persistencia();
    
    @Override
    public boolean agregar(Revista revista) 
    {
        return persistencia.agregarRevista(revista);
    }
    
}

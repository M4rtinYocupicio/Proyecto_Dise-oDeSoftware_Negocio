/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import DAOs.Persistencia;
import Entities.Congreso;
import Interfaces.IPersistencia;
import interfaces.ICongresoBO;

/**
 *
 * @author marti
 */
public class CongresoBO implements ICongresoBO
{
    IPersistencia persistencia = new Persistencia();
    
    @Override
    public boolean agregar(Congreso congreso) 
    {
        return persistencia.agregar(congreso);
    }
    
}

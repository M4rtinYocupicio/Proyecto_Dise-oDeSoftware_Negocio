/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import interfaces.ICongresoBO;
import interfaces.IProfesorBO;
import interfaces.IProyectoBO;
import interfaces.IPublicacionBO;
import interfaces.IRevistaBO;

/**
 *
 * @author marti
 */
public class BOFactory 
{
    public static IProyectoBO crearProyectoBO()
    {
        return new ProyectoBO();
    }
    
    public static IProfesorBO crearProfesorBO()
    {
        return new ProfesorBO();
    }
    
    public static IPublicacionBO crearPublicacionBO()
    {
        return new PublicacionBO();
    }
    
    public static IRevistaBO crearRevistaBO()
    {
        return new RevistaBO();
    }
    
    public static ICongresoBO crearCongresoBO()
    {
        return new CongresoBO();
    }
}

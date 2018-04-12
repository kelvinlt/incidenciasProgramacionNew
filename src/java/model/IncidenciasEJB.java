package model;
import entities.Empleado;
import entities.Historial;
import entities.Incidencia;
import exception.ExceptionIncidencias;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@Stateless
public class IncidenciasEJB {
    @PersistenceUnit
    EntityManagerFactory emf;
    
    public void altaEmpleado(Empleado e) throws ExceptionIncidencias{
        EntityManager em = emf.createEntityManager();
        Empleado aux = em.find(Empleado.class, e.getNombreusuario());        
        if (aux != null) {
            em.close();
            throw new ExceptionIncidencias("Ya existe un empleado con ese nombre");
        }
        em.persist(em);
        em.close();
    }
    public void altaHistorial(Historial e) throws ExceptionIncidencias{
        EntityManager em = emf.createEntityManager();       
        em.persist(em);
        em.close();
    }
    public void altaIncidencia(Incidencia e) throws ExceptionIncidencias{
        EntityManager em = emf.createEntityManager();      
        em.persist(em);
        em.close();
    }
    public void validarEmpleado(Empleado e) throws ExceptionIncidencias{
        EntityManager em = emf.createEntityManager();
        Empleado aux1 = em.find(Empleado.class, e.getNombreusuario());   
        Empleado aux2 = em.find(Empleado.class, e.getPassword());   
        if(aux1 != null && aux2 !=null){
            em.close();
            throw new ExceptionIncidencias("El usuario existe");
        }
    }
    public void modificarPerfilEmpleado(Empleado e) throws ExceptionIncidencias{
        EntityManager em = emf.createEntityManager();
        Empleado aux1 = em.find(Empleado.class, e.getNombreusuario());
        
    }
    public void modificarPasswordEmpleado(Empleado e) throws ExceptionIncidencias{
    
    }
}

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
}
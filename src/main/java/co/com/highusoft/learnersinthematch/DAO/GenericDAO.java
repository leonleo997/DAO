package co.com.highusoft.learnersinthematch.DAO;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class GenericDAO<T> implements IGenericDAO<T>{

	@PersistenceContext( unitName="entitiesLearners" )
	private EntityManager entityManager;
	
	public void create(T entity) {
		entityManager.persist(entity);
	}

	public void delete(T entity) {
		entityManager.remove(entity);
	}

	public void update(T entity) {
		entityManager.merge(entity);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager em) {
		entityManager = em;
	}

	public List<T> findByProperties(T entity) {	
		String nombre=entity.getClass().getName();
		Field[] campos=entity.getClass().getFields();
		String jpql = "SELECT elemento FROM "+nombre+" elemento WHERE ";
		for (int i = 0; i < campos.length; i++) {
			if(i!=(campos.length-1))
				jpql+="elemento."+campos[i].getName()+"="+campos[i]+" AND ";
			else
				jpql+="elemento."+campos[i].getName()+"="+campos[i];			
		}
		
		return entityManager.createQuery(jpql).getResultList();
	}
}

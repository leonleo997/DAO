package co.com.highusoft.learnersinthematch.DAO;

import java.util.List;

import javax.ejb.Remote;
import javax.persistence.EntityManager;

@Remote
public interface IGenericDAO<T> {

	public void create(T entity);
	public void delete(T entity);
	public void update(T entity);
	public List<T> findByProperties(T entity);
	public EntityManager getEntityManager();
	public void setEntityManager(EntityManager em);
}

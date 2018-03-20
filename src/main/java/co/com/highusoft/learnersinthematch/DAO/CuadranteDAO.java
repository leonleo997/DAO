package co.com.highusoft.learnersinthematch.DAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

import co.com.highusoft.learnersinthematch.entities.Cuadrante;
import co.com.highusoft.learnersinthematch.entities.Tema;


@Stateless
public class CuadranteDAO implements ICuadranteDAO{

	@PersistenceUnit(unitName="entitiesLearners")
	private EntityManager em;
	
	
	@Override
	public void createCuadrante() {
		Cuadrante cu = new Cuadrante();
		cu.setIdCuadrante(10L);
		cu.setNombreCuadrante("prueba");
		Tema tema =new Tema();
		em.persist(cu);
	}


	@Override
	public String getName() {
		return "entraaa";
	}
	

}

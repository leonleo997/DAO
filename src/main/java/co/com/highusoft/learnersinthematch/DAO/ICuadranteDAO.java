package co.com.highusoft.learnersinthematch.DAO;

import javax.ejb.Remote;

@Remote
public interface ICuadranteDAO {
	public void createCuadrante();
	public String getName();
}

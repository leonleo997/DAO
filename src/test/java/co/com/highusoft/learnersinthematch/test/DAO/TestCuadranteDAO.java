package co.com.highusoft.learnersinthematch.test.DAO;

import static javax.naming.Context.INITIAL_CONTEXT_FACTORY;
import static javax.naming.Context.PROVIDER_URL;
import static javax.naming.Context.URL_PKG_PREFIXES;

import java.util.Hashtable;
import java.util.Properties;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Test;

import co.com.highusoft.learnersinthematch.DAO.ICuadranteDAO;

public class TestCuadranteDAO {

	@Test
	public void probando() throws NamingException {

		Hashtable<Object, Object> props = new Hashtable<>();
		props.put(URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

	    Context ctx = new InitialContext(props);
		ICuadranteDAO beanProxy = (ICuadranteDAO) ctx.lookup("ejb:EAREJB/DAO/CuadranteDAO!co.com.highusoft.learnersinthematch.DAO.ICuadranteDAO");
		if(beanProxy!=null)
			System.out.println(beanProxy.toString());
		System.out.println(beanProxy.getName());
	}
}

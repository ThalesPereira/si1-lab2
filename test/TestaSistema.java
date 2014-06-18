import static org.junit.Assert.*;

import org.junit.*;

import Model.*;


public class TestaSistema {
	
	private SistemaDeMetas sistema;
	private Meta m1, m2;
	
	@Before
	public void setUp(){
		sistema = new SistemaDeMetas();
		//m1 = new Meta("meta1","descriçao1",1,1);
		//m2 = new Meta("meta2","descriçao2",2,2);
		
	}
	@Test
	public void testaVazio(){
		assertTrue(sistema.Vazio());			
		
	}
	
	public void testaAdicionaMeta(){
		m1 = new Meta("meta1","descriçao1",1,1);
		sistema.adicionaMeta(m1);
		assertFalse(sistema.Vazio());	
	}
	
	public void testaRemoveMeta() throws MetaException{
		m1 = new Meta("meta1","descriçao1",1,1);
		sistema.adicionaMeta(m1);
		assertFalse(sistema.Vazio());
		sistema.removeMeta(m1);
		assertTrue(sistema.Vazio());	
		
	}
	
	
	
	
	

}

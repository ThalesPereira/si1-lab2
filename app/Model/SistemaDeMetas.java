package Model;


import java.util.ArrayList;

public class SistemaDeMetas {
	
	private ArrayList<Meta> lista;
	
	public SistemaDeMetas(){
		lista = new ArrayList<Meta>();
		
	}
	
	public void adicionaMeta(Meta m){
		lista.add(m);
	}
	
	public void removeMeta(Meta m) throws MetaException{
		if(!lista.contains(m))			
			throw new MetaException("Meta não Existe");
		else
			lista.remove(m);
		}
	
	public Meta pesquisaMeta(Meta m) throws MetaException{
		if(!lista.contains(m))			
			throw new MetaException("Meta não Existe");
		
		return m;		
			
		}
	
	
	public boolean Vazio(){
		return lista.isEmpty();
	}
	
	
			
		
		
	


}

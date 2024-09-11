package atividade;
 
public class Fila {

	    private static Fila instancia;

	    private Fila() {  
	    }
 
	    public static Fila getInstancia() {
	        if (instancia == null) {
	            
	            synchronized (Fila.class) {
	                if (instancia == null) {
	                    instancia = new Fila();
	                }
	            }
	        }
	        return instancia;
	    }
 
	    public void ImprimeDocumento(String documento) {
	    }
 
	    public void RemoveDocumentos() {  
	    }
	    
	    public void RemoveTodosDocumentos() {  
	    }
	}
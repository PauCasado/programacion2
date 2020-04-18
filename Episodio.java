package Series;

public class Episodio {
	String titulo;
	String descripcion;
	boolean visto;
	int calificacion=-1;
	
	public Episodio(){
		
	}
	
	public int getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(int calif){
		if((calif<=5)&&(calif>=1)){
			calificacion=calif;
		}
		else{
			System.out.println("Calificacion no valida");
		}
	}
	public boolean getVisto(){
		return visto;
	}
}

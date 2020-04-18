package Series;

public class Serie {
	Temporada [] temporadas;
	int cantidadTemp;
	String titulo;
	String descripcion;
	String creador;
	String genero;
	
	public Serie(int valor){
		temporadas = new Temporada[valor];
		cantidadTemp=0;
	}
	public int cantidadEpisodiosVistos(){
		int suma=0;
		for(int i=0;i<cantidadTemp;i++){
			suma+=temporadas[i].cantidadEpisodiosVistos();
		}
		return suma;
	}
	public int promedioCalificacion(){
		int suma=0;
		int prom=0;
		for(int i=0;i<cantidadTemp;i++){
			suma+=temporadas[i].promedioCalificacion();
		}
		prom=suma/cantidadTemp;
		return prom;
	}
	public boolean serieTerminada(){
		boolean completo=false;
		for(int i=0;i<cantidadTemp;i++){
			if(temporadas[i].temporadaTerminada()==true){
				completo=true;
			}
			else completo=false;
		}
		return completo;
	}
}

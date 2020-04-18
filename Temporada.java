package Series;

public class Temporada {
	Episodio [] episodios;
	int cantidadEpi;
	
	public Temporada(int valor){
		episodios = new Episodio[valor];
		cantidadEpi=0;
	}
	
	public void addEpisodios(Episodio epi){
		if(cantidadEpi<episodios.length){
			episodios[cantidadEpi]=epi;
			cantidadEpi++;
		}
	}
	public int cantidadEpisodiosVistos(){
		int suma=0;
		for(int i=0;i<cantidadEpi;i++){
			if(episodios[i].visto=true){
				suma++;
			}
		}
		return suma;
	}
	public int promedioCalificacion(){
		int suma=0;
		int prom=0;
		for(int i=0;i<cantidadEpi;i++){
			if(episodios[i].getVisto()==true){
				suma+=episodios[i].getCalificacion();
			}
		}
		prom=suma/cantidadEpi;
		return prom;
	}
	public boolean temporadaTerminada(){
		boolean completo=false;
		for(int i=0;i<cantidadEpi;i++){
			if(episodios[i].visto==true){
				completo=true;
			}
			else completo=false;
		}
		return completo;
	}
}

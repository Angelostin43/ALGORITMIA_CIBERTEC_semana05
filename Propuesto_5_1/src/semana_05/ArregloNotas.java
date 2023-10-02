package semana_05;

public class ArregloNotas {
	private int[] nota = {11, 10, 16, 18, 15, 13, 20, 12, 19, 17};
	
	public int tamanio() {
		return nota.length;
	}

	public int obtener(int i) {
		return nota[i];
	}
	
	public double notaPromedio() {
		int suma = 0;
		for(int i=0;i < tamanio();i++){
			suma += nota[i];
		}
		return suma/tamanio();
	}
	
	public int notaMayor(){
		int mayor = 0;
		for(int i=0;i < tamanio();i++){
			if(mayor < nota[i]){
				mayor = nota[i];
			}
		}
		return mayor;
	}
	
	public int notaMenor(){
	    int menor = nota[0];
	    for(int i=1; i < tamanio(); i++){
	        if(menor > nota[i]){ 
	            menor = nota[i];
	        }
	    }
	    return menor;
	}
	
	public int cantNotasAprobatorias(){
		int cant = 0;
		for(int i=1;i<tamanio();i++){
			if(nota[i]>=13){
				cant++;
			}
		}
		return cant;
	}
	
	public int cantNotasDesaprobatorias(){
	    int cant = 0;
	    for(int i=0;i<tamanio(); i++){
	        if(nota[i] < 13){
	            cant++;
	        }
	    }
	    return cant;
	}
	
	public int cantNotasMayoresA15(){
		int cant = 0;
		for(int i=1;i<tamanio();i++){
			if(nota[i]> 15){
				cant++;
			}
		}
		return cant;
	}
	
	public int posPrimeraNotaAprobatoria(){
		for(int i=0;i<tamanio();i++){
			if(nota[i]>=13){
				return i;
			}
		}
		return -1;
	}
	
	public int posPenultimaNotaDesaprobatoria(){
	    int cont = 0;
	    
	    for (int i=tamanio() - 1;i>=0;i--) {
	        if (nota[i]< 13) {
	        	cont++;
	            if (cont == 2) {
	            	return i; 
	            }
	        }
	    }
	    return -1;
	}
	
	public void generarNotas(){
		for(int i=0; i<tamanio();i++){
			nota[i] = aleatorio(0,20);
		}
	}
	
	private int aleatorio(int min, int max) {
		 return (int)((max - min + 1) * Math.random()) + min;
	}

}
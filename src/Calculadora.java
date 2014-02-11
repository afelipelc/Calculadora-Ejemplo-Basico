
public class Calculadora {
	public Calculadora(){
		
	}
	
	public int Sumar(int cantidad){
		//variable auxiliar
		int resultado=0;
		for(int i=1; i <= cantidad; i++){
			resultado = resultado + i;
		}
		return resultado;
	}
}

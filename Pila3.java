public class Pila3  <T>  {
	private T Esquina[];
	private int indice;
	//contructor
	
	public Pila3(int n){    
		Esquina = (T[])new Object[n];
		indice = 0;
	}
	public int cantidad(){
		return indice ;
	}
	
	public void apilar(T valor) throws DesbordamientoPila{ 
		if(this.llena()){
			throw new DesbordamientoPila();
		}
	Esquina[indice] = valor;
	indice++;
	}
	public T sacar() throws SubDesborPila{
	if(this.vacia()){
			throw new SubDesborPila();
	}
	T esacar;
	esacar = Esquina[indice-1];
	indice--;
		return esacar;
	}
	
	public boolean vacia(){
	if(indice == 0){
			return true;
	}
	return false;
	}
	public boolean llena(){
	if (indice == Esquina.length){
			return true;
		}
	return false;
	}
	public int capacidad(){
	return Esquina.length;
	}
	public void vaciarPila()throws SubDesborPila{
	while(!vacia()){
		sacar();
	}
    }
}

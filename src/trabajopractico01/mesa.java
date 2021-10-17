package trabajopractico01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class mesa {
	String tipo;
	persona presidente;
	Integer numerodemesa;
	static	Integer cantmesas=0;
	Map <Integer , ArrayList <turno>> turnosdisponibles= new HashMap <Integer,ArrayList <turno>>();;



public  void agregarpresidente (persona p) {
	this.presidente = p;
	
}




public String getTipo() {
	return tipo;
}




public void setTipo(String tipo) {
	this.tipo = tipo;
}




@Override
public int hashCode() {
	return Objects.hash(numerodemesa);
}




@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	mesa other = (mesa) obj;
	return Objects.equals(numerodemesa, other.numerodemesa);
}




public persona getPresidente() {
	return presidente;
}





@Override
public String toString() {
	return "mesa [presidente=" + presidente + ", numerodemesa=" + numerodemesa + "]";
}

public Integer getNumerodemesa() {
	return numerodemesa;
}


public void setNumerodemesa(Integer numerodemesa) {
	this.numerodemesa = numerodemesa;
}


public static Integer getCantmesas() {
	return cantmesas;
}


public static void setCantmesas(Integer cantmesas) {
	mesa.cantmesas = cantmesas;
}




	


}
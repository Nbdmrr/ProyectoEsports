package co.edu.unbosque.modelo;

import java.util.ArrayList;

public class Torneo {
	
	
	protected ArrayList<Jugador> Participantes;
	protected String tipo;
	protected String nombre;
	protected int limiteParticipantes;
	protected ArrayList< Jugador> eliminados;
	protected String Juego;
	protected int fase;
	
	
	 public Torneo(String nombre, int limiteParticipantes) {
		 
		 
		 
		
	}


	public ArrayList< Jugador> getEliminados() {
		return eliminados;
	}


	public void setEliminados(ArrayList< Jugador> eliminados) {
		this.eliminados = eliminados;
	}


	public int getLimiteParticipantes() {
		return limiteParticipantes;
	}


	public void setLimiteParticipantes(int limiteParticipantes) {
		this.limiteParticipantes = limiteParticipantes;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public ArrayList<Jugador> getParticipantes() {
		return Participantes;
	}


	public void setParticipantes(ArrayList<Jugador> participantes) {
		Participantes = participantes;
	}
	@Override
	
	public String toString() {
		
		
		return"Nombre del torneo: "+ nombre;
	}

}

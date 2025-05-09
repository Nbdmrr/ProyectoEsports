package co.edu.unbosque.modelo;

public class Jugador extends Usuario{
	
	
	private int partidasJugadas;
	private int torneosJugados;
	private int partidasGanadas;
	private int torneosGanados;
	private String especialidad;
	private int puntos;
	public Jugador(String usuario, String contraseña, String nacionalidad ,String correo, String especialidad) {
		super(usuario,contraseña,nacionalidad,correo);
		setEspecialidad(especialidad);
		
		setPartidasGanadas(0);
		setPartidasJugadas(0);
		setTorneosGanados(0);
		setTorneosJugados(0);
		tipo="Jugador";// TODO Auto-generated constructor stub
	}
	public void sumarPartidaGanada() {
		
		int ganada = 1 +getPartidasGanadas();
		setPartidasGanadas(ganada);
	
	}
public void sumarPartidaJugada() {
		
		int ganada = 1 +getPartidasJugadas();
		setPartidasJugadas(ganada);
	
	}
public void sumarTorneoGanado() {
	
	int ganada = 1 +getTorneosGanados();
	setTorneosGanados(ganada);

}
public void sumarTorneoJugado() {
	
	int ganada = 1 +getTorneosJugados();
	setTorneosJugados(ganada);

}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getTorneosGanados() {
		return torneosGanados;
	}

	public void setTorneosGanados(int torneosGanados) {
		this.torneosGanados = torneosGanados;
	}

	public int getPartidasGanadas() {
		return partidasGanadas;
	}

	public void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}

	public int getTorneosJugados() {
		return torneosJugados;
	}

	public void setTorneosJugados(int torneosJugados) {
		this.torneosJugados = torneosJugados;
	}

	public int getPartidasJugadas() {
		return partidasJugadas;
	}

	public void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}

}

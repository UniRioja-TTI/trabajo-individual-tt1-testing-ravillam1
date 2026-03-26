package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;

import org.springframework.stereotype.Service;


@Service
public class EjemploContactoSimService implements InterfazContactoSim {

	private List<DatosSolicitud> historialSolicitudes = new ArrayList<>();
	@Override
	public int solicitarSimulation(DatosSolicitud sol) {
		historialSolicitudes.add(sol);
		return new Random().nextInt(1000);
	}

	@Override
	public DatosSimulation descargarDatos(int ticket) {
		return new DatosSimulation();
	}

	@Override
	public List<Entidad> getEntities() {
		List<Entidad> entidades = new ArrayList<>();
        
        Entidad e1 = new Entidad();
        e1.setId(1);
        e1.setName("Servidor Web o algo");
        Entidad e2 = new Entidad();
        e2.setId(2);
        e2.setName("Base de Datos o algo");
        Entidad e3 = new Entidad();
        e3.setId(3);
        e3.setName("Cosa o algo");
        
        entidades.add(e1);
        entidades.add(e2);
        entidades.add(e3);
        
        return entidades;
	}

	@Override
	public boolean isValidEntityId() {
		return true;
	}

}

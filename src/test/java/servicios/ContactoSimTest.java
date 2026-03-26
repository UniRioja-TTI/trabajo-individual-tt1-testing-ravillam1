package servicios;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

import modelo.DatosSolicitud;
import modelo.Entidad;

class ContactoSimTest {

	@Test
    public void testGetEntities() {
        EjemploContactoSimService service = new EjemploContactoSimService();
        List<Entidad> entidades = service.getEntities();
        assertNotNull(entidades);
        assertFalse(entidades.isEmpty());
    }

    @Test
    public void testSolicitarSimulation() {
    	EjemploContactoSimService service = new EjemploContactoSimService();
        DatosSolicitud solicitud = new DatosSolicitud(new HashMap<>());
        int token = service.solicitarSimulation(solicitud);
        assertTrue(token >= 0);
    }

    @Test
    public void testIsValidEntityId() {
        EjemploContactoSimService service = new EjemploContactoSimService();
        assertTrue(service.isValidEntityId());
    }

}

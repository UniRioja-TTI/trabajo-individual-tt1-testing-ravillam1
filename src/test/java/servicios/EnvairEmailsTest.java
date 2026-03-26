package servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import modelo.Destinatario;

class EnvairEmailsTest {

	@Test
    public void testEnviarEmail() {
        Logger dummyLogger = LoggerFactory.getLogger("EnviarEmailLogger");
        EjemploEnviarEmailsService service = new EjemploEnviarEmailsService(dummyLogger);
        Destinatario destinatario = new Destinatario();
        boolean resultado = service.enviarEmail(destinatario, "test@ejemplo.com");
        assertTrue(resultado);
    }

}

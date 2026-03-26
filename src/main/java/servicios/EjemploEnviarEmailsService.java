package servicios;

import interfaces.InterfazEnviarEmails;
import modelo.Destinatario;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;


@Service
public class EjemploEnviarEmailsService implements InterfazEnviarEmails {

	private final Logger logger;
	public EjemploEnviarEmailsService(Logger simulationLogger) {
        this.logger = simulationLogger;
    }
	@Override
	public boolean enviarEmail(Destinatario dest, String email) {
		// TODO Auto-generated method stub
		logger.info("Simulando envío de correo electrónico a: " + email);
        return true;
	}

}

package za.co.banelegumata.logintelligence.log_intelligence_tool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@SpringBootApplication
public class LogIntelligenceToolApplication {

    private static final Logger log = LogManager.getLogger(LogIntelligenceToolApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LogIntelligenceToolApplication.class, args);

        log.info("Log Intelligence Tool Started");
	}

}
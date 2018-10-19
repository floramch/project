package eureka.example.eureakserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EureakServerApplication {
    private static final Logger logger = LoggerFactory.getLogger(EureakServerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(EureakServerApplication.class, args);
        logger.info("项目启动成功");
    }
}

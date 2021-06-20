package br.com.leoneoliveira.SpringBootStudy.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "file")
public class FileStorageConfig {

    private  String uploadDir;
}

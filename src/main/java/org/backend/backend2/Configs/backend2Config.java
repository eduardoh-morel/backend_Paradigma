package org.backend.backend2.Configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "backend2-service")
public class backend2Config {
    private String Greeting;

    private String defaultname;

    public String getDefaultname() {
        return defaultname;
    }

    public void setDefaultname(String defaultname) {
        this.defaultname = defaultname;
    }

    public String getGreeting() {
        return Greeting;
    }

    public void setGreeting(String greeting) {
        this.Greeting = greeting;
    }
}

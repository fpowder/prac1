package com.example.prac1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.ldap.LdapAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.servlet.OAuth2ClientAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.session.config.annotation.web.server.SpringWebSessionConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class,
        DataSourceAutoConfiguration.class,
        RabbitAutoConfiguration.class,
        LdapAutoConfiguration.class,
        OAuth2ClientAutoConfiguration.class,

})
public class Prac1Application {

    public static void main(String[] args) {
        SpringApplication.run(Prac1Application.class, args);
    }

}

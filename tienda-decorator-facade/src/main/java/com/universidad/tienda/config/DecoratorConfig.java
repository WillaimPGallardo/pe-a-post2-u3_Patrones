package com.universidad.tienda.config;

import com.universidad.tienda.decorator.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class DecoratorConfig {

    @Bean("ordenCompleto")
    public OrdenServicio ordenServicioCompleto(
            @Qualifier("ordenBase") OrdenServicio base) {

        return new AuditoriaDecorator(
                new ValidacionDecorator(
                        new LoggingDecorator(base)
                )
        );
    }
}
package com.universidad.tienda;

import com.universidad.tienda.decorator.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    private OrdenServicio build() {
        return new AuditoriaDecorator(
                new ValidacionDecorator(
                        new LoggingDecorator(
                                new OrdenServicioBase()
                        )
                )
        );
    }

    @Test
    void testOrdenValida() {
        assertTrue(build().procesarOrden("ORD-1", 10000).contains("PROCESADA"));
    }

    @Test
    void testErrorMonto() {
        assertThrows(IllegalArgumentException.class,
                () -> build().procesarOrden("ORD-2", 0));
    }
}
package com.universidad.tienda.decorator;

public class ValidacionDecorator extends OrdenServicioDecorator {

    public ValidacionDecorator(OrdenServicio wrapped) {
        super(wrapped);
    }

    @Override
    public String procesarOrden(String ordenId, double monto) {

        if (ordenId == null || ordenId.isBlank()) {
            throw new IllegalArgumentException("ID inválido");
        }

        if (monto < 1000 || monto > 50000000) {
            throw new IllegalArgumentException("Monto fuera de rango");
        }

        System.out.println("[VALIDACION] OK");

        return wrapped.procesarOrden(ordenId, monto);
    }
}
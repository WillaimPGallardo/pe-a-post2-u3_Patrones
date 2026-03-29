package com.universidad.tienda.facade;

import org.springframework.stereotype.Service;

@Service
public class NotificacionFacade {

    private final EmailService email;
    private final SMSService sms;
    private final PushService push;

    public NotificacionFacade(EmailService email, SMSService sms, PushService push) {
        this.email = email;
        this.sms = sms;
        this.push = push;
    }

    public void notificarCompraExitosa(String correo, String telefono, String token, String ordenId) {

        String msg = "Orden " + ordenId + " procesada";

        email.enviar(correo, "Confirmación", msg);
        sms.enviar(telefono, msg);
        push.enviar(token, "OK", msg);
    }
}
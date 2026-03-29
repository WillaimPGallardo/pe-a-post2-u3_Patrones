

Implementar los patrones de diseño **Decorator** y **Facade** en un proyecto Spring Boot que simula un sistema de procesamiento de órdenes con capas adicionales (logging, validación, auditoría) y un subsistema de notificaciones multicanal.


Patrón Decorator

El patrón **Decorator** permite agregar funcionalidades a un objeto de manera dinámica sin modificar su estructura base.

Estructura Implementada


Componentes

* `OrdenServicio` → Interfaz base
* `OrdenServicioBase` → Implementación base
* `OrdenServicioDecorator` → Clase abstracta
* `LoggingDecorator` → Agrega logs
* `ValidacionDecorator` → Valida datos de entrada
* `AuditoriaDecorator` → Registra auditoría

---

Patrón Facade

El patrón **Facade** simplifica el acceso a un subsistema complejo mediante una interfaz unificada.

Subsistema

* `EmailService`
* `SMSService`
* `PushService`

Fachada

* `NotificacionFacade`



 Pruebas Unitarias

Se implementaron pruebas con **JUnit 5** para validar:

* ✔ Procesamiento correcto de órdenes
* ✔ Validación de datos inválidos
* ✔ Independencia de decoradores
* ✔ Manejo de excepciones

Ejecutar tests

```bash
mvn test
```

Evidencias
<img width="1907" height="1007" alt="image" src="https://github.com/user-attachments/assets/ef6839ec-20cd-4e91-bfef-d140f4e8f2c5" />

Se incluyen capturas de:

* Ejecución de los tests
* Logs del sistema mostrando el uso de decoradores
* Salida de consola

 Conclusiones

* El patrón **Decorator** permite extender funcionalidades de forma flexible.
* El patrón **Facade** simplifica la interacción con sistemas complejos.
* Se evidencia el uso de principios **SOLID** y buenas prácticas de diseño.


# Ticketing App para Eventos

## Descripción

Ticketing App es una aplicación desarrollada en **Spring Boot** para gestionar tickets de eventos de manera eficiente y segura. Permite a los usuarios registrarse, pagar sus tickets a través de un servicio externo y recibir un **código QR único** para ingresar al evento. La aplicación asegura un control del flujo de pagos y la verificación de tickets al momento del ingreso.

Este proyecto fue diseñado para ayudar a **organizadores y asistentes de eventos**, simplificando la creación, pago y control de tickets, reduciendo errores y optimizando la experiencia de usuario.

---

## Funcionalidades Principales

1. **Formulario de registro:** El usuario completa sus datos (nombre, email, DNI, etc.) y se crea un ticket pendiente de pago.
2. **Pago de ticket:** Redirección a un servicio externo de pago (MercadoPago, PayPal, etc.).
3. **Confirmación de pago:** El backend recibe la confirmación vía webhook y actualiza el estado del ticket a `pagado`.
4. **Generación de código QR:** Se genera un código QR único asociado al ticket y se envía al usuario por email.
5. **Uso del ticket:** Al ingresar al evento, el QR es validado y marcado como usado.

---

## Tecnologías

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Validation
- Lombook
- MySQL
- Librerías QR `zxing`
- Servicio de pago externo (MercadoPago, PayPal, etc.)

---

## Cómo ayuda a los usuarios

- Simplifica la compra de tickets sin necesidad de registro físico.
- Garantiza la seguridad del evento con QR único y control de acceso.
- Automatiza la verificación de pagos y envío de tickets por correo.
- Ideal para eventos pequeños y medianos, optimizando la logística.

---

## Instalación

1. Clonar el repositorio:
```
git clone https://github.com/tu-usuario/ticketing-app.git
```
2. Configurar bases de datos en **application.properties**:
```
spring.datasource.url=jdbc:mysql://localhost:3306/ticketing
spring.datasource.username=root
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
```
3. Ejecutar aplicación:
```
./mvnw spring-boot:run
```

### Contacto / LinkedIn

**LinkedIn**: [/in/yamil-daza/](https://www.linkedin.com/in/yamil-daza/)

**CV / Portafolio**: [link](https://drive.google.com/drive/home)
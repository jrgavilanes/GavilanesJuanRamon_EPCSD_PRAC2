# Notas de ejecución

Para levantar la infraestructura necesaria y los servicios desarrollados, 
debe ejecutar el siguiente comando desde esta carpeta

```bash

docker-compose up --build

```

La primera vez que se ejecuten, se creará un contenedor para cada servicio compilando el código fuente.

Podrá atacar los servicios mendiante las dos colecciones de endpoints con Postman u otro cliente REST.

Los servicios incluyen datos de demostración para facilitar las comprobaciones.

Podrá ver un video de ejecución desde la siguiente dirección: https://drive.google.com/file/d/1Fy11QL9435tA60_C4_ZvTo3hXfErn0S9/view?usp=share_link

---

Como indica el enunciado, los swagger de los servicios están en estas urls:

http://localhost:18081/swagger-ui/index.html#/product-controller/createProduct

http://localhost:18082/swagger-ui/index.html


# MS-TEST-CLF-PRICES-BACKEND

Servicio que valida informaci&oacute;n de los precis a prodcutos.
* Autor: Carlos Luna Fernandez
* Version Doc: 1.0

## Swagger
Consumo de documentaci&oacute;n del servicio en los siguientes contextos:
* http://localhost:8081/swagger-ui/index.html
* http://localhost:8081/v3/api-docs

# Como ejecutar el servicio
Para ejecutar el servisio puede hacerse de dos maneras
1 - Abrirl el proyecto en un ide por ejemplo STS y presionar el boton Run
2 - ejecutar el siguiente comando: mvn spring-boot:run

# Como ejecutar el servicio desde el postman
Importar la coleccion PostMan adjunta por correo

    - /api/prices 
      http://localhost:8081/api/prices
      API POST para insertar un precio asociado al prodcuto con el body :
      {
        "prodcutId": 2,
        "amount": 9173.13,
        "curency": "USD"
      }
      El seervicio regresa el ID insertado.

    - /api/prices/{productId}
      http://localhost:8081/api/prices/1
      API GET para consultar el repcio del prodcuto
      el servicio regresa el presio asociado al prodcuto

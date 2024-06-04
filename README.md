# WEBAPI
Las actualizaciones en este repositorio reflejan los cambios hechos al API de libros para satisfacer los requisitos mencionados.

-En el caso de que el libro no esté presente, se generará una excepción llamada LibroException al intentar acceder al recurso GET /libros/{id_libro}, con el envío de un estado NOT_FOUND junto a un mensaje adaptado a la situación.

# GlobalException

![image](https://github.com/iamjackson7/WEBAPI/assets/99736392/a41d2fec-ce42-46be-ae7e-0b44f565a7a7)

# LibroException

![image](https://github.com/iamjackson7/WEBAPI/assets/99736392/96ac6dbd-37cf-4ad6-a4d2-f95bc4ee9cb4)

-Al añadir un nuevo libro, se enviará el estado CREATE como confirmación de la acción realizada.

# LibroController

![image](https://github.com/iamjackson7/WEBAPI/assets/99736392/42b68184-a1fd-4eec-9151-8658b71f17ef)

-Cambios implementados y testeando los extremos con Postman, es una práctica común en el desarrollo de software asegurar que las modificaciones realizadas funcionen correctamente probándolas a través de herramientas como Postman.

# Manejo de situaciones excepcionales cuando no se encuentran libros.

Ahora, cuando se trata de acceder a un libro inexistente, se activa una excepción llamada LibroException. Esta excepción se atrapa y se responde con el código de estado NOT_FOUND, junto con un mensaje adaptado a la situación.

Utilizando Get: http://localhost:8085/Libros

![image](https://github.com/iamjackson7/WEBAPI/assets/99736392/d78fd4be-325d-4f38-a6b0-1fb28180861f)

-La ausencia de un libro con un identificador específico implica que no debería mostrarse. 

![image](https://github.com/iamjackson7/WEBAPI/assets/99736392/e338eb62-f72f-4b0c-8f6d-421e7e392498)

-Al añadir un libro nuevo, se devuelve el estado de CREACIÓN junto con la respuesta correspondiente.

![image](https://github.com/iamjackson7/WEBAPI/assets/99736392/118109bf-9b14-43a2-a2e9-0472f81cffd6)

Eso seria todo ingeniero, Gracias.

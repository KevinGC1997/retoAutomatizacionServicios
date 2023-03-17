#language: es
Característica: Agregar Mascotas

  Escenario: Envio de mascota exitoso
    Cuando david envia la siguiente informacion de mascota al servicio "https://petstore.swagger.io/v2/pet"
      | idMascotas | idCategoria | nameCategoria | nombreMascota | photoUrlMascota | idTags | nombreTags | statusMascota |
      | 560        | 0           | ave           | comeRocas     | string          | 0      | string     | available     |
    Entonces valida que el codigo de status sea 200

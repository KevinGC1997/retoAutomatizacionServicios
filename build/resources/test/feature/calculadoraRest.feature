#language: es
Característica: calculadora Rest

  Escenario: Envio de suma exitosa
    Cuando Kevin envia la siguiente operacion al servicio "http://api.mathjs.org/v4/"
      | expr      | 7+9 |
      | precision | 3   |
    Entonces valida que el codigo de status sea 200
    Y valida que el contenido de la llave "result" sea "16"
    Y valida que el conteindo de la llave "error" sea null
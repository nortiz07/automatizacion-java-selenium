# language: es

  Característica: Inicio de sesión
    Yo como analista de negocio necesito iniciar sesion
    en el sitio web con mis credenciales de acceso.

  @InicioSesionExitoso
  Escenario: Iniciar sesion exitosamente
    Dado que el usuario navega a la pagina de inicio de sesion
    Cuando ingresa las credenciales de ingreso correctas
    Entonces debería ver la pagina principal
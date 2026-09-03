Lab03 - REGISTRO DE PRODUCTO

Piero Alexander Coronado Quispe

Descripcion: Aplicación desarrollada con Kotlin y Jetpack Compose 
para registrar productos mediante un formulario. Permite ingresar:
- Nombre del producto
- Precio
- Cantidad
Y al presionar AGREGAR PRODUCTO se muestra una Card con los datos ingresados y el importe calculado.
![Screenshot_20260902-205233.png](../../../../AppData/Local/Packages/Microsoft.YourPhone_8wekyb3d8bbwe/TempState/medias/Screenshot_20260902-205233.png)
![Screenshot_20260902-205223.png](../../../../AppData/Local/Packages/Microsoft.YourPhone_8wekyb3d8bbwe/TempState/medias/Screenshot_20260902-205223.png)
  ¿Qué pasaría si declaras las variables de los campos SIN remember?
- Sin remember, el estado de las variables no se conservaria correctamente.
Durante las recomposiciones de Compose. Por eso, el contenido ingresado podria perderse cuando
se vuelva a componer.
Lab03 - REGISTRO DE PRODUCTO

Piero Alexander Coronado Quispe

Descripcion: Aplicación desarrollada con Kotlin y Jetpack Compose 
para registrar productos mediante un formulario. Permite ingresar:
- Nombre del producto
- Precio
- Cantidad
Y al presionar AGREGAR PRODUCTO se muestra una Card con los datos ingresados y el importe calculado.
<img width="263" height="556" alt="image" src="https://github.com/user-attachments/assets/00fb9d7a-31f2-4907-951a-c5998d4f42d5" />
<img width="267" height="570" alt="image" src="https://github.com/user-attachments/assets/45428371-55cb-4cd5-ad0c-95103894e121" />

  ¿Qué pasaría si declaras las variables de los campos SIN remember?
- Sin remember, el estado de las variables no se conservaria correctamente.
Durante las recomposiciones de Compose. Por eso, el contenido ingresado podria perderse cuando
se vuelva a componer.

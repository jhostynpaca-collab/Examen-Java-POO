# Sistema de Registro de Personajes - Java POO

## Descripción
Este proyecto corresponde al examen final del **Bootcamp Programación Cero a POO | Tercera Edición**.  
El sistema permite registrar personajes de una academia de videojuegos, almacenarlos en una colección y realizar operaciones básicas como mostrar y buscar por identificador.  

Se aplican los principios de **Programación Orientada a Objetos (POO)**:  
- Encapsulamiento  
- Herencia  
- Polimorfismo  
- Manejo básico de errores con `try-catch`

---

## Estructura de clases
- **Personaje.java**  
  - Clase padre con atributos privados: `id`, `nombre`, `nivel`.  
  - Métodos: constructor, getters, `mostrarInfo()`, `realizarAccion()`.  

- **Guerrero.java**  
  - Subclase que hereda de `Personaje`.  
  - Sobrescribe `realizarAccion()` → `"El Guerrero ataca con su espada."`

- **Mago.java**  
  - Subclase que hereda de `Personaje`.  
  - Sobrescribe `realizarAccion()` → `"El Mago lanza un hechizo."`

- **Main.java**  
  - Contiene el menú interactivo con `Scanner`.  
  - Usa `ArrayList<Personaje>` para almacenar objetos.  
  - Funciones: registrar, mostrar, buscar por id, salir.  
  - Validaciones y manejo de errores básicos.

---

## Funcionalidades
1. **Registrar personaje**  
   - Elegir tipo: Guerrero o Mago.  
   - Ingresar id, nombre y nivel.  
   - Validaciones: id > 0, nombre no vacío, nivel entre 1 y 100.  

2. **Mostrar personajes**  
   - Recorre la colección y muestra información + acción.  
   - Si la lista está vacía, muestra un mensaje claro.  

3. **Buscar personaje por id**  
   - Búsqueda secuencial.  
   - Si existe, muestra información y acción.  
   - Si no existe, muestra `"Personaje no encontrado"`.  

4. **Salir**  
   - Termina el programa.

---

## Tecnologías
- Lenguaje: **Java**  
- Colección: **ArrayList**  
- Entrada: **Scanner**  
- Manejo de errores: **try-catch**

---

## Casos de prueba mínimos
- Lista vacía → mensaje claro.  
- Registro válido (ej. Guerrero id=1, Ana, nivel=10).  
- Registro válido (ej. Mago id=2, Luis, nivel=20).  
- Datos inválidos (id=0, nivel=-1, texto en lugar de número).  
- Búsqueda exitosa (id=2).  
- Búsqueda fallida (id=99).  

---

## Entrega en GitHub
El repositorio debe contener:  
- `Personaje.java`  
- `Guerrero.java`  
- `Mago.java`  
- `Main.java`  

Con al menos dos commits:  
- `feat: crear jerarquía de personajes`  
- `feat: implementar colección, menú y validaciones`

---

## Criterios de evaluación
- Clase padre y modelado   
- Encapsulamiento 
- Herencia y super()   
- Sobrescritura y polimorfismo   
- Colección   
- Funcionalidad   
- Validaciones y try-catch   
- Organización y entrega 
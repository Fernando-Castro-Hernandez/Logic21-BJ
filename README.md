# ♠️ 21Logic - Blackjack Strategy Automator

> **Nota:** Este proyecto fue uno de mis primeros proyectos personales cuando inicié en el mundo de Java, representa mis primeros pasos en la lógica de programación y en la programacion estructurada, estructuras de control y la traducción de reglas del mundo real a código.

## Descripción del Proyecto

**21Logic** es una herramienta de consola diseñada para ayudar a los jugadores de Blackjack a tomar la decisión estadísticamente más favorable (La "Estrategia Básica") basándose en sus cartas y la carta visible del Dealer.

La idea nació al observar la complejidad de memorizar las tablas de estrategia de *Blackjack Apprenticeship*. El objetivo principal fue automatizar este proceso, permitiendo al usuario ingresar sus datos y recibir una instrucción inmediata (Pedir, Plantarse, Doblar o Dividir) para maximizar sus probabilidades de éxito.

##  Funcionalidades

El programa analiza la mano del jugador a través de la entrada por consola y soporta los tres tipos de manos posibles en el juego:

* **Hard Totals (Manos Duras):** Sumas sin Ases o donde el As vale 1.
* **Soft Totals (Manos Suaves):** Manos que contienen un As contado como 11.
* **Splits (Pares):** Escenarios donde el jugador tiene dos cartas del mismo valor y puede dividir.

El sistema evalúa las cartas contra la carta del Dealer e imprime la acción recomendada:
* `HIT` (Pedir)
* `STAND` (Plantarse)
* `DOUBLE` (Doblar)
* `SPLIT` (Dividir)

## 🛠️ Tecnologías y Lógica

* **Lenguaje:** Java (JDK)
* **Entrada de datos:** Clase `Scanner`
* **Lógica de Negocio:** El "cerebro" del programa utiliza una estructura extensa de condicionales anidados (`if-else if`) para mapear con precisión cada celda de la tabla de estrategia básica.

## 📋 Cómo Ejecutarlo

1.  Asegúrate de tener Java instalado.
2.  Clona este repositorio o descarga el archivo `Logic21.java`.
3.  Compila el código:
    ```bash
    javac Logic21.java
    ```
4.  Ejecuta el programa:
    ```bash
    java Logic21
    ```
5.  Sigue las instrucciones en consola:
    * Escribe `HARD`, `SOFT` o `SPLIT` según tu mano.
    * Ingresa los valores de tus cartas y la del dealer cuando se te pida.

##  Reflexión y Futuras Mejoras

Al ser uno de mis primeros acercamientos al desarrollo de software, este código se centró en la funcionalidad bruta y la lógica condicional directa. Hoy en día, como estudiante de desarrollo de software, identifico varias áreas de mejora para una versión 2.0 (Refactorización):

* **POO:** Implementar clases como `Carta`, `Mano` y `Dealer` para un diseño Orientado a Objetos.
* **Estructuras de Datos:** Reemplazar los `if-else` anidados por `HashMaps` o matrices de búsqueda para optimizar la complejidad ciclomática.
* [cite_start]**Ciclos:** Implementar un bucle `do-while` para permitir jugar múltiples manos sin reiniciar el programa.

##  Autores

* **Jesús Fernando Castro Hernandez** 
* **Mateo Emanuel Martín Tec**
* # Referencias
 ```
https://www.youtube.com/watch?v=jnvGIxgtXMQ
  ```
*  

---
*Este proyecto fue desarrollado como parte de una iniciativa académica y de autoaprendizaje en octubre del 2025.*

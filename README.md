# Estudiante:
Gabriela González Peirano
# Curso:
Desarrollo Orientado a Objetos I
# Fecha:
13/06/2026

# LlanquihueTourApp

# ¿Qué hace el proyecto?
El proyecto diseñado para la agencia Llanquihue Tour, es un programa que busca solucionar el problema planteado
en relación a la desorganización en la base de datos de los tours ofrecidos por esta agencia.

# ¿Por qué el proyecto es útil?
El proyecto es de utilidad para la empresa debido a que permite almacenar información de forma ordenada e incluso
separada a través de los filtros que facilitan el procesamiento de información.

## Descripción del Programa
# Estructura
El programa de LLanquihueTour está compuesto por 

📁 resources/
├── tours.txt/
📁 src/
├── ui/     # Clase principal con el método main.
├── model/  # Clase Tour.
├── data/   # Clase GestorDatos.

# Ejecución
El programa se ejecuta desde el package ui en la clase main. Antes de iniciar se importan las bibliotecas necesarias y 
las clases a utilizar durante el desarrollo del programa.
Al comenzar se utiliza un bloque de código que declara los nuevos tours a ingresar con sus datos respectivos, distribuidos
en función del formato en la clase Tour.
Se declara la ruta del archivo de texto para que, a través del ArrayList podamos crear, guardar y cargar la lista de tours.
Antes de mostrar la información final, se pasa por dos filtros para separa la información según su tipo de tour.



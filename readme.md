# Sistema de Registro de Votantes - Pruebas Unitarias con TDD

Proyecto desarrollado como parte del taller de **Pruebas Unitarias y Verificación de Software**, aplicando la metodología **Test-Driven Development (TDD)**, pruebas automatizadas con **JUnit 4** y análisis de cobertura mediante **JaCoCo**.

---

# Descripción

El sistema permite registrar ciudadanos para un proceso de votación, validando reglas de negocio relacionadas con:

* Edad mínima para votar.
* Estado de vida de la persona.
* Prevención de registros duplicados.
* Validación de identificadores únicos.

La implementación fue desarrollada siguiendo ciclos iterativos de TDD:

1. Red
2. Green
3. Refactor

---

# Tecnologías Utilizadas

* Java
* Maven
* JUnit 4
* JaCoCo
* Git
* GitHub

---

# Estructura del Proyecto

```text
pruebasunitarias/
│
├── .gitignore
├── defectos.md
├── pom.xml
│
├── src
│   ├── main
│   │   ├── jacoco.jpg
│   │   ├── jacoco-pending.jpg
│   │   └── java
│   │       └── edu/unisabana/tyvs
│   │           ├── domain
│   │           │   ├── model
│   │           │   └── service
│   │           └── tdd
│   │
│   └── test
│       └── java
│           └── edu/unisabana/tyvs
│               ├── domain
│               └── tdd
│
└── target
```

---

# Modelo de Dominio

## Person

Representa una persona dentro del sistema.

**Archivo**


[Person.java](https://github.com/sergioing1000/pruebasunitarias/blob/main/src/main/java/edu/unisabana/tyvs/domain/model/Person.java)

Atributos principales:

* name
* id
* age
* gender
* alive

---

## Gender

Enumeración para representar el género de una persona.

**Archivo**

[Gender.java](https://github.com/sergioing1000/pruebasunitarias/blob/main/src/main/java/edu/unisabana/tyvs/domain/model/Gender.java)

---

## RegisterResult

Enumeración que representa el resultado de un intento de registro.

Valores posibles:

```java
VALID
DUPLICATED
INVALID
```

**Archivo**

[RegisterResult.java](https://github.com/sergioing1000/pruebasunitarias/blob/main/src/main/java/edu/unisabana/tyvs/domain/model/RegisterResult.java)

---

# Servicio de Registro

## Registry

Implementa las reglas de negocio del sistema.

**Archivo**

[Registry.java](https://github.com/sergioing1000/pruebasunitarias/blob/main/src/main/java/edu/unisabana/tyvs/domain/service/Registry.java)

Funciones principales:

* Registrar votantes.
* Detectar registros duplicados.
* Validar restricciones de elegibilidad.

---

# Pruebas Unitarias

Las pruebas fueron desarrolladas siguiendo la metodología TDD.

**Archivo**

[RegistryTest.java](https://github.com/sergioing1000/pruebasunitarias/blob/main/src/test/java/edu/unisabana/tyvs/domain/service/RegistryTest.java)

Casos cubiertos:

* Registro válido.
* Registro duplicado.
* Persona menor de edad.
* Persona fallecida.
* Casos límite.
* Cobertura de ramas (branches).

---

# Gestión de Defectos

El proyecto incluye un registro de defectos identificados durante el desarrollo.

**Archivo**

[defectos.md](https://github.com/sergioing1000/pruebasunitarias/blob/main/defectos.md)

Ejemplo:

```text
Defecto 01
Caso: edad -1
Esperado: INVALID
Obtenido: VALID
Causa probable: falta de validación de límites
Estado: Abierto
```

---

# Desarrollo Guiado por Pruebas (TDD)

## Iteración 1 – Registro válido

### Red

Se crea una prueba para registrar correctamente una persona elegible.

### Green

Se implementa la lógica mínima para aprobar la prueba.

### Refactor

Se mejora la organización interna del código.

---

## Iteración 2 – Duplicados

### Red

Se crea una prueba para detectar identificadores repetidos.

### Green

Se implementa la colección de IDs registrados.

### Refactor

Se optimiza la validación de duplicados.

---

## Iteración 3 – Casos inválidos

### Red

Se crean pruebas para personas no elegibles.

### Green

Se implementan las validaciones correspondientes.

### Refactor

Se simplifican las reglas de negocio.

---

# Cobertura de Código

La cobertura se genera mediante JaCoCo.

Ejecutar:

```bash
mvn clean verify
```

Reporte generado en:

```text
target/site/jacoco/index.html
```

Evidencias incluidas:

* src/main/jacoco.jpg
* src/main/jacoco-pending.jpg

---

# Comandos Maven

Compilar:

```bash
mvn compile
```

Ejecutar pruebas:

```bash
mvn test
```

Generar cobertura:

```bash
mvn verify
```

Limpiar proyecto:

```bash
mvn clean
```

---

# Configuración Maven

Archivo principal:

[pom.xml](https://github.com/sergioing1000/pruebasunitarias/blob/main/pom.xml)

Incluye:

* JUnit 4
* Maven Surefire Plugin
* JaCoCo Maven Plugin

---

# Autor

**Sergio Cruz**

Proyecto académico desarrollado para el curso de Pruebas Unitarias y Verificación de Software.

---

# Repositorio

[REPO](https://github.com/sergioing1000/pruebasunitarias)

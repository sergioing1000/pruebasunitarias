# Registro de Defectos

## Defecto 01

* **Caso:** Edad = -1
* **Esperado:** `INVALID_AGE`
* **Obtenido:** `VALID`
* **Causa probable:** Falta de validación de límites para la edad.
* **Estado:** Cerrado: ⭐

---

## Defecto 02

* **Caso:** Persona duplicada (mismo ID)
* **Esperado:** `DUPLICATED`
* **Obtenido:** `VALID`
* **Causa probable:** No se verifica si el ID ya existe en el registro.
* **Estado:** Cerrado: ⭐

---

## Defecto 03

* **Caso:** Persona fallecida intenta registrarse
* **Esperado:** `DEAD`
* **Obtenido:** `VALID`
* **Causa probable:** Falta validación del atributo `alive`.
* **Estado:** Cerrado: ⭐

---

## Defecto 04

* **Caso:** Menor de edad (17 años)
* **Esperado:** `UNDERAGE`
* **Obtenido:** `VALID`
* **Causa probable:** No se valida la edad mínima para votar.
* **Estado:** Cerrado: ⭐

---

## Convenciones de Estado

* **Abierto:** \
    ‼️El defecto ha sido identificado pero no corregido.
* **En progreso:** \
    🔧 Se está trabajando en la corrección.
* **Corregido:** \
    ⌨️ El código fue modificado.
* **Verificado:** \
    ✔️ La prueba confirma que el defecto ya no ocurre.
* **Cerrado:** \
    ⭐El defecto fue solucionado y validado definitivamente.

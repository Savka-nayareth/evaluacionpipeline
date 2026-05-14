# Evaluación Parcial N°2 - Ingeniería DevOps

## Nombre del proyecto
Microservicio Evaluacion Pipeline

## Integrantes
- Integrante 1:
- Integrante 2:

## Descripción general
Este proyecto corresponde a la Evaluación Parcial N°2 de Ingeniería DevOps.  
El objetivo principal es automatizar el ciclo de vida de un microservicio mediante un pipeline CI/CD funcional configurado con GitHub Actions.

El microservicio fue desarrollado con Spring Boot y expone endpoints REST para consultar productos y validar el estado operativo de la aplicación.

## Tecnologías utilizadas
- Java 17
- Spring Boot
- Maven
- JUnit
- Docker
- Docker Compose
- Nginx
- GitHub Actions
- Dependabot
- Trivy

## Endpoints principales
| Método | Endpoint | Descripción |
|---|---|---|
| GET | `/api/productos` | Lista productos disponibles |
| GET | `/api/productos/{id}` | Busca producto por ID |
| GET | `/api/productos/estado` | Muestra el estado funcional del servicio |
| GET | `/actuator/health` | Muestra el estado técnico del microservicio |

## Ejecución local del microservicio
Para ejecutar las pruebas automatizadas:
```bash
./mvnw clean test
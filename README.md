# Research Assistant Backend (Spring Boot + Gemini API)

A minimal Spring Boot backend that takes some text + an operation (`summarize` or `suggest`) and calls Google’s Gemini API to return an AI-generated response.

It exposes a single REST endpoint that your frontend (or Postman/curl) can call.

---

## Tech Stack

- Java (project sets `java.version=21`, works fine on newer JDKs too)
- Spring Boot 4
- Spring WebMVC (Tomcat) + Spring WebFlux client (`WebClient`)
- Maven (includes `mvnw` / `mvnw.cmd`)
- Lombok (optional)

---

## Features

- **Summarize**: concise summary of provided text
- **Suggest**: related topics + further reading suggestions
- Simple JSON request → plain text response

---

## API

### `POST /api/research/process`

**Request body**
```json
{
  "content": "Your text here...",
  "operation": "summarize"
}

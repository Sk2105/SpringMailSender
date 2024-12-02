# Spring Boot Mail Sender

Send Mail on email by using spring boot project

## How to use

1. Download the project
2. Run the project
3. Go to http://localhost:8080/mail


### Post request

```bash
Post http://localhost:8080/mail
```

- body

```json
{
    "to": "xyz@example.com",
    "subject": "Spring Mail Sender",
    "text": "Hello there!"
}
```


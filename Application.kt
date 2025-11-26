package com.example.mds

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Medical Digital Service (MDS)
 * Базовый медицинский микросервис.
 * Назначение:
 *  - обеспечить стандартизованный REST-интерфейс
 *  - использовать строгий мед.стиль логирования и ответов
 *  - быть частью общей Cloud Native инфраструктуры
 */
@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

/**
 * HealthController — обязательный компонент.
 * Медицинский аналог "оценки жизнеспособности" сервиса (Vital Signs).
 * Возвращает статус микросервиса.
 */
@RestController
class HealthController {

    @GetMapping("/health")
    fun health(): Map<String, String> = mapOf(
        "status" to "stable",
        "service" to "MDS Core",
        "description" to "Medical microservice baseline"
    )
}

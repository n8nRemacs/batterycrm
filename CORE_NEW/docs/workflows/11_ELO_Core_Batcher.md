# ELO_Core_Batcher

> Батчинг и дебаунс сообщений

---

## Общая информация

| Параметр | Значение |
|----------|----------|
| **Название** | ELO_Core_Batcher |
| **Триггер** | Execute Workflow Trigger |
| **Вызывается из** | ELO_Queue_Processor (Execute Workflow) |
| **Вызывает** | ELO_Core_Dialog_Engine (Execute Workflow) |
| **Выход** | Вызов ELO_Core_Dialog_Engine с объединённым сообщением |

---

## Назначение

Реализует debounce паттерн: когда пользователь отправляет несколько сообщений подряд, ждёт паузу (batch_timeout), объединяет их в одно, и передаёт дальше. Это предотвращает множественные ответы AI на быстрые последовательные сообщения.

---

## Входные данные

**Источник:** Execute Workflow от ELO_Queue_Processor

```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Первое сообщение",
  "timestamp": "2024-12-10T10:30:00Z",
  "tenant_id": "a1b2c3d4-...",
  "tenant_settings": {
    "batch_timeout_sec": 10
  },
  "batch_messages": [
    {"text": "Первое сообщение", "timestamp": "..."},
    {"text": "Второе сообщение", "timestamp": "..."}
  ],
  "batch_count": 2
}
```

---

## Ноды workflow

### 1. Execute Workflow Trigger

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.executeWorkflowTrigger |
| **Input Source** | passthrough |

**Принимает:** Данные от ELO_Queue_Processor

**Логика:** Точка входа при вызове из другого workflow

**Передаёт:** Входные данные без изменений

---

### 2. Prepare Keys

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Входные данные

**Логика:** Генерирует Redis ключи для этого чата

**Передаёт:**
```json
{
  "batch_key": "elo:telegram:tg_123456789",
  "queue_key": "queue:elo:telegram:tg_123456789",
  "last_seen_key": "last_seen:elo:telegram:tg_123456789",
  "lock_key": "lock:elo:telegram:tg_123456789",
  "now_iso": "2024-12-10T10:30:00Z",
  "batch_timeout_sec": 10,
  "batch_timeout_ms": 10000,
  "message": {...}
}
```

---

### 3. Push to Queue

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | push |
| **List** | `{{ queue_key }}` |
| **Tail** | true (RPUSH) |

**Принимает:** message (сериализованный JSON)

**Логика:** Добавляет сообщение в batch queue этого чата

**Передаёт:** Результат операции

---

### 4. Update Last Seen

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | set |
| **Key** | `{{ last_seen_key }}` |
| **Value** | `{{ now_iso }}` |
| **TTL** | 600 секунд |

**Принимает:** now_iso

**Логика:** Обновляет timestamp последней активности

**Передаёт:** Результат операции

---

### 5. Get Lock

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | get |
| **Key** | `{{ lock_key }}` |

**Принимает:** lock_key

**Логика:** Проверяет есть ли активный debounce процесс

**Передаёт:**
```json
{
  "value": null  // или "busy"
}
```

---

### 6. Lock Exists?

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.if |
| **Условие** | `$json.value` is empty |

**Принимает:** Значение lock

**Логика:**
- Если lock пустой — это первое сообщение в батче, нужно начать debounce
- Если lock есть — debounce уже идёт, просто добавили в очередь

**Передаёт:**
- **TRUE (нет lock)** → Acquire Lock
- **FALSE (есть lock)** → Workflow завершается (сообщение добавлено в очередь)

---

### 7. Acquire Lock (TTL 300s)

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | set |
| **Key** | `{{ lock_key }}` |
| **Value** | `busy` |
| **TTL** | 300 секунд |

**Принимает:** lock_key

**Логика:** Устанавливает lock на 5 минут (защита от зависших процессов)

**Передаёт:** Результат операции

---

### 8. Wait Batch Timeout

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.wait |
| **Amount** | `{{ batch_timeout_sec }}` |
| **Unit** | seconds |

**Принимает:** batch_timeout_sec (из tenant_settings)

**Логика:** Ждёт указанное время (обычно 10 секунд)

**Передаёт:** — (просто ждёт)

---

### 9. Get Last Seen

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | get |
| **Key** | `{{ last_seen_key }}` |

**Принимает:** last_seen_key

**Логика:** Получает timestamp последней активности

**Передаёт:**
```json
{
  "value": "2024-12-10T10:30:05Z"
}
```

---

### 10. Quiet >= Timeout?

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** last_seen timestamp

**Логика:** Сравнивает (now - last_seen) с batch_timeout

**Передаёт:**
```json
{
  "quiet": true,  // или false
  "last_seen": "2024-12-10T10:30:05Z",
  "elapsed_ms": 12000
}
```

---

### 11. Silence Reached?

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.if |
| **Условие** | `$json.quiet === true` |

**Принимает:** Результат проверки тишины

**Логика:**
- Если тишина достигла timeout — пора обрабатывать батч
- Если ещё есть активность — ждать снова

**Передаёт:**
- **TRUE** → Pop All Queue
- **FALSE** → Wait Batch Timeout (цикл)

---

### 12. Pop All Queue

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | pop (или LRANGE + DELETE) |
| **List** | `{{ queue_key }}` |

**Принимает:** queue_key

**Логика:** Извлекает все сообщения из batch queue

**Передаёт:** Массив сообщений

---

### 13. Normalize Messages

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Сырые данные из Redis

**Логика:** Парсит JSON, нормализует массив

**Передаёт:**
```json
{
  "messages": [msg1, msg2, msg3],
  "count": 3
}
```

---

### 14. Empty?

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.if |
| **Условие** | `$json.count < 1` |

**Принимает:** count сообщений

**Логика:** Проверяет есть ли сообщения для обработки

**Передаёт:**
- **TRUE** → Release Lock (Empty) — ложное срабатывание
- **FALSE** → Delete Queue

---

### 15. Delete Queue

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | delete |
| **Key** | `{{ queue_key }}` |

**Принимает:** queue_key

**Логика:** Удаляет batch queue (сообщения уже извлечены)

**Передаёт:** Результат операции

---

### 16. Combine Messages

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Массив сообщений

**Логика:**
1. Сортирует по timestamp
2. Извлекает тексты (включая транскрипции голосовых)
3. Объединяет через `\n\n`
4. Формирует выходной объект с метаданными

**Передаёт:**
```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Первое сообщение\n\nВторое сообщение\n\n[Голосовое]: транскрипция",
  "tenant_id": "uuid-...",
  "tenant_settings": {...},
  "meta": {
    "batched": true,
    "batch_size": 3,
    "batch_timeout_sec": 10,
    "original_messages": [
      {"timestamp": "...", "type": "text", "text_length": 20},
      {"timestamp": "...", "type": "voice", "text_length": 50}
    ],
    "combined_at": "2024-12-10T10:30:15Z"
  }
}
```

---

### 17. Release Lock

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | delete |
| **Key** | `{{ lock_key }}` |

**Принимает:** lock_key

**Логика:** Освобождает lock после обработки

**Передаёт:** Результат операции

---

### 18. Skip Empty?

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.if |
| **Условие** | `$json.error === "empty_batch"` |

**Принимает:** Результат Combine

**Логика:** Проверяет не пустой ли батч

**Передаёт:**
- **TRUE** → Exit (пустой батч)
- **FALSE** → Prepare Output

---

### 19. Prepare Output

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Объединённое сообщение

**Логика:** Финальная подготовка данных для Dialog Engine

**Передаёт:** Готовый ELO Core Contract

---

### 20. Execute Dialog Engine

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.executeWorkflow |
| **Workflow ID** | ID ELO_Core_Dialog_Engine |

**Принимает:** Объединённое сообщение

**Логика:** Синхронно вызывает ELO_Core_Dialog_Engine

**Передаёт:** Результат выполнения Dialog Engine

---

## Выходные данные

**Куда:** Execute Workflow в ELO_Core_Dialog_Engine

**Формат:**
```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Объединённый текст всех сообщений",
  "tenant_id": "uuid-...",
  "tenant_name": "Название",
  "tenant_settings": {
    "batch_timeout_sec": 10,
    "ai_mode": "assist"
  },
  "client_name": "Иван",
  "client_username": "ivan",
  "meta": {
    "batched": true,
    "batch_size": 3,
    "combined_at": "2024-12-10T10:30:15Z",
    "provider": "mcp-telegram"
  }
}
```

---

## Redis Keys

| Ключ | Тип | TTL | Назначение |
|------|-----|-----|------------|
| `queue:elo:{channel}:{chat_id}` | List | — | Batch queue для чата |
| `lock:elo:{channel}:{chat_id}` | String | 300s | Lock debounce процесса |
| `last_seen:elo:{channel}:{chat_id}` | String | 600s | Timestamp последней активности |

---

## Алгоритм debounce

```
1. Сообщение приходит
2. Push в batch queue
3. Update last_seen
4. Если lock нет:
   a. Acquire lock
   b. Wait batch_timeout
   c. Check (now - last_seen) >= timeout?
      - Да → Pop all, Combine, Send to Dialog Engine
      - Нет → Wait снова (цикл)
5. Если lock есть:
   - Exit (сообщение добавлено в очередь, debounce уже идёт)
```

---

## Зависимости

| Тип | Название | Назначение |
|-----|----------|------------|
| Credentials | Redis account | Для работы с batch queue и locks |
| Workflow | ELO_Core_Dialog_Engine | Вызывается после объединения |

---

## Ошибки и обработка

| Ошибка | Причина | Обработка |
|--------|---------|-----------|
| Redis недоступен | Сетевая ошибка | Workflow fail |
| Wait timeout exceeded | n8n внутренняя ошибка | Сообщения потеряны |
| Empty batch | Race condition | Skip, release lock |

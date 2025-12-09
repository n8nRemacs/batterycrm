# Отладка: Telegram → AI не работает

**Дата начала:** 2025-12-06
**Статус:** РЕШЕНО (2025-12-07)

---

## Симптом

Сообщения из Telegram доходят до n8n, но AI не отвечает клиенту.

## Корневая причина

**BAT Batch Debouncer** использовал операцию `GET` для чтения очереди `queue:batch:*`, но данные записаны через PUSH как **list** тип.

- GET работает только для string типа → возвращает NULL для list
- Debouncer считал batch пустым и удалял очередь с данными

---

## Решение

### 1. Добавить ноду "Pop Batch Job"

Между Schedule Trigger и Init Debouncer:

| Параметр | Значение |
|----------|----------|
| Type | Redis |
| Operation | pop |
| List | `queue:debounce:pending` |
| Property Name | `value` |

### 2. Исправить "Init Debouncer"

```javascript
// Получаем данные о батче из входа
const raw = $input.first().json;
const input = raw.value || raw;

return {
  batch_key: input.batch_key,
  channel: input.channel,
  external_chat_id: input.external_chat_id,
  queue_key: input.queue_key || `queue:batch:${input.batch_key}`,
  lock_key: input.lock_key || `lock:batch:${input.batch_key}`,
  last_seen_key: input.last_seen_key || `last_seen:${input.batch_key}`,
  debounce_seconds: 20,
  max_wait_seconds: 300,
  start_time: new Date().toISOString()
};
```

### 3. Заменить "Get Batch Queue" на 10 параллельных POP

Убрать ноду с GET, добавить:
- "Prepare Pop" — передаёт `queue_key`
- "Pop Message 1-10" — Redis POP операции
- Все POP ноды → "Combine Messages"

| Параметр | Значение |
|----------|----------|
| Operation | pop |
| List | `={{ $json.queue_key }}` или `={{ $('Prepare Pop').item.json.queue_key }}` |
| Property Name | `value` |

### 4. Убрать "Delete Queue"

POP уже удаляет элементы. Отдельный DELETE не нужен.

---

## Проверка Redis

```bash
# Все ключи
ssh root@45.144.177.128 'docker exec redis redis-cli --no-auth-warning -a Mi31415926pSss! KEYS "*"'

# Длина очереди
ssh root@45.144.177.128 'docker exec redis redis-cli --no-auth-warning -a Mi31415926pSss! LLEN "queue:batch:telegram:tg_1132511247"'

# Содержимое очереди
ssh root@45.144.177.128 'docker exec redis redis-cli --no-auth-warning -a Mi31415926pSss! LRANGE "queue:batch:telegram:tg_1132511247" 0 -1'
```

---

## Redis Insight

http://185.221.214.83:5540

---

## Результат

После исправления:
- Сообщения читаются из `queue:batch:*` через POP
- Батч собирается корректно
- Данные передаются в Client Resolver
- Очередь очищается автоматически

---

## Связанные файлы

- `n8n_workflows/TaskWork/BAT_Batch_Debouncer.json`
- `workflows_to_import/modified/BAT_Batch_Debouncer_FIXED.json`

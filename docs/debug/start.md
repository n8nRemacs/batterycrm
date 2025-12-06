# Отладка: Telegram → AI не работает

**Дата начала:** 2025-12-06
**Статус:** Найдена проблема, нужно исправить

---

## Симптом

Сообщения из Telegram доходят до n8n, но AI не отвечает клиенту.

## Что проверили

### 1. MCP серверы — ОК
- mcp-telegram (Finnish server :8767) — работает
- Webhook получает сообщения — ОК
- Отправляет в n8n — ОК

### 2. BAT IN Telegram — ОК
- Получает webhook
- Push to queue:incoming — работает
- Сообщение попадает в Redis queue:incoming

### 3. BAT Queue Processor — ПРОБЛЕМА ЗДЕСЬ
- Pop from queue:incoming — ОК (данные получены)
- Acquire Batch Lock — ОК
- Prepare New Batch — ОК (JSON корректный)
- **Push New Batch Messages — НЕ ЗАПИСЫВАЕТ!** ❌
- Set Last Seen — ОК
- Trigger Debouncer — вызывается

### 4. BAT Batch Debouncer
- Get Batch Queue — получает NULL (данных нет в Redis)
- Считает что batch пустой
- Удаляет "пустую" очередь

### 5. Redis
- SET работает (`last_seen:*` ключи есть)
- GET работает
- POP работает
- **PUSH не работает** (ключей `queue:batch:*` нет)

---

## Корневая причина

n8n Redis node operation `push` с динамическим `messageData`:
```javascript
"messageData": "={{ $json.messages_json.join('|||SEPARATOR|||') }}"
```

**Не выполняет реальную запись в Redis.** Output ноды = Input (данные проходят насквозь без записи).

---

## Решение

Заменить PUSH на SET с JSON-сериализацией.

**См. `stop.md` для деталей реализации.**

---

## Тестирование после исправления

1. Отправить сообщение в Telegram бот
2. Проверить Redis:
   ```bash
   ssh root@45.144.177.128 'docker exec redis redis-cli -a "Mi31415926pSss!" KEYS "queue:batch:*"'
   ```
3. Должен появиться ключ `queue:batch:telegram:tg_XXXXX`
4. Через 20 секунд (debounce) AI должен ответить

---

## Связанные файлы

- `n8n_workflows/Core/BAT Queue Processor.json`
- `n8n_workflows/TaskWork/BAT_Batch_Debouncer.json`
- `docs/debug/stop.md` — детали решения

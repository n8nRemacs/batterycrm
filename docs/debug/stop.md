# Отладка: Redis PUSH не работает в n8n

**Дата:** 2025-12-06
**Статус:** В процессе

---

## Проблема

Сообщения из Telegram не обрабатываются AI. Цепочка прерывается на этапе записи в batch queue.

## Диагностика

### Цепочка обработки:
```
BAT IN Telegram
    → Push to queue:incoming ✓ (работает)

BAT Queue Processor
    → Pop from queue:incoming ✓ (работает)
    → Push New Batch Messages ❌ (НЕ ЗАПИСЫВАЕТ!)
    → Trigger Debouncer

BAT Batch Debouncer
    → Get Batch Queue → получает null
    → "Batch Empty" = true → удаляет "пустую" очередь
```

### Доказательства:

1. **Redis KEYS показывает:**
   - `last_seen:telegram:*` — есть (SET работает)
   - `queue:batch:*` — НЕТ (PUSH не работает)
   - `lock:batch:*` — НЕТ

2. **Нода "Push New Batch Messages":**
   - INPUT = OUTPUT (одинаковые данные)
   - Это значит PUSH не выполнился, данные просто прошли насквозь

3. **JSON данные корректные:**
   ```json
   {
     "queue_key": "queue:batch:telegram:tg_1132511247",
     "messages_json": ["{\"channel\":\"telegram\",...}"],
     "message_count": 1
   }
   ```

## Причина

n8n Redis node operation `push` с динамическим `messageData` из expression не работает:
```javascript
"messageData": "={{ $json.messages_json.join('|||SEPARATOR|||') }}"
```

При этом:
- POP работает
- SET работает
- GET работает
- **PUSH — не работает** (баг n8n или проблема с форматом данных)

---

## Решение

### Вариант 1: Заменить PUSH на SET

**BAT Queue Processor:**
- "Prepare New Batch" — сериализовать массив: `messages_serialized: JSON.stringify(messages)`
- "Push New Batch Messages" → "Set Batch Messages": operation=set, value=messages_serialized

**BAT Batch Debouncer:**
- "Get Batch Queue" — оставить GET (теперь будет работать)
- "Combine Messages" — JSON.parse входных данных

### Вариант 2: Проверить PUSH с простыми данными

Создать тестовый workflow:
1. Code node: `return { data: "test" }`
2. Redis PUSH: list="test_queue", messageData="simple_string"
3. Проверить записалось ли

Если простой PUSH работает — проблема в длинной JSON строке.

---

## Файлы для изменения

### BAT Queue Processor (Core/BAT Queue Processor.json)

**Нода "Prepare New Batch":**
```javascript
const item = $('Prepare Batch Decision').first().json;
return {
  queue_key: item.queue_key,
  lock_key: item.lock_key,
  last_seen_key: item.last_seen_key,
  batch_key: item.batch_key,
  channel: item.channel,
  external_chat_id: item.external_chat_id,
  // ИЗМЕНЕНИЕ: сериализуем весь массив для SET
  messages_serialized: JSON.stringify(item.messages),
  message_count: item.message_count,
  action: 'new_batch_started'
};
```

**Нода "Push New Batch Messages" → "Set Batch Messages":**
```json
{
  "operation": "set",
  "key": "={{ $json.queue_key }}",
  "value": "={{ $json.messages_serialized }}"
}
```

То же самое для:
- "Prepare Queue Push"
- "Push to Batch Queue"

### BAT Batch Debouncer (TaskWork/BAT_Batch_Debouncer.json)

**Нода "Get Batch Queue"** — оставить как есть (GET)

**Нода "Combine Messages":**
```javascript
const queueData = $json.value;
const initData = $('Check Silence Duration').first().json;

let messages = [];

if (queueData) {
  try {
    // Десериализуем массив
    const parsed = JSON.parse(queueData);
    if (Array.isArray(parsed)) {
      messages = parsed;
    }
  } catch (e) {
    console.error('Failed to parse queue data:', e);
  }
}

// ... остальной код без изменений
```

---

## Статус исправлений

- [ ] Создать исправленный BAT Queue Processor
- [ ] Создать исправленный BAT Batch Debouncer
- [ ] Импортировать в n8n
- [ ] Протестировать

---

## Redis credentials в n8n

ID: `7FQcEivUY94atW24`
Name: "Redis account"

**Нужно проверить:** Host, Port, Password в n8n UI

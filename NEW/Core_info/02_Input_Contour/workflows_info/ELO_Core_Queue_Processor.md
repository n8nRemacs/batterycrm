# ELO_Core_Queue_Processor

> Забирает сообщения из общей очереди, группирует по chat_id, запускает Debouncer

---

## Общая информация

| Параметр | Значение |
|----------|----------|
| **ID** | — (Schedule Trigger) |
| **Файл** | `NEW/workflows/n8n_old/Core/ELO_Core_Queue_Processor.json` |
| **Триггер** | Schedule Trigger (каждые 5 сек) |
| **Выход** | Trigger ELO_Core_Batch_Debouncer |

---

## Назначение

1. Забирает сообщения из `queue:incoming`
2. Группирует по `batch_key` (channel:chat_id)
3. Для каждого чата:
   - Если уже обрабатывается → добавляет в очередь батча
   - Если новый → создаёт lock и запускает Debouncer

---

## Redis ключи

| Ключ | Операция | Назначение |
|------|----------|------------|
| `queue:processor:lock` | GET/SET/DELETE | Mutex процессора (только один экземпляр) |
| `queue:incoming` | LPOP ×10 | Глобальная входящая очередь |
| `lock:batch:{batch_key}` | GET/SET | Lock на обработку конкретного чата |
| `queue:batch:{batch_key}` | RPUSH | Per-chat очередь сообщений |
| `last_seen:{batch_key}` | SET | Timestamp последнего сообщения |

---

## Ноды

### 1. Every 5 Seconds

| Параметр | Значение |
|----------|----------|
| **ID** | `129fe377-4cfd-43d1-84ba-08a6c85fcae2` |
| **Тип** | scheduleTrigger |
| **Интервал** | 5 секунд |

---

### 2. Check Processor Lock

| Параметр | Значение |
|----------|----------|
| **Тип** | Redis GET |
| **Key** | `queue:processor:lock` |

Проверяем: не работает ли уже другой экземпляр?

---

### 3. Is Processor Free?

| Условие | Результат |
|---------|-----------|
| `value` is empty | → Acquire Lock |
| `value` exists | → Stop (уже обрабатывается) |

---

### 4. Acquire Processor Lock

| Параметр | Значение |
|----------|----------|
| **Тип** | Redis SET |
| **Key** | `queue:processor:lock` |
| **Value** | `"processing"` |
| **TTL** | 30s (expire: true) |

---

### 5-14. Pop Message 1-10

10 параллельных Redis LPOP из `queue:incoming`.

**Почему 10?** n8n Redis node не поддерживает LRANGE, поэтому делаем 10 POP.

```javascript
// Каждая нода:
{
  operation: "pop",
  list: "queue:incoming",
  propertyName: "value"
}
```

---

### 15. Collect and Group Messages

**Код:**
```javascript
const allItems = $input.all();
const messages = [];

for (const item of allItems) {
  const val = item.json?.value;
  if (val && val !== null && val !== 'null' && val !== '') {
    try {
      const parsed = typeof val === 'string' ? JSON.parse(val) : val;
      messages.push(parsed);
    } catch (e) {
      console.error('Failed to parse message:', val, e);
    }
  }
}

if (messages.length === 0) {
  return { empty: true, count: 0 };
}

// Группируем по batch_key (channel:external_chat_id)
const groups = {};
for (const msg of messages) {
  const batchKey = `${msg.channel}:${msg.external_chat_id}`;
  if (!groups[batchKey]) {
    groups[batchKey] = [];
  }
  groups[batchKey].push(msg);
}

return {
  empty: false,
  count: messages.length,
  groups: groups,
  group_keys: Object.keys(groups)
};
```

**batch_key формат:** `{channel}:{external_chat_id}`
- `telegram:tg_123456`
- `whatsapp:79991234567`
- `avito:avito_user_789`

---

### 16. Is Queue Empty?

| Условие | Результат |
|---------|-----------|
| `empty === true` | → Release Lock (Empty) |
| `empty === false` | → Split to Batch Items |

---

### 17. Split to Batch Items

```javascript
const groups = $json.groups;
const groupKeys = $json.group_keys;

const items = groupKeys.map(key => {
  const messages = groups[key];
  const [channel, ...chatParts] = key.split(':');
  const chatId = chatParts.join(':');

  return {
    json: {
      batch_key: key,
      channel: channel,
      external_chat_id: chatId,
      messages: messages,
      message_count: messages.length,
      queue_key: `queue:batch:${key}`,
      lock_key: `lock:batch:${key}`,
      last_seen_key: `last_seen:${key}`
    }
  };
});

return items;
```

---

### 18. Loop Over Batches

Split in Batches — обрабатываем каждый чат по очереди.

---

### 19. Check Batch Lock

| Параметр | Значение |
|----------|----------|
| **Тип** | Redis GET |
| **Key** | `lock:batch:{batch_key}` |

---

### 20. Prepare Batch Decision

```javascript
const item = $('Loop Over Batches').first().json;
const lockValue = $json.value;

// Если lock существует - добавляем в per-chat очередь
// Если нет - создаём lock и запускаем дебаунс
const hasLock = lockValue && lockValue !== '' && lockValue !== null;

return {
  ...item,
  has_lock: hasLock,
  lock_value: lockValue
};
```

---

### 21. Has Batch Lock?

| Условие | Результат |
|---------|-----------|
| `has_lock === true` | → Push to existing batch queue |
| `has_lock === false` | → Create new batch |

---

### Ветка: Lock существует (добавляем в очередь)

**22. Prepare Queue Push**
```javascript
const item = $json;
const messagesToPush = item.messages.map(m => JSON.stringify(m));

return {
  queue_key: item.queue_key,
  messages_json: messagesToPush,
  batch_key: item.batch_key,
  action: 'queued_to_existing'
};
```

**23. Push to Batch Queue**
- Redis RPUSH to `queue:batch:{batch_key}`
- Separator: `|||SEPARATOR|||`

**24. Update Last Seen (Existing)**
- Redis SET `last_seen:{batch_key}` = ISO timestamp

---

### Ветка: Lock НЕ существует (новый батч)

**25. Acquire Batch Lock**
| Параметр | Значение |
|----------|----------|
| **Key** | `lock:batch:{batch_key}` |
| **Value** | `"processing"` |
| **TTL** | 300s |

**26. Prepare New Batch**
```javascript
const item = $('Prepare Batch Decision').first().json;
const messagesToPush = item.messages.map(m => JSON.stringify(m));

return {
  queue_key: item.queue_key,
  lock_key: item.lock_key,
  last_seen_key: item.last_seen_key,
  batch_key: item.batch_key,
  channel: item.channel,
  external_chat_id: item.external_chat_id,
  messages_json: messagesToPush,
  message_count: item.message_count,
  action: 'new_batch_started'
};
```

**27. Push New Batch Messages**
- Redis RPUSH to `queue:batch:{batch_key}`

**28. Set Last Seen (New)**
- Redis SET `last_seen:{batch_key}` = ISO timestamp

**29. Trigger Debouncer**
| Параметр | Значение |
|----------|----------|
| **Тип** | Execute Workflow |
| **ID** | `hwYfaLAKCwaWpoQk` |
| **Wait** | false (async!) |

---

### 30. Release Processor Lock

| Параметр | Значение |
|----------|----------|
| **Тип** | Redis DELETE |
| **Key** | `queue:processor:lock` |

---

## Схема потока

```
Every 5s → Check Lock → Free? ─NO→ Stop
                          │
                         YES
                          ↓
              Acquire Lock → POP ×10 → Collect & Group
                                             │
                                       Is Empty?
                                        ├── YES → Release Lock
                                        └── NO → Split to Items
                                                      ↓
                                              Loop Over Batches
                                                      ↓
                                              Check Batch Lock
                                                      ↓
                                              Has Lock?
                                        ├── YES → Push to Queue → Update Last Seen → Loop
                                        └── NO → Acquire Lock → Push → Set Last Seen
                                                                              ↓
                                                                   Trigger Debouncer (async)
                                                                              ↓
                                                                           Loop
                                                                              ↓
                                                                     Release Processor Lock
```

---

## Почему такая архитектура?

1. **Processor Lock** — только один Queue Processor работает (избегаем дублей)
2. **Batch Lock** — только один Debouncer на чат (TTL 300s — защита от зависания)
3. **10 POP** — n8n не поддерживает LRANGE, workaround
4. **Async Debouncer** — не ждём, сразу идём к следующему батчу

---

## Зависимости

| Тип | ID | Назначение |
|-----|-----|------------|
| Redis | 7FQcEivUY94atW24 | Очереди и locks |
| Workflow | hwYfaLAKCwaWpoQk | ELO_Core_Batch_Debouncer |

# ELO_Queue_Processor

> Процессор входящей очереди

---

## Общая информация

| Параметр | Значение |
|----------|----------|
| **Название** | ELO_Queue_Processor |
| **Триггер** | Schedule (каждые 5 секунд) |
| **Вызывается из** | n8n (по расписанию) |
| **Вызывает** | ELO_Core_Batcher (Execute Workflow) |
| **Выход** | Вызов ELO_Core_Batcher с данными |

---

## Назначение

Читает входящую очередь `queue:incoming`, группирует сообщения по chat_id, резолвит tenant для каждой группы, и вызывает ELO_Core_Batcher для каждого батча.

---

## Входные данные

**Источник:** Redis list `queue:incoming`

**Формат элемента очереди:**
```json
{
  "channel": "telegram",
  "bot_token": "123456:ABC...",
  "external_chat_id": "tg_123456789",
  "text": "Сообщение",
  "timestamp": "2024-12-10T10:30:00Z",
  "client_name": "Иван",
  "meta": {...}
}
```

---

## Ноды workflow

### 1. Every 5 Seconds

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.scheduleTrigger |
| **Interval** | 5 секунд |

**Принимает:** — (запускается по расписанию)

**Логика:** Срабатывает каждые 5 секунд

**Передаёт:** Пустой trigger event

---

### 2. Check Processor Lock

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | get |
| **Key** | `elo:processor:lock` |

**Принимает:** —

**Логика:** Проверяет есть ли активный lock (другой экземпляр обрабатывает)

**Передаёт:**
```json
{
  "value": null  // или "busy"
}
```

---

### 3. Is Processor Free?

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.if |
| **Условие** | `$json.value` is empty |

**Принимает:** Значение lock

**Логика:** Если lock пустой — процессор свободен

**Передаёт:**
- **TRUE** → Acquire Lock
- **FALSE** → Exit (ничего не делать)

---

### 4. Acquire Lock

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | set |
| **Key** | `elo:processor:lock` |
| **Value** | `busy` |
| **TTL** | 60 секунд |

**Принимает:** —

**Логика:** Устанавливает lock с TTL 60s (защита от зависших процессов)

**Передаёт:** Результат SET

---

### 5. Pop Message 1-5 (параллельно)

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | pop |
| **List** | `queue:incoming` |
| **Tail** | false (LPOP) |

**Принимает:** —

**Логика:** Извлекает до 5 сообщений из очереди (параллельно)

**Передаёт:**
```json
{
  "value": "{...json string...}"
}
```

---

### 6. Collect and Group

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Результаты всех 5 Pop нод

**Логика:**
1. Собирает все непустые результаты
2. Парсит JSON каждого сообщения
3. Группирует по external_chat_id
4. Формирует массив батчей

**Передаёт:**
```json
{
  "empty": false,
  "batch_count": 2,
  "batches": [
    {
      "external_chat_id": "tg_123456789",
      "channel": "telegram",
      "messages": [msg1, msg2],
      "count": 2
    },
    {
      "external_chat_id": "tg_987654321",
      "channel": "telegram",
      "messages": [msg3],
      "count": 1
    }
  ]
}
```

---

### 7. Queue Empty?

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.if |
| **Условие** | `$json.empty === true` |

**Принимает:** Результат группировки

**Логика:** Проверяет пуста ли очередь

**Передаёт:**
- **TRUE** → Release Lock (Empty)
- **FALSE** → Split Batches

---

### 8. Release Lock (Empty)

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | delete |
| **Key** | `elo:processor:lock` |

**Принимает:** —

**Логика:** Освобождает lock, workflow завершается

---

### 9. Split Batches

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Объект с batches

**Логика:** Разворачивает массив батчей в отдельные items

**Передаёт:** Массив items, каждый = один батч

---

### 10. Loop Over Batches

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.splitInBatches |
| **Batch Size** | 1 |

**Принимает:** Массив батчей

**Логика:** Обрабатывает батчи по одному

**Передаёт:** Один батч за раз

---

### 11. Prepare Tenant Lookup

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Один батч с сообщениями

**Логика:**
1. Берёт первое сообщение батча
2. Извлекает credential для lookup:
   - telegram → bot_token
   - vk → group_id
   - whatsapp → profile_id
   - avito → user_id
   - max → bot_token

**Передаёт:**
```json
{
  "external_chat_id": "tg_123456789",
  "channel": "telegram",
  "messages": [...],
  "lookup_channel": "telegram",
  "lookup_value": "123456:ABC...",
  "needs_tenant_lookup": true
}
```

---

### 12. Find Tenant

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.postgres |
| **Operation** | executeQuery |
| **Query** | см. ниже |

**SQL запрос:**
```sql
SELECT
  ca.tenant_id,
  t.name as tenant_name,
  t.is_active,
  t.settings as tenant_settings,
  ca.credentials as channel_config
FROM elo_channel_accounts ca
JOIN elo_tenants t ON t.id = ca.tenant_id
WHERE ca.channel = '{{ lookup_channel }}'
  AND (
    ca.account_id = '{{ lookup_value }}'
    OR ca.credentials->>'bot_token' = '{{ lookup_value }}'
    OR ca.credentials->>'token' = '{{ lookup_value }}'
    OR ca.credentials->>'group_id' = '{{ lookup_value }}'
    OR ca.credentials->>'profile_id' = '{{ lookup_value }}'
  )
  AND ca.is_active = true
  AND t.is_active = true
LIMIT 1;
```

**Принимает:** lookup_channel, lookup_value

**Логика:** Ищет tenant по credentials канала

**Передаёт:**
```json
{
  "tenant_id": "a1b2c3d4-...",
  "tenant_name": "Ремонт телефонов",
  "is_active": true,
  "tenant_settings": {
    "batch_timeout_sec": 10,
    "ai_mode": "assist"
  },
  "channel_config": {...}
}
```

---

### 13. Attach Tenant

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.code |
| **Язык** | JavaScript |

**Принимает:** Батч + результат Find Tenant

**Логика:**
1. Если tenant найден — использует его
2. Если не найден — использует default tenant
3. Добавляет tenant_id, tenant_settings к каждому сообщению

**Передаёт:**
```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Первое сообщение",
  "tenant_id": "a1b2c3d4-...",
  "tenant_name": "Ремонт телефонов",
  "tenant_settings": {
    "batch_timeout_sec": 10
  },
  "batch_messages": [msg1, msg2],
  "batch_count": 2
}
```

---

### 14. Execute Batcher

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.executeWorkflow |
| **Workflow ID** | ID ELO_Core_Batcher |

**Принимает:** Батч с tenant info

**Логика:** Синхронно вызывает ELO_Core_Batcher

**Передаёт:** Результат выполнения Batcher → обратно в Loop

---

### 15. Release Lock (Done)

| Параметр | Значение |
|----------|----------|
| **Тип** | n8n-nodes-base.redis |
| **Operation** | delete |
| **Key** | `elo:processor:lock` |

**Принимает:** — (после завершения Loop)

**Логика:** Освобождает lock

---

## Выходные данные

**Куда:** Execute Workflow в ELO_Core_Batcher

**Формат:**
```json
{
  "channel": "telegram",
  "external_chat_id": "tg_123456789",
  "text": "Текст первого сообщения",
  "tenant_id": "uuid-...",
  "tenant_name": "Название тенанта",
  "tenant_settings": {...},
  "channel_config": {...},
  "batch_messages": [...],
  "batch_count": 2
}
```

---

## Зависимости

| Тип | Название | Назначение |
|-----|----------|------------|
| Credentials | Redis account | Для работы с очередью |
| Credentials | Postgres account | Для поиска tenant |
| Workflow | ELO_Core_Batcher | Вызывается для обработки батча |

---

## Redis Keys

| Ключ | Тип | TTL | Назначение |
|------|-----|-----|------------|
| `queue:incoming` | List | — | Входящая очередь |
| `elo:processor:lock` | String | 60s | Lock процессора |

---

## Ошибки и обработка

| Ошибка | Причина | Обработка |
|--------|---------|-----------|
| Redis недоступен | Сетевая ошибка | Workflow fail, retry на следующем schedule |
| PostgreSQL недоступен | Сетевая ошибка | Workflow fail, сообщения потеряны (уже pop) |
| Tenant не найден | Нет записи в elo_channel_accounts | Использовать default tenant |
| ELO_Core_Batcher fail | Ошибка в Batcher | Сообщения потеряны |

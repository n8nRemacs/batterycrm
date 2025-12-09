# 📊 База данных - Миграции

## 🎯 Миграция 001: Multi-Device Architecture

**Файл:** `001_multi_device_architecture.sql`

**Дата:** 2025-11-22

---

## 📝 Что добавляет эта миграция?

### ✅ Новые таблицы:

1. **`appeal_devices`** - Устройства в рамках одной заявки
   - Поддержка нескольких устройств (iPhone 14 + Samsung S21 в одной заявке)
   - Статус обсуждения для управления фокусом диалога
   - Порядок упоминания клиентом

2. **`appeal_repairs`** - Ремонты/проблемы для каждого устройства
   - Несколько ремонтов одного устройства (батарея + дисплей + камера)
   - Статус обсуждения и приоритет
   - Детали: parts_owner, cost, time

3. **`context_fields_config`** - Конфигурация полей для сбора контекста
   - Гибкая настройка обязательных/необязательных полей
   - Порядок сбора данных от клиента
   - Привязка к AI Tools

### 🔧 Обновления существующих таблиц:

**`appeals`** - добавлены поля:
- `conversation_context` (JSONB) - контекст диалога
- `context_completion_status` (JSONB) - статус заполнения
- `conversation_focus` (JSONB) - текущий фокус диалога
- `last_greeting_at` (TIMESTAMPTZ) - последнее приветствие

### 📊 Вспомогательные объекты:

- **VIEW `v_appeals_with_devices`** - удобное представление для API
- **Триггеры** для автоматического обновления `updated_at`
- **Индексы** для оптимизации запросов

---

## 🚀 Как выполнить миграцию?

### Вариант 1: Через Supabase Dashboard (рекомендуется)

1. Открой **Supabase Dashboard**
2. Перейди в **SQL Editor**
3. Создай новый запрос
4. Скопируй содержимое `001_multi_device_architecture.sql`
5. Нажми **Run** (или Ctrl+Enter)

### Вариант 2: Через PostgreSQL клиент

```bash
psql -h your-host -U your-user -d your-database -f 001_multi_device_architecture.sql
```

---

## ✅ Что происходит при выполнении?

1. ✅ Создаются новые таблицы (если их нет)
2. ✅ Добавляются новые поля в `appeals` (если их нет)
3. ✅ Создаются индексы для производительности
4. ✅ Добавляются тестовые данные в `context_fields_config`
5. ✅ **АВТОМАТИЧЕСКАЯ МИГРАЦИЯ** старых данных:
   - Если в `appeals` есть `model_id` → создаётся запись в `appeal_devices`
   - Если в `appeals` есть `repair_type_id` → создаётся запись в `appeal_repairs`

---

## 🔍 Проверка выполнения

После выполнения миграции проверь:

```sql
-- Проверка таблиц
SELECT table_name
FROM information_schema.tables
WHERE table_name IN ('appeal_devices', 'appeal_repairs', 'context_fields_config');

-- Проверка новых полей в appeals
SELECT column_name
FROM information_schema.columns
WHERE table_name = 'appeals'
  AND column_name IN ('conversation_context', 'conversation_focus', 'last_greeting_at');

-- Проверка данных в context_fields_config
SELECT * FROM context_fields_config;

-- Проверка VIEW
SELECT * FROM v_appeals_with_devices LIMIT 1;
```

Ожидаемый результат:
- ✅ 3 новые таблицы созданы
- ✅ 3 новых поля в `appeals`
- ✅ 4 записи в `context_fields_config`
- ✅ VIEW `v_appeals_with_devices` работает

---

## 🔄 Откат миграции (если нужно)

⚠️ **ВНИМАНИЕ:** Откат удалит все данные из новых таблиц!

```sql
-- Откат миграции 001
DROP VIEW IF EXISTS v_appeals_with_devices;
DROP TABLE IF EXISTS appeal_repairs CASCADE;
DROP TABLE IF EXISTS appeal_devices CASCADE;
DROP TABLE IF EXISTS context_fields_config CASCADE;

ALTER TABLE appeals DROP COLUMN IF EXISTS conversation_context;
ALTER TABLE appeals DROP COLUMN IF EXISTS context_completion_status;
ALTER TABLE appeals DROP COLUMN IF EXISTS conversation_focus;
ALTER TABLE appeals DROP COLUMN IF EXISTS last_greeting_at;

DROP FUNCTION IF EXISTS update_updated_at_column() CASCADE;
```

---

## 📊 Структура данных (примеры)

### Пример 1: Простая заявка (1 устройство, 1 ремонт)

```sql
-- Appeal
INSERT INTO appeals (client_id, stage, type)
VALUES ('client-uuid', 'Сбор контекста', 'ремонт');

-- Device
INSERT INTO appeal_devices (appeal_id, model_id, phone_model, device_order)
VALUES ('appeal-uuid', 'iphone14-uuid', 'iPhone 14', 1);

-- Repair
INSERT INTO appeal_repairs (appeal_id, appeal_device_id, repair_type_id, parts_owner)
VALUES ('appeal-uuid', 'device-uuid', 'battery-uuid', 'наша');
```

### Пример 2: Сложная заявка (2 устройства, 4 ремонта)

```sql
-- Appeal (одна заявка)
INSERT INTO appeals (client_id, stage, type)
VALUES ('client-uuid', 'Обработка заявки', 'ремонт');

-- Device 1: iPhone 14
INSERT INTO appeal_devices (appeal_id, model_id, phone_model, device_order)
VALUES ('appeal-uuid', 'iphone14-uuid', 'iPhone 14', 1)
RETURNING id; -- device-1-uuid

-- Repairs для iPhone 14
INSERT INTO appeal_repairs (appeal_id, appeal_device_id, repair_type_id, parts_owner, priority)
VALUES
  ('appeal-uuid', 'device-1-uuid', 'battery-uuid', 'наша', 1),
  ('appeal-uuid', 'device-1-uuid', 'display-uuid', 'наша', 2);

-- Device 2: Samsung S21
INSERT INTO appeal_devices (appeal_id, model_id, phone_model, device_order)
VALUES ('appeal-uuid', 'samsung-s21-uuid', 'Samsung S21', 2)
RETURNING id; -- device-2-uuid

-- Repairs для Samsung S21
INSERT INTO appeal_repairs (appeal_id, appeal_device_id, repair_type_id, parts_owner, priority)
VALUES
  ('appeal-uuid', 'device-2-uuid', 'display-uuid', 'наша', 1);
```

---

## 🎯 Использование в API

### Получение заявки с устройствами

```sql
-- Простой способ (через VIEW)
SELECT * FROM v_appeals_with_devices
WHERE appeal_id = 'your-appeal-uuid';

-- Детальный способ (с JOIN)
SELECT
  a.*,
  jsonb_agg(DISTINCT jsonb_build_object(
    'device_id', ad.id,
    'model', ad.phone_model,
    'repairs', (
      SELECT jsonb_agg(jsonb_build_object(
        'repair_id', ar.id,
        'type', ar.repair_type_name,
        'cost', ar.estimated_cost,
        'status', ar.discussion_status
      ))
      FROM appeal_repairs ar
      WHERE ar.appeal_device_id = ad.id
    )
  )) as devices
FROM appeals a
LEFT JOIN appeal_devices ad ON ad.appeal_id = a.id
WHERE a.id = 'your-appeal-uuid'
GROUP BY a.id;
```

---

## 📚 Связанные файлы

- **База данных:** `Database_Structure_BatteryCRM_COMPLETE.md` (обновить после миграции)
- **Архитектура:** `Eldoleado full.md` (обновить описание ЭТАП 6)
- **n8n воркер:** `Backend JSON/BAT AI Appeal Router.json` (требует обновления)

---

## ❓ FAQ

### В: Что случится со старыми заявками?
О: Миграция автоматически перенесёт данные из `appeals.model_id` и `appeals.repair_type_id` в новые таблицы.

### В: Можно ли добавить новые поля в context_fields_config?
О: Да! Просто добавь запись в таблицу:
```sql
INSERT INTO context_fields_config
  (tenant_id, field_name, field_label, is_required, collection_order, tool_name)
VALUES
  ('your-tenant-uuid', 'warranty_period', 'Гарантийный срок', false, 5, 'Tool-Warranty');
```

### В: Как изменить порядок сбора полей?
О: Обновить `collection_order`:
```sql
UPDATE context_fields_config
SET collection_order = 2
WHERE field_name = 'parts_owner';
```

---

## 🚨 Важные моменты

1. ⚠️ **Backup перед миграцией!** Сделай снэпшот БД в Supabase
2. ✅ Миграция **идемпотентна** - можно выполнять несколько раз (использует `IF NOT EXISTS`)
3. ✅ Старые данные **сохраняются** - миграция только добавляет новые таблицы
4. ⚠️ После миграции нужно обновить **n8n воркеры** (BAT AI Appeal Router)

---

## 📞 Поддержка

Если возникли проблемы:
1. Проверь логи в Supabase (раздел Logs)
2. Выполни проверочные запросы (см. раздел "Проверка выполнения")
3. Проверь права доступа (нужны права на CREATE TABLE)

---

**Готово! Теперь можно переходить к обновлению n8n воркеров и AI Tools.**

# Block 2: Полное руководство по настройке

> Сначала описываем в свободной форме, потом переводим в таблицы БД

---

## Что делает Block 2?

Block 2 — это **мозг понимания**. Когда клиент пишет сообщение, Block 2:

1. **Извлекает контекст** — понимает, о чём речь (какое устройство, какая проблема, какое настроение)
2. **Нормализует данные** — превращает "айфон" в "Apple", "сяоми" в "Xiaomi"
3. **Определяет этап воронки** — понимает, на каком этапе диалог и куда двигаться
4. **Накапливает знания** — каждое сообщение добавляет информацию в контекст диалога

---

## СТРУКТУРА ДАННЫХ

### Общая схема таблиц

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                           СПРАВОЧНИКИ (статичные)                           │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                             │
│  elo_domains ──────────────┬──────────────── elo_verticals                  │
│  (электроника, авто, софт) │                 (ремонт телефонов, автосервис) │
│         │                  │                        │                       │
│         │                  │                        │                       │
│         ▼                  ▼                        ▼                       │
│  elo_d_context_types    elo_context_types    elo_v_context_types            │
│  (device, vehicle)      (greeting, sentiment) (symptom, warranty)           │
│                                                                             │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                             │
│  elo_funnel_stages ◄──── elo_behavior_types                                 │
│  (lead, qualification)    (collect_iterative, present_and_confirm)          │
│                                                                             │
│  elo_normalization_rules                                                    │
│  (айфон → Apple)                                                            │
│                                                                             │
│  elo_agent_tiers                                                            │
│  (nano, small, optima, pro, expert)                                         │
│                                                                             │
└─────────────────────────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────────────────────────┐
│                        ТЕНАНТЫ (динамичные)                                 │
├─────────────────────────────────────────────────────────────────────────────┤
│                                                                             │
│  elo_t_tenants ─────────┬─────────────────┬─────────────────────────────    │
│  (МобилСервис, ПроФикс) │                 │                                 │
│         │               │                 │                                 │
│         ▼               ▼                 ▼                                 │
│  elo_t_tenant_domains   elo_t_tenant_verticals   elo_t_context_type_overrides│
│  (какие домены)         (какие вертикали)        (кастомные промпты)        │
│                                                                             │
└─────────────────────────────────────────────────────────────────────────────┘
```

---

## 1. CONTEXT TYPES — Что извлекаем

### Три уровня извлечения

| Уровень | Таблица | Для кого | Примеры |
|---------|---------|----------|---------|
| Global | `elo_context_types` | Все тенанты | greeting, sentiment, urgency |
| Domain | `elo_d_context_types` | Тенанты домена | device (для electronics), vehicle (для auto) |
| Vertical | `elo_v_context_types` | Тенанты вертикали | symptom, warranty (для repair) |

### Структура таблиц

**elo_context_types** (Global):
```
id | code      | name      | default_prompt           | output_schema        | agent_tier
---|-----------|-----------|--------------------------|----------------------|-----------
1  | greeting  | Greeting  | Is this a greeting?...   | {"value": "boolean"} | nano
2  | sentiment | Sentiment | Detect sentiment...      | {"value": "string"}  | nano
```

**elo_d_context_types** (Domain):
```
id | domain_id | code   | name   | default_prompt | output_schema                              | agent_tier
---|-----------|--------|--------|----------------|--------------------------------------------|-----------
1  | 1         | device | Device | Extract device | {"brand":"string","model":"string",...}   | small
```
*domain_id ссылается на elo_domains*

**elo_v_context_types** (Vertical):
```
id | vertical_id | code    | name    | default_prompt | output_schema              | agent_tier
---|-------------|---------|---------|----------------|----------------------------|-----------
1  | 1           | symptom | Symptom | Extract issue  | {"category":"string",...}  | optima
```
*vertical_id ссылается на elo_verticals*

### Как это работает вместе

```
Сообщение от клиента тенанта "МобилСервис"
                │
                ▼
┌───────────────────────────────────────────────────────────────┐
│ 1. Загружаем Global context types (для всех)                  │
│    → greeting, sentiment, urgency, question, complaint        │
├───────────────────────────────────────────────────────────────┤
│ 2. Смотрим elo_t_tenant_domains: какой домен у тенанта?       │
│    → domain_id = 1 (electronics)                              │
│    → Загружаем elo_d_context_types WHERE domain_id = 1        │
│    → device, owner                                            │
├───────────────────────────────────────────────────────────────┤
│ 3. Смотрим elo_t_tenant_verticals: какая вертикаль?           │
│    → vertical_id = 1 (repair)                                 │
│    → Загружаем elo_v_context_types WHERE vertical_id = 1      │
│    → symptom, purchase_year, warranty                         │
├───────────────────────────────────────────────────────────────┤
│ 4. Смотрим elo_t_context_type_overrides: есть кастомизация?   │
│    → Заменяем промпты/схемы/tiers на кастомные                │
└───────────────────────────────────────────────────────────────┘
                │
                ▼
       Итого извлекаем 10 типов контекста
```

---

## 2. ПРОМПТЫ И СХЕМЫ

### Что такое промпт?

Промпт — это **текстовая инструкция** для AI. Хранится в поле `default_prompt` каждого context type.

### Что такое схема?

Схема — это **формат ответа** AI. Хранится в поле `output_schema` как JSONB.

### Таблицы хранения

| Что | Где хранится | Поле |
|-----|--------------|------|
| Промпт global | elo_context_types | default_prompt |
| Промпт domain | elo_d_context_types | default_prompt |
| Промпт vertical | elo_v_context_types | default_prompt |
| Кастомный промпт тенанта | elo_t_context_type_overrides | custom_prompt |
| Схема ответа | elo_*_context_types | output_schema |
| Кастомная схема тенанта | elo_t_context_type_overrides | custom_output_schema |

### Пример промпта + схемы

**В свободной форме:**
```
Контекст: Устройство (device)
Задача: Извлечь информацию о телефоне/планшете клиента
Что ищем:
  - Бренд (Apple, Samsung, Xiaomi...)
  - Модель (iPhone 14, Galaxy S23...)
  - Цвет (если упоминается)
  - IMEI (если есть, 15 цифр)
Формат: JSON
Уровень AI: small (достаточно для извлечения)
```

**В формате БД:**
```sql
UPDATE elo_d_context_types
SET
  default_prompt = 'Ты эксперт по электронике. Извлеки информацию об устройстве из сообщения.
Ищи: brand (бренд), model (модель), color (цвет), imei (15 цифр).
Верни JSON. Если поле не найдено — null.
Только JSON, без объяснений.',
  output_schema = '{"brand": "string", "model": "string", "color": "string", "imei": "string"}',
  agent_tier = 'small'
WHERE code = 'device';
```

---

## 3. AGENT TIER — Уровень AI

### Таблица хранения

**elo_agent_tiers**:
```
code   | name        | model_id                    | is_free | cost
-------|-------------|-----------------------------|---------|---------
nano   | Nano (Free) | qwen/qwen3-4b:free          | true    | 0
small  | Small       | qwen/qwen3-8b               | false   | $0.07/1M
optima | Optima      | anthropic/claude-3-haiku    | false   | $0.25/1M
pro    | Pro         | openai/gpt-4o-mini          | false   | $0.15/1M
expert | Expert      | anthropic/claude-3-5-sonnet | false   | $3.00/1M
```

### Где указывается tier

| Уровень | Таблица | Поле |
|---------|---------|------|
| По умолчанию для context type | elo_*_context_types | agent_tier |
| Кастомный для тенанта | elo_t_context_type_overrides | custom_agent_tier |
| Лимит для тенанта | elo_t_tenants.settings | max_tier |

### Как выбрать tier

```
Простой вопрос да/нет (greeting, question) → nano
Извлечение полей (device, vehicle) → small
Понимание смысла (symptom, complaint) → optima
Принятие решений (что делать дальше) → pro
Критичные ситуации (эскалация) → expert
```

---

## 4. NORMALIZATION — Нормализация

### Таблица хранения

**elo_normalization_rules**:
```
id | field_code   | pattern  | normalized_value | priority | tenant_id
---|--------------|----------|------------------|----------|----------
1  | device.brand | айфон    | Apple            | 100      | NULL
2  | device.brand | iphone   | Apple            | 100      | NULL
3  | device.brand | эпл      | Apple            | 90       | NULL
4  | device.brand | самсунг  | Samsung          | 100      | NULL
```

- `field_code` — какое поле нормализуем (device.brand, device.model)
- `pattern` — что ищем (регистронезависимо)
- `normalized_value` — на что заменяем
- `priority` — приоритет (если несколько правил подходят)
- `tenant_id` — NULL = для всех, UUID = только для тенанта

### В свободной форме → в БД

**Свободная форма:**
```
Нормализация брендов телефонов:

Apple: айфон, iphone, apple, эпл, яблоко, эппл
Samsung: самсунг, samsung, галакси, galaxy, самс
Xiaomi: сяоми, xiaomi, редми, redmi, поко, poco, ми
Huawei: хуавей, huawei, хуавэй
Honor: хонор, honor
```

**В формате SQL:**
```sql
INSERT INTO elo_normalization_rules (field_code, pattern, normalized_value, priority) VALUES
('device.brand', 'айфон', 'Apple', 100),
('device.brand', 'iphone', 'Apple', 100),
('device.brand', 'apple', 'Apple', 100),
('device.brand', 'эпл', 'Apple', 90),
('device.brand', 'яблоко', 'Apple', 80),
('device.brand', 'самсунг', 'Samsung', 100),
('device.brand', 'samsung', 'Samsung', 100),
('device.brand', 'галакси', 'Samsung', 90);
```

---

## 5. ВОРОНКА — Этапы диалога

### Таблицы хранения

**elo_behavior_types** — типы поведения:
```
id | code               | name                | description
---|--------------------|--------------------|---------------------------
1  | collect_iterative  | Iterative Collect  | Собирает данные по одному
2  | collect_batch      | Batch Collect      | Собирает несколько сразу
3  | present_and_confirm| Present & Confirm  | Показывает и ждёт ответа
4  | wait_external      | Wait External      | Ждёт внешнего события
5  | terminal_success   | Terminal Success   | Успешное завершение
6  | terminal_cancelled | Terminal Cancelled | Отмена
7  | escalate           | Escalate           | Передача оператору
```

**elo_funnel_stages** — этапы воронки:
```
id | code            | name            | behavior_type_id | sort_order | tenant_id
---|-----------------|-----------------|------------------|------------|----------
1  | lead            | Lead            | 1                | 1          | NULL
2  | qualification   | Qualification   | 1                | 2          | NULL
3  | data_collection | Data Collection | 1                | 3          | NULL
4  | presentation    | Presentation    | 3                | 4          | NULL
5  | agreement       | Agreement       | 4                | 5          | NULL
6  | booking         | Booking         | 1                | 6          | NULL
7  | confirmation    | Confirmation    | 4                | 7          | NULL
```

- `tenant_id = NULL` — глобальный этап для всех
- `tenant_id = UUID` — кастомный этап тенанта

### Связи

```
elo_behavior_types
        │
        │ behavior_type_id
        ▼
elo_funnel_stages ◄──── elo_t_funnel_stage_overrides (кастомизация тенанта)
        │
        │ current_stage
        ▼
elo_t_dialogs (текущий этап диалога)
```

### В свободной форме

```
Воронка сервисного центра:

1. LEAD (Лид)
   Поведение: собираем итеративно
   Цель: Понять, что нужно клиенту
   Переход: когда понятен тип обращения

2. QUALIFICATION (Квалификация)
   Поведение: собираем итеративно
   Цель: Уточнить устройство и проблему
   Переход: когда есть device + symptom

3. DATA_COLLECTION (Сбор данных)
   Поведение: собираем итеративно
   Цель: Собрать всё для расчёта (гарантия, год покупки)
   Переход: когда все обязательные поля заполнены

4. PRESENTATION (Презентация)
   Поведение: показываем и ждём
   Цель: Назвать цену и сроки
   Переход: когда клиент ответил

5. AGREEMENT (Согласование)
   Поведение: ждём
   Цель: Ответить на вопросы, дождаться согласия
   Переход: когда согласен

6. BOOKING (Запись)
   Поведение: собираем итеративно
   Цель: Согласовать время и место
   Переход: когда время назначено

7. CONFIRMATION (Подтверждение)
   Поведение: ждём
   Цель: Подтвердить запись
   Переход: завершение
```

---

## 6. TENANT — Настройки тенанта

### Таблицы

**elo_t_tenants** — основная информация:
```
id       | name             | slug        | domain_id | plan | settings
---------|------------------|-------------|-----------|------|----------
uuid-1   | МобилСервис      | mobilservis | 1         | free | {...}
uuid-2   | ПроФикс          | profix      | 1         | pro  | {...}
```

**elo_t_tenant_domains** — привязка к доменам:
```
tenant_id | domain_id
----------|----------
uuid-1    | 1         (electronics)
uuid-2    | 1         (electronics)
```

**elo_t_tenant_verticals** — привязка к вертикалям:
```
tenant_id | vertical_id
----------|------------
uuid-1    | 1           (repair)
uuid-2    | 1           (repair)
```

### Поле settings (JSONB)

```json
{
  "ai_mode": "auto",           // auto | assisted | manual
  "default_tier": "small",     // tier по умолчанию
  "max_tier": "pro",           // максимальный tier

  "language": "ru",
  "timezone": "Europe/Moscow",
  "currency": "RUB",

  "working_hours": {
    "start": "09:00",
    "end": "20:00"
  },

  "debounce_seconds": 10,      // пауза перед обработкой

  "agent_personality": {
    "name": "Алиса",
    "tone": "friendly",        // friendly | professional | casual
    "emoji_allowed": true
  }
}
```

---

## 7. OVERRIDES — Кастомизация тенанта

### Таблица

**elo_t_context_type_overrides**:
```
id | tenant_id | context_type_id | d_context_type_id | v_context_type_id | custom_prompt | custom_output_schema | custom_agent_tier | is_active
---|-----------|-----------------|-------------------|-------------------|---------------|----------------------|-------------------|----------
1  | uuid-1    | NULL            | 1                 | NULL              | "Ты консуль..." | NULL              | NULL              | true
2  | uuid-1    | 5               | NULL              | NULL              | NULL          | NULL                 | NULL              | false
```

- Одно из полей `context_type_id`, `d_context_type_id`, `v_context_type_id` заполнено
- `custom_prompt` — свой промпт вместо default
- `custom_output_schema` — своя схема
- `custom_agent_tier` — свой tier
- `is_active = false` — отключить этот тип для тенанта

---

## WORKFLOW: Как настраивать

### Шаг 1: Описать в свободной форме

```
Мой сервисный центр "МобилСервис":
- Домен: электроника
- Вертикаль: ремонт телефонов

Что нужно извлекать:
1. Устройство (бренд, модель)
2. Проблема (категория, описание)
3. Гарантия (есть/нет)
4. Год покупки

Нормализация:
- Бренды: айфон→Apple, самсунг→Samsung
- Модели: про макс→Pro Max

Воронка:
1. Приветствие → узнать что случилось
2. Уточнение → какой телефон, что не работает
3. Расчёт → назвать цену
4. Запись → согласовать время
```

### Шаг 2: Преобразовать в SQL

```sql
-- 1. Создать тенанта
INSERT INTO elo_t_tenants (name, slug, domain_id, plan, settings) VALUES
('МобилСервис', 'mobilservis', 1, 'free', '{
  "ai_mode": "auto",
  "language": "ru",
  "timezone": "Europe/Moscow"
}');

-- 2. Привязать к домену и вертикали
INSERT INTO elo_t_tenant_domains (tenant_id, domain_id)
VALUES ('uuid-тенанта', 1);

INSERT INTO elo_t_tenant_verticals (tenant_id, vertical_id)
VALUES ('uuid-тенанта', 1);

-- 3. Добавить промпты для context types
UPDATE elo_d_context_types SET default_prompt = '...' WHERE code = 'device';
UPDATE elo_v_context_types SET default_prompt = '...' WHERE code = 'symptom';

-- 4. Добавить правила нормализации
INSERT INTO elo_normalization_rules (field_code, pattern, normalized_value) VALUES
('device.brand', 'айфон', 'Apple'),
('device.brand', 'самсунг', 'Samsung');
```

---

## 8. СПРАВОЧНИКИ — Каталоги для нормализации

### Зачем нужны справочники

Справочники хранят **канонический список** сущностей с UUID. AI извлекает из свободного текста и сопоставляет с UUID из справочника. В Neo4j граф хранится UUID, а не текст.

```
Клиент: "разбил экран на самсунге s23"
              │
              ▼
AI извлекает и сопоставляет со справочником:
  brand_id: 4db5dbd1-4ffb-4d44-... (Samsung)
  model_id: 7a3b2c1d-8e9f-... (Galaxy S23)
              │
              ▼
Neo4j хранит UUID → единый источник правды
```

### Таблицы справочников

| Таблица | Описание | Заполнение |
|---------|----------|------------|
| `elo_dict_brands` | Бренды устройств (Apple, Samsung...) | ⚠️ **ТРЕБУЕТСЯ** |
| `elo_dict_models` | Модели устройств (iPhone 15, Galaxy S24...) | ⚠️ **ТРЕБУЕТСЯ** |
| `elo_symptom_types` | Типы симптомов (screen_cracked...) | ✅ Заполнено |
| `elo_diagnosis_types` | Типы диагнозов | ✅ Заполнено |
| `elo_repair_actions` | Типы ремонтов | ✅ Заполнено |
| `elo_problem_categories` | Категории проблем | ✅ Заполнено |
| `elo_dict_symptom_candidates` | AI-обучение (автозаполнение) | Автоматически |

### Что нужно заполнить

**elo_dict_brands** — бренды:
```sql
-- Структура (уже есть 15 брендов)
SELECT id, code, name FROM elo_dict_brands;
-- Добавить свои если нужны другие устройства (не телефоны)
```

**elo_dict_models** — модели:
```sql
-- Структура (уже есть ~180 моделей телефонов)
SELECT id, code, name, release_year FROM elo_dict_models;
-- Добавить модели для своего бизнеса
```

### AI Learning Pipeline

Таблица `elo_dict_symptom_candidates` автоматически накапливает новые фразы симптомов от клиентов:

```
Клиент: "телефон показывает цветные квадраты"
         │
         ▼
AI не находит точное совпадение в elo_symptom_types
         │
         ▼
Создаёт запись в elo_dict_symptom_candidates:
  - phrase: "показывает цветные квадраты"
  - suggested_category: screen
  - confidence: 0.75
  - status: pending
         │
         ▼
Модератор проверяет → approved/rejected
         │
         ▼
Если approved → добавляется в elo_symptom_types
```

### View для работы

```sql
-- Каталог устройств (бренд + модель)
SELECT * FROM elo_v_device_catalog;

-- Статистика по брендам
SELECT * FROM elo_v_brand_stats;
```

---

## ЧЕКЛИСТ НАСТРОЙКИ

### Обязательно:

- [ ] Тенант создан в `elo_t_tenants`
- [ ] Тенант привязан к домену в `elo_t_tenant_domains`
- [ ] Тенант привязан к вертикали в `elo_t_tenant_verticals`
- [ ] Промпты заполнены в `elo_d_context_types` (для домена)
- [ ] Промпты заполнены в `elo_v_context_types` (для вертикали)
- [ ] **Справочники заполнены** (бренды, модели для бизнеса тенанта)

### Справочники:

- [ ] `elo_dict_brands` — добавлены бренды для бизнеса (если не телефоны)
- [ ] `elo_dict_models` — добавлены модели для бизнеса
- [ ] `elo_symptom_types` — проверены типы симптомов
- [ ] `elo_diagnosis_types` — проверены типы диагнозов

### Опционально:

- [ ] Правила нормализации в `elo_normalization_rules`
- [ ] Кастомные промпты в `elo_t_context_type_overrides`
- [ ] Настройки `settings` в `elo_t_tenants`

---

*Документ создан: 2026-01-04*

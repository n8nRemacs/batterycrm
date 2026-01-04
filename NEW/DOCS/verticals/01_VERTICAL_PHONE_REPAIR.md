# Вертикаль: Ремонт сотовых телефонов

> Полная конфигурация Block 2 для сервисных центров

---

## Описание вертикали

**Домен:** `mobile_phones` (Сотовые телефоны)
**Код вертикали:** `phone_repair`
**Название:** Ремонт сотовых телефонов
**Бизнес:** Сервисные центры, мастерские по ремонту

---

## Что извлекаем из сообщений клиента

### Уровни извлечения

```
┌─────────────────────────────────────────────────────────────┐
│ GLOBAL (для всех)                                           │
│ greeting, sentiment, urgency, question                      │
├─────────────────────────────────────────────────────────────┤
│ DOMAIN: mobile_phones                                       │
│ device, device_condition, price_expectation                 │
├─────────────────────────────────────────────────────────────┤
│ VERTICAL: phone_repair                                      │
│ symptom, repair_history, warranty, purchase_info, urgency_repair │
└─────────────────────────────────────────────────────────────┘
```

---

## Vertical Context Types

### 1. Symptom (Симптом/Проблема)

**Что извлекаем:** Описание неисправности

**В свободной форме:**
```
Симптом — это проблема, с которой обратился клиент.
Нужно понять:
- Категория проблемы (экран, батарея, не включается и т.д.)
- Описание своими словами
- Когда началось
- После чего началось (упал, залили, само)
```

**Промпт:**
```
Ты специалист сервисного центра по ремонту телефонов.
Извлеки информацию о проблеме/неисправности устройства.

Категории проблем:
- screen_broken: разбит экран, трещины на стекле
- screen_display: полосы, пятна, не работает часть экрана, мерцает
- not_turning_on: не включается, черный экран при включении
- battery: быстро разряжается, не заряжается, вздулась батарея
- charging: не заряжается, не видит зарядку, сломан разъем
- water_damage: залили водой, попала влага, утопили
- buttons: не работают кнопки, залипают, не нажимаются
- sound: нет звука, хрипит динамик, не работает микрофон
- camera: не работает камера, мутные фото, черный экран камеры
- software: глючит, тормозит, перезагружается, вирусы
- network: не ловит сеть, нет WiFi, не работает Bluetooth
- physical: погнут корпус, сколы, царапины (без влияния на работу)
- face_id: не работает Face ID / Touch ID
- other: другое

Верни JSON:
{
  "category": "категория из списка",
  "description": "краткое описание проблемы",
  "when_started": "когда началось (если указано)",
  "cause": "причина если известна (dropped/water/unknown/wear)"
}
```

**Схема:**
```json
{
  "category": "string",
  "description": "string",
  "when_started": "string",
  "cause": "string"
}
```

**Tier:** `optima` (нужно понимание контекста)

---

### 2. Repair History (История ремонтов)

**Что извлекаем:** Ремонтировался ли раньше

**В свободной форме:**
```
Важно знать, ремонтировался ли телефон раньше:
- Это влияет на гарантию
- Может указывать на системную проблему
- Нужно знать, что меняли
```

**Промпт:**
```
Определи, упоминает ли клиент предыдущие ремонты устройства.

Ищи:
- Факт ремонта (уже ремонтировали, меняли экран, был в сервисе)
- Где ремонтировали (у вас, в другом месте, сам)
- Что делали (меняли экран, батарею, разъем)
- Когда (недавно, год назад, при покупке)

Верни JSON:
{
  "was_repaired": true/false/null,
  "where": "here/elsewhere/self/null",
  "what_was_done": "описание если есть",
  "when": "когда если указано"
}

Если информации нет — верни {"was_repaired": null}
```

**Схема:**
```json
{
  "was_repaired": "boolean",
  "where": "string",
  "what_was_done": "string",
  "when": "string"
}
```

**Tier:** `small`

---

### 3. Warranty (Гарантия)

**Что извлекаем:** Гарантийный статус устройства

**В свободной форме:**
```
Гарантия важна для:
- Определения типа ремонта (гарантийный/платный)
- Понимания возраста устройства
- Возможности обращения к производителю
```

**Промпт:**
```
Извлеки информацию о гарантии на устройство.

Варианты:
- under_warranty: на гарантии, есть гарантия
- expired: гарантия закончилась, истекла
- no_warranty: не было гарантии, серый телефон
- unknown: не упоминается

Также ищи:
- Срок гарантии (1 год, 2 года)
- Где покупали (официально, в магазине, с рук, на Авито)

Верни JSON:
{
  "status": "under_warranty/expired/no_warranty/unknown",
  "duration": "срок если указан",
  "purchase_place": "где купили если указано"
}
```

**Схема:**
```json
{
  "status": "string",
  "duration": "string",
  "purchase_place": "string"
}
```

**Tier:** `nano`

---

### 4. Purchase Info (Информация о покупке)

**Что извлекаем:** Когда и где куплен телефон

**В свободной форме:**
```
Информация о покупке помогает:
- Оценить износ устройства
- Понять, стоит ли ремонтировать (старый телефон)
- Определить официальность устройства
```

**Промпт:**
```
Извлеки информацию о покупке устройства.

Ищи:
- Когда купили (год, месяц, "недавно", "давно", "2 года назад")
- Где купили (магазин, Авито, с рук, в подарок)
- За сколько купили (если упоминается цена)
- Новый или б/у при покупке

Верни JSON:
{
  "purchase_date": "дата или период",
  "purchase_year": число (год),
  "purchase_place": "где купили",
  "purchase_price": число или null,
  "was_new": true/false/null
}
```

**Схема:**
```json
{
  "purchase_date": "string",
  "purchase_year": "number",
  "purchase_place": "string",
  "purchase_price": "number",
  "was_new": "boolean"
}
```

**Tier:** `small`

---

### 5. Urgency Repair (Срочность ремонта)

**Что извлекаем:** Насколько срочно нужен ремонт

**В свободной форме:**
```
Срочность важна для:
- Приоритезации заказов
- Предложения экспресс-ремонта
- Понимания готовности платить больше
```

**Промпт:**
```
Определи срочность ремонта из сообщения клиента.

Уровни срочности:
- critical: очень срочно, нужен сегодня, телефон для работы, единственный телефон
- high: срочно, желательно быстрее, нужен на этой неделе
- normal: обычная срочность, когда будет готово
- low: не срочно, когда будет время

Признаки срочности:
- "очень нужен", "срочно", "быстро"
- "рабочий телефон", "единственный"
- "улетаю завтра", "важные данные"

Верни JSON:
{
  "level": "critical/high/normal/low",
  "reason": "причина срочности если указана"
}
```

**Схема:**
```json
{
  "level": "string",
  "reason": "string"
}
```

**Tier:** `nano`

---

## SQL: Создание вертикали и context types

```sql
-- 1. Создать вертикаль
INSERT INTO elo_verticals (domain_id, code, name, description, is_active, sort_order)
SELECT id, 'phone_repair', 'Ремонт сотовых телефонов',
       'Сервисные центры, мастерские по ремонту телефонов', true, 1
FROM elo_domains WHERE code = 'mobile_phones';

-- Получить ID вертикали
SELECT id FROM elo_verticals WHERE code = 'phone_repair';
-- Допустим, id = 10

-- 2. Создать vertical context types
INSERT INTO elo_v_context_types (vertical_id, code, name, description, default_prompt, output_schema, agent_tier, sort_order) VALUES

-- Symptom
(10, 'symptom', 'Симптом/Проблема', 'Описание неисправности устройства',
'Ты специалист сервисного центра по ремонту телефонов.
Извлеки информацию о проблеме/неисправности устройства.

Категории проблем:
- screen_broken: разбит экран, трещины на стекле
- screen_display: полосы, пятна, не работает часть экрана
- not_turning_on: не включается, черный экран
- battery: быстро разряжается, не заряжается, вздулась
- charging: не заряжается, сломан разъем
- water_damage: залили водой, утопили
- buttons: не работают кнопки
- sound: нет звука, хрипит динамик, не работает микрофон
- camera: не работает камера
- software: глючит, тормозит, вирусы
- network: нет сети, WiFi, Bluetooth
- face_id: не работает Face ID / Touch ID
- other: другое

Верни JSON: {"category": "...", "description": "...", "when_started": "...", "cause": "dropped/water/unknown/wear"}',
'{"category": "string", "description": "string", "when_started": "string", "cause": "string"}',
'optima', 1),

-- Repair history
(10, 'repair_history', 'История ремонтов', 'Предыдущие ремонты устройства',
'Определи, упоминает ли клиент предыдущие ремонты.
Ищи: факт ремонта, где, что делали, когда.
Верни JSON: {"was_repaired": true/false/null, "where": "here/elsewhere/self/null", "what_was_done": "...", "when": "..."}',
'{"was_repaired": "boolean", "where": "string", "what_was_done": "string", "when": "string"}',
'small', 2),

-- Warranty
(10, 'warranty', 'Гарантия', 'Гарантийный статус устройства',
'Извлеки информацию о гарантии.
Статусы: under_warranty, expired, no_warranty, unknown
Верни JSON: {"status": "...", "duration": "...", "purchase_place": "..."}',
'{"status": "string", "duration": "string", "purchase_place": "string"}',
'nano', 3),

-- Purchase info
(10, 'purchase_info', 'Информация о покупке', 'Когда и где куплен телефон',
'Извлеки информацию о покупке: когда, где, за сколько, новый или б/у.
Верни JSON: {"purchase_date": "...", "purchase_year": число, "purchase_place": "...", "purchase_price": число, "was_new": true/false}',
'{"purchase_date": "string", "purchase_year": "number", "purchase_place": "string", "purchase_price": "number", "was_new": "boolean"}',
'small', 4),

-- Urgency
(10, 'urgency_repair', 'Срочность ремонта', 'Насколько срочно нужен ремонт',
'Определи срочность: critical (сегодня), high (быстрее), normal (когда готово), low (не срочно).
Признаки: "срочно", "рабочий телефон", "улетаю".
Верни JSON: {"level": "critical/high/normal/low", "reason": "..."}',
'{"level": "string", "reason": "string"}',
'nano', 5);
```

---

## Правила нормализации (специфичные для ремонта)

```sql
INSERT INTO elo_normalization_rules (field_code, pattern, normalized_value, priority) VALUES
-- Категории проблем
('symptom.category', 'разбил', 'screen_broken', 100),
('symptom.category', 'разбился', 'screen_broken', 100),
('symptom.category', 'треснул', 'screen_broken', 100),
('symptom.category', 'трещина', 'screen_broken', 100),
('symptom.category', 'не включается', 'not_turning_on', 100),
('symptom.category', 'черный экран', 'not_turning_on', 90),
('symptom.category', 'не работает экран', 'screen_display', 100),
('symptom.category', 'полосы на экране', 'screen_display', 100),
('symptom.category', 'быстро садится', 'battery', 100),
('symptom.category', 'не заряжается', 'charging', 100),
('symptom.category', 'утопил', 'water_damage', 100),
('symptom.category', 'залил', 'water_damage', 100),
('symptom.category', 'попала вода', 'water_damage', 100),
('symptom.category', 'не работает камера', 'camera', 100),
('symptom.category', 'не работает звук', 'sound', 100),
('symptom.category', 'глючит', 'software', 100),
('symptom.category', 'тормозит', 'software', 100),
('symptom.category', 'вирус', 'software', 90),

-- Причины поломки
('symptom.cause', 'упал', 'dropped', 100),
('symptom.cause', 'уронил', 'dropped', 100),
('symptom.cause', 'уронила', 'dropped', 100),
('symptom.cause', 'вода', 'water', 100),
('symptom.cause', 'залил', 'water', 100),
('symptom.cause', 'утопил', 'water', 100),
('symptom.cause', 'само', 'unknown', 80),
('symptom.cause', 'просто', 'unknown', 70);
```

---

## Воронка для ремонта

### Этапы

```
1. LEAD (Первый контакт)
   Цель: Понять, что случилось
   Собираем: greeting, symptom
   Переход: когда понятна проблема

2. QUALIFICATION (Квалификация)
   Цель: Уточнить устройство и проблему
   Собираем: device, symptom детали
   Переход: когда есть устройство + проблема

3. DATA_COLLECTION (Сбор данных)
   Цель: Собрать всё для расчета
   Собираем: warranty, purchase_info, repair_history, urgency
   Переход: когда достаточно для оценки

4. DIAGNOSTICS (Диагностика) — специфичный для ремонта
   Цель: Удалённая диагностика или запись на диагностику
   Поведение: present_and_confirm
   Переход: после согласия на диагностику

5. PRESENTATION (Презентация)
   Цель: Назвать предварительную стоимость
   Поведение: present_and_confirm
   Переход: когда клиент ответил

6. BOOKING (Запись)
   Цель: Согласовать время и адрес
   Собираем: время, способ доставки
   Переход: когда время согласовано

7. CONFIRMATION (Подтверждение)
   Цель: Подтвердить запись
   Поведение: terminal
```

### SQL: Этапы воронки

```sql
-- Добавить специфичный этап "diagnostics" для ремонта
INSERT INTO elo_funnel_stages (code, name, description, behavior_type_id, sort_order, vertical_id)
SELECT 'diagnostics', 'Диагностика', 'Удалённая диагностика или запись на диагностику',
       3, 35, id  -- behavior_type 3 = present_and_confirm
FROM elo_verticals WHERE code = 'phone_repair';
```

---

## Примеры диалогов

### Пример 1: Разбитый экран

**Клиент:** Привет, разбил экран на айфоне 14 про

**Извлечённый контекст:**
```json
{
  "greeting": {"value": true},
  "device": {"brand": "Apple", "model": "iPhone 14 Pro"},
  "symptom": {"category": "screen_broken", "description": "разбил экран", "cause": "dropped"}
}
```

### Пример 2: Проблема с батареей

**Клиент:** У меня самсунг s23, батарея вздулась, телефону 2 года, гарантия закончилась

**Извлечённый контекст:**
```json
{
  "device": {"brand": "Samsung", "model": "Galaxy S23"},
  "symptom": {"category": "battery", "description": "батарея вздулась"},
  "purchase_info": {"purchase_year": 2024},
  "warranty": {"status": "expired"}
}
```

### Пример 3: Срочный ремонт

**Клиент:** Срочно нужна помощь! Залил телефон водой, это мой рабочий телефон, без него никак. Xiaomi redmi note 12

**Извлечённый контекст:**
```json
{
  "device": {"brand": "Xiaomi", "model": "Redmi Note 12"},
  "symptom": {"category": "water_damage", "description": "залил водой", "cause": "water"},
  "urgency_repair": {"level": "critical", "reason": "рабочий телефон"},
  "sentiment": {"value": "negative"}
}
```

---

## Чеклист настройки вертикали

### Структура
- [ ] Домен `mobile_phones` создан в `elo_domains`
- [ ] Вертикаль `phone_repair` создана в `elo_verticals`
- [ ] Domain context types созданы (device, device_condition, price_expectation)
- [ ] Vertical context types созданы (symptom, repair_history, warranty, purchase_info, urgency_repair)
- [ ] Правила нормализации добавлены
- [ ] Этап `diagnostics` добавлен в воронку
- [ ] Тенант привязан к домену и вертикали

### Справочники (⚠️ ОБЯЗАТЕЛЬНО)
- [ ] `elo_dict_brands` — проверить наличие брендов которые ремонтируете
- [ ] `elo_dict_models` — проверить наличие моделей которые ремонтируете
- [ ] `elo_symptom_types` — проверить типы симптомов
- [ ] `elo_diagnosis_types` — проверить типы диагнозов

> См. [00_DOMAIN_MOBILE_PHONES.md](./00_DOMAIN_MOBILE_PHONES.md#справочники-обязательно-для-заполнения)

---

*Вертикаль: phone_repair | Создан: 2026-01-04*

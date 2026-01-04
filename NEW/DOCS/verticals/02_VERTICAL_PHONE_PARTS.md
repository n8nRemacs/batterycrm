# Вертикаль: Продажа запчастей для телефонов

> Полная конфигурация Block 2 для магазинов запчастей

---

## Описание вертикали

**Домен:** `mobile_phones` (Сотовые телефоны)
**Код вертикали:** `phone_parts`
**Название:** Продажа запчастей для сотовых телефонов
**Бизнес:** Магазины запчастей, оптовые поставщики, интернет-магазины

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
│ VERTICAL: phone_parts                                       │
│ part_type, part_quality, quantity, buyer_type, delivery     │
└─────────────────────────────────────────────────────────────┘
```

---

## Vertical Context Types

### 1. Part Type (Тип запчасти)

**Что извлекаем:** Какую запчасть ищет клиент

**В свободной форме:**
```
Нужно понять, какую запчасть ищет клиент:
- Категория (экран, батарея, разъем и т.д.)
- Для какого устройства
- Конкретная модель запчасти если указана
- Цвет (для корпусных деталей)
```

**Промпт:**
```
Ты консультант магазина запчастей для телефонов.
Извлеки информацию о запчасти, которую ищет клиент.

Категории запчастей:
- screen: экран, дисплей, тачскрин, модуль экрана, стекло
- battery: аккумулятор, батарея, АКБ
- charging_port: разъем зарядки, гнездо, порт, type-c, lightning
- back_cover: задняя крышка, задник, спинка
- frame: рамка, корпус, средняя часть
- camera: камера, модуль камеры, стекло камеры, линза
- speaker: динамик, полифония, разговорный динамик
- microphone: микрофон
- button: кнопка, шлейф кнопки, power, volume
- sim_tray: лоток сим, сим-держатель
- flex: шлейф, межплатный шлейф
- board: плата, материнская плата
- vibro: вибромотор, виброзвонок
- antenna: антенна, NFC антенна
- sensor: датчик, proximity, Face ID модуль
- other: другое

Верни JSON:
{
  "category": "категория из списка",
  "part_name": "название запчасти своими словами",
  "for_device": "для какого устройства если указано",
  "color": "цвет если указан",
  "part_number": "артикул если указан"
}
```

**Схема:**
```json
{
  "category": "string",
  "part_name": "string",
  "for_device": "string",
  "color": "string",
  "part_number": "string"
}
```

**Tier:** `small`

---

### 2. Part Quality (Качество запчасти)

**Что извлекаем:** Какое качество нужно клиенту

**В свободной форме:**
```
Запчасти бывают разного качества:
- Оригинал (снятый с донора или новый OEM)
- Высококачественная копия (AAA, Premium)
- Обычная копия (стандарт)
- Восстановленная (refurbished)
```

**Промпт:**
```
Определи, какое качество запчасти интересует клиента.

Уровни качества:
- original: оригинал, оригинальный, OEM, снятый с донора, б/у оригинал
- oem_new: новый оригинал, запечатанный оригинал
- premium: премиум, AAA, высокое качество, лучшая копия
- standard: стандарт, обычная, копия, дешевле
- refurbished: восстановленный, refurb, переклей

Также определи:
- Важна ли цена (ищет дешевле, бюджет, недорого)
- Важно ли качество (нужен хороший, чтобы долго служил)

Верни JSON:
{
  "quality": "original/oem_new/premium/standard/refurbished/unknown",
  "price_sensitive": true/false,
  "quality_important": true/false
}
```

**Схема:**
```json
{
  "quality": "string",
  "price_sensitive": "boolean",
  "quality_important": "boolean"
}
```

**Tier:** `nano`

---

### 3. Quantity (Количество)

**Что извлекаем:** Сколько нужно штук

**В свободной форме:**
```
Важно понять:
- Розничный клиент (1-2 шт)
- Оптовый клиент (от 10 шт)
- Сервисный центр (регулярные закупки)
```

**Промпт:**
```
Извлеки информацию о количестве запчастей.

Ищи:
- Конкретное число (5 штук, 10 шт, пару штук)
- Указание на опт (оптом, партия, много)
- Указание на розницу (одну, штучно)
- Регулярность (постоянно нужны, каждую неделю)

Верни JSON:
{
  "quantity": число или null,
  "is_wholesale": true/false/null,
  "is_regular": true/false
}
```

**Схема:**
```json
{
  "quantity": "number",
  "is_wholesale": "boolean",
  "is_regular": "boolean"
}
```

**Tier:** `nano`

---

### 4. Buyer Type (Тип покупателя)

**Что извлекаем:** Кто покупает — частник или бизнес

**В свободной форме:**
```
Типы покупателей:
- Частное лицо (для себя, для своего телефона)
- Мастер (ремонтирую, чиню, сервис)
- Сервисный центр (для нашего СЦ, регулярно берём)
- Магазин/перекупщик (на продажу, для магазина)
```

**Промпт:**
```
Определи тип покупателя из контекста сообщения.

Типы:
- individual: частное лицо, для себя, для своего телефона, друга попросили
- technician: мастер, ремонтник, чиню сам, частный мастер
- service_center: сервисный центр, СЦ, мастерская, для нашего сервиса
- reseller: магазин, на продажу, перепродажа, для торговли
- unknown: не понятно

Признаки:
- "для себя", "мой телефон" → individual
- "ремонтирую", "клиенту" → technician
- "для сервиса", "закупаем" → service_center
- "на продажу", "для магазина" → reseller

Верни JSON:
{
  "buyer_type": "тип из списка",
  "confidence": "high/medium/low"
}
```

**Схема:**
```json
{
  "buyer_type": "string",
  "confidence": "string"
}
```

**Tier:** `small`

---

### 5. Delivery (Доставка)

**Что извлекаем:** Как хочет получить товар

**В свободной форме:**
```
Способы получения:
- Самовывоз
- Доставка курьером
- Отправка транспортной компанией (СДЭК, ПЭК)
- Почта России
```

**Промпт:**
```
Извлеки информацию о желаемом способе получения товара.

Способы:
- pickup: самовывоз, заберу сам, приеду
- courier: курьер, доставка по городу, привезите
- transport_company: СДЭК, ПЭК, деловые линии, ТК
- post: почта, почтой, Почта России
- unknown: не указано

Также ищи:
- Город/адрес доставки
- Срочность доставки

Верни JSON:
{
  "method": "способ из списка",
  "city": "город если указан",
  "address": "адрес если указан",
  "urgent": true/false
}
```

**Схема:**
```json
{
  "method": "string",
  "city": "string",
  "address": "string",
  "urgent": "boolean"
}
```

**Tier:** `nano`

---

## SQL: Создание вертикали и context types

```sql
-- 1. Создать вертикаль
INSERT INTO elo_verticals (domain_id, code, name, description, is_active, sort_order)
SELECT id, 'phone_parts', 'Продажа запчастей для телефонов',
       'Магазины запчастей, оптовые поставщики', true, 2
FROM elo_domains WHERE code = 'mobile_phones';

-- Получить ID вертикали
SELECT id FROM elo_verticals WHERE code = 'phone_parts';
-- Допустим, id = 11

-- 2. Создать vertical context types
INSERT INTO elo_v_context_types (vertical_id, code, name, description, default_prompt, output_schema, agent_tier, sort_order) VALUES

-- Part type
(11, 'part_type', 'Тип запчасти', 'Какую запчасть ищет клиент',
'Ты консультант магазина запчастей. Извлеки информацию о запчасти.

Категории: screen, battery, charging_port, back_cover, frame, camera, speaker, microphone, button, sim_tray, flex, board, vibro, antenna, sensor, other

Верни JSON: {"category": "...", "part_name": "...", "for_device": "...", "color": "...", "part_number": "..."}',
'{"category": "string", "part_name": "string", "for_device": "string", "color": "string", "part_number": "string"}',
'small', 1),

-- Part quality
(11, 'part_quality', 'Качество запчасти', 'Какое качество нужно',
'Определи качество запчасти: original, oem_new, premium, standard, refurbished, unknown
Верни JSON: {"quality": "...", "price_sensitive": true/false, "quality_important": true/false}',
'{"quality": "string", "price_sensitive": "boolean", "quality_important": "boolean"}',
'nano', 2),

-- Quantity
(11, 'quantity', 'Количество', 'Сколько нужно штук',
'Извлеки количество и тип заказа.
Верни JSON: {"quantity": число, "is_wholesale": true/false, "is_regular": true/false}',
'{"quantity": "number", "is_wholesale": "boolean", "is_regular": "boolean"}',
'nano', 3),

-- Buyer type
(11, 'buyer_type', 'Тип покупателя', 'Частник или бизнес',
'Определи тип: individual (частник), technician (мастер), service_center (СЦ), reseller (магазин)
Верни JSON: {"buyer_type": "...", "confidence": "high/medium/low"}',
'{"buyer_type": "string", "confidence": "string"}',
'small', 4),

-- Delivery
(11, 'delivery', 'Доставка', 'Способ получения',
'Извлеки способ доставки: pickup, courier, transport_company, post, unknown
Верни JSON: {"method": "...", "city": "...", "address": "...", "urgent": true/false}',
'{"method": "string", "city": "string", "address": "string", "urgent": "boolean"}',
'nano', 5);
```

---

## Правила нормализации (специфичные для запчастей)

```sql
INSERT INTO elo_normalization_rules (field_code, pattern, normalized_value, priority) VALUES
-- Типы запчастей
('part.category', 'экран', 'screen', 100),
('part.category', 'дисплей', 'screen', 100),
('part.category', 'тачскрин', 'screen', 90),
('part.category', 'модуль', 'screen', 80),
('part.category', 'стекло', 'screen', 70),

('part.category', 'батарея', 'battery', 100),
('part.category', 'аккумулятор', 'battery', 100),
('part.category', 'акб', 'battery', 100),

('part.category', 'разъем', 'charging_port', 100),
('part.category', 'гнездо зарядки', 'charging_port', 100),
('part.category', 'порт', 'charging_port', 80),
('part.category', 'type-c', 'charging_port', 90),
('part.category', 'lightning', 'charging_port', 90),

('part.category', 'задняя крышка', 'back_cover', 100),
('part.category', 'задник', 'back_cover', 90),
('part.category', 'крышка', 'back_cover', 80),

('part.category', 'рамка', 'frame', 100),
('part.category', 'корпус', 'frame', 90),

('part.category', 'камера', 'camera', 100),
('part.category', 'модуль камеры', 'camera', 100),
('part.category', 'стекло камеры', 'camera', 90),
('part.category', 'линза', 'camera', 80),

('part.category', 'динамик', 'speaker', 100),
('part.category', 'полифония', 'speaker', 90),

('part.category', 'микрофон', 'microphone', 100),
('part.category', 'микро', 'microphone', 70),

('part.category', 'кнопка', 'button', 100),
('part.category', 'шлейф кнопки', 'button', 100),

('part.category', 'лоток сим', 'sim_tray', 100),
('part.category', 'сим держатель', 'sim_tray', 100),

('part.category', 'шлейф', 'flex', 100),
('part.category', 'межплатный', 'flex', 90),

('part.category', 'плата', 'board', 100),
('part.category', 'материнка', 'board', 90),

-- Качество
('part.quality', 'оригинал', 'original', 100),
('part.quality', 'ориг', 'original', 90),
('part.quality', 'oem', 'original', 100),
('part.quality', 'донор', 'original', 80),
('part.quality', 'снятый', 'original', 70),

('part.quality', 'премиум', 'premium', 100),
('part.quality', 'ааа', 'premium', 100),
('part.quality', 'aaa', 'premium', 100),
('part.quality', 'хорошая копия', 'premium', 90),

('part.quality', 'копия', 'standard', 100),
('part.quality', 'стандарт', 'standard', 100),
('part.quality', 'обычная', 'standard', 90),
('part.quality', 'дешевая', 'standard', 80),

('part.quality', 'переклей', 'refurbished', 100),
('part.quality', 'восстановленный', 'refurbished', 100),
('part.quality', 'refurb', 'refurbished', 100);
```

---

## Воронка для продажи запчастей

### Этапы

```
1. LEAD (Первый контакт)
   Цель: Понять, что ищет клиент
   Собираем: part_type, device
   Переход: когда понятна запчасть

2. QUALIFICATION (Квалификация)
   Цель: Уточнить требования
   Собираем: part_quality, quantity, buyer_type
   Переход: когда понятны требования

3. AVAILABILITY_CHECK (Проверка наличия) — специфичный для запчастей
   Цель: Проверить наличие и предложить варианты
   Поведение: present_and_confirm
   Переход: когда клиент выбрал вариант

4. PRESENTATION (Презентация)
   Цель: Назвать цену и условия
   Собираем: подтверждение цены
   Переход: когда клиент согласен

5. DELIVERY (Доставка)
   Цель: Согласовать способ получения
   Собираем: delivery, адрес
   Переход: когда способ выбран

6. PAYMENT (Оплата) — специфичный для продаж
   Цель: Согласовать способ оплаты
   Поведение: collect_iterative
   Переход: после оплаты

7. CONFIRMATION (Подтверждение)
   Цель: Подтвердить заказ
   Поведение: terminal
```

### SQL: Специфичные этапы воронки

```sql
-- Добавить этапы для продажи запчастей
INSERT INTO elo_funnel_stages (code, name, description, behavior_type_id, sort_order, vertical_id)
SELECT 'availability_check', 'Проверка наличия', 'Проверка наличия и предложение вариантов',
       3, 25, id
FROM elo_verticals WHERE code = 'phone_parts';

INSERT INTO elo_funnel_stages (code, name, description, behavior_type_id, sort_order, vertical_id)
SELECT 'payment', 'Оплата', 'Согласование способа оплаты',
       1, 65, id
FROM elo_verticals WHERE code = 'phone_parts';

INSERT INTO elo_funnel_stages (code, name, description, behavior_type_id, sort_order, vertical_id)
SELECT 'delivery', 'Доставка', 'Согласование способа доставки',
       1, 60, id
FROM elo_verticals WHERE code = 'phone_parts';
```

---

## Примеры диалогов

### Пример 1: Розничный покупатель

**Клиент:** Здравствуйте, нужен экран на iPhone 13 Pro, оригинал есть?

**Извлечённый контекст:**
```json
{
  "greeting": {"value": true},
  "device": {"brand": "Apple", "model": "iPhone 13 Pro"},
  "part_type": {"category": "screen", "part_name": "экран", "for_device": "iPhone 13 Pro"},
  "part_quality": {"quality": "original"},
  "buyer_type": {"buyer_type": "individual", "confidence": "medium"}
}
```

### Пример 2: Сервисный центр

**Клиент:** Добрый день. Мы сервисный центр, нужны батареи на самсунги, штук 20, можно ААА качество. Доставка СДЭК в Казань.

**Извлечённый контекст:**
```json
{
  "greeting": {"value": true},
  "device": {"brand": "Samsung"},
  "part_type": {"category": "battery", "part_name": "батареи"},
  "part_quality": {"quality": "premium", "price_sensitive": false},
  "quantity": {"quantity": 20, "is_wholesale": true},
  "buyer_type": {"buyer_type": "service_center", "confidence": "high"},
  "delivery": {"method": "transport_company", "city": "Казань"}
}
```

### Пример 3: Мастер ищет дешевле

**Клиент:** Разъем зарядки на редми ноут 10, есть что-нибудь подешевле?

**Извлечённый контекст:**
```json
{
  "device": {"brand": "Xiaomi", "model": "Redmi Note 10"},
  "part_type": {"category": "charging_port", "part_name": "разъем зарядки"},
  "part_quality": {"quality": "standard", "price_sensitive": true},
  "buyer_type": {"buyer_type": "technician", "confidence": "medium"}
}
```

---

## Чеклист настройки вертикали

### Структура
- [ ] Домен `mobile_phones` создан
- [ ] Вертикаль `phone_parts` создана в `elo_verticals`
- [ ] Domain context types созданы (device, device_condition, price_expectation)
- [ ] Vertical context types созданы (part_type, part_quality, quantity, buyer_type, delivery)
- [ ] Правила нормализации добавлены
- [ ] Этапы воронки добавлены (availability_check, delivery, payment)
- [ ] Тенант привязан к домену и вертикали

### Справочники (⚠️ ОБЯЗАТЕЛЬНО)
- [ ] `elo_dict_brands` — проверить наличие брендов которые продаёте
- [ ] `elo_dict_models` — проверить наличие моделей для которых продаёте запчасти
- [ ] `elo_problem_categories` — проверить категории запчастей

> См. [00_DOMAIN_MOBILE_PHONES.md](./00_DOMAIN_MOBILE_PHONES.md#справочники-обязательно-для-заполнения)

---

*Вертикаль: phone_parts | Создан: 2026-01-04*

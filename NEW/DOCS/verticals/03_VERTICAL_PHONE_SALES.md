# Вертикаль: Продажа сотовых телефонов

> Полная конфигурация Block 2 для магазинов телефонов

---

## Описание вертикали

**Домен:** `mobile_phones` (Сотовые телефоны)
**Код вертикали:** `phone_sales`
**Название:** Продажа сотовых телефонов
**Бизнес:** Магазины телефонов, онлайн-магазины, салоны связи, перекупщики

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
│ VERTICAL: phone_sales                                       │
│ purchase_intent, requirements, trade_in, payment_method, delivery │
└─────────────────────────────────────────────────────────────┘
```

---

## Vertical Context Types

### 1. Purchase Intent (Намерение покупки)

**Что извлекаем:** Что именно хочет клиент

**В свободной форме:**
```
Нужно понять намерение:
- Хочет конкретную модель
- Ищет что-то в бюджете
- Сравнивает варианты
- Готов к покупке или только смотрит
```

**Промпт:**
```
Ты консультант магазина телефонов. Определи намерение покупателя.

Типы намерений:
- specific_model: ищет конкретную модель (iPhone 15 Pro, Galaxy S24)
- brand_preference: ищет телефон определённого бренда (хочу Samsung)
- budget_search: ищет в бюджете (до 30 тысяч, недорогой)
- feature_search: ищет по характеристикам (с хорошей камерой, большой экран)
- comparison: сравнивает модели (что лучше iPhone или Samsung)
- just_looking: просто смотрит, интересуется (что у вас есть)
- ready_to_buy: готов купить сейчас (хочу заказать, оформляйте)

Также определи:
- Насколько срочно нужен телефон
- Первый телефон или замена старого

Верни JSON:
{
  "intent": "тип намерения",
  "specific_model": "модель если указана",
  "readiness": "high/medium/low",
  "is_replacement": true/false/null
}
```

**Схема:**
```json
{
  "intent": "string",
  "specific_model": "string",
  "readiness": "string",
  "is_replacement": "boolean"
}
```

**Tier:** `optima`

---

### 2. Requirements (Требования)

**Что извлекаем:** Что важно для клиента в телефоне

**В свободной форме:**
```
Требования к телефону:
- Технические (камера, память, экран, батарея)
- Для чего нужен (игры, фото, работа, звонки)
- Размер (компактный, большой)
- Особенности (NFC, водозащита, беспроводная зарядка)
```

**Промпт:**
```
Извлеки требования клиента к телефону.

Категории требований:
- camera: хорошая камера, для фото, для видео
- battery: долго держит заряд, большая батарея, на весь день
- performance: мощный, для игр, не тормозит
- storage: много памяти, 256 ГБ, для фото/видео
- screen: большой экран, маленький, AMOLED, яркий
- compact: компактный, небольшой, влезает в карман
- durability: прочный, не разобьётся, водозащита
- features: NFC, беспроводная зарядка, стилус

Для чего нужен:
- gaming: для игр
- photo: для фотографий
- work: для работы, почта, мессенджеры
- calls: звонки, простой телефон
- child: для ребёнка
- elderly: для пожилого человека

Верни JSON:
{
  "priorities": ["массив приоритетов из категорий"],
  "use_case": "для чего нужен",
  "special_features": ["особые требования"],
  "excluded": ["что точно не нужно"]
}
```

**Схема:**
```json
{
  "priorities": "array",
  "use_case": "string",
  "special_features": "array",
  "excluded": "array"
}
```

**Tier:** `optima`

---

### 3. Trade In (Трейд-ин)

**Что извлекаем:** Есть ли старый телефон на обмен

**В свободной форме:**
```
Трейд-ин — обмен старого телефона с доплатой.
Нужно узнать:
- Есть ли старый телефон
- Какой модели
- В каком состоянии
- Готов ли сдать в зачёт
```

**Промпт:**
```
Определи, упоминает ли клиент старый телефон для обмена/сдачи.

Ищи:
- Упоминание старого телефона (у меня сейчас iPhone 12)
- Желание сдать (можно сдать старый, в зачёт)
- Состояние старого телефона

Верни JSON:
{
  "has_trade_in": true/false/null,
  "old_device": {
    "brand": "бренд старого",
    "model": "модель старого"
  },
  "old_condition": "new/like_new/good/fair/poor",
  "wants_trade_in": true/false/null
}
```

**Схема:**
```json
{
  "has_trade_in": "boolean",
  "old_device": "object",
  "old_condition": "string",
  "wants_trade_in": "boolean"
}
```

**Tier:** `small`

---

### 4. Payment Method (Способ оплаты)

**Что извлекаем:** Как планирует платить

**В свободной форме:**
```
Способы оплаты:
- Наличные
- Карта
- Рассрочка/кредит
- Онлайн оплата
```

**Промпт:**
```
Извлеки информацию о предпочтительном способе оплаты.

Способы:
- cash: наличные, наликом
- card: картой, безнал
- installment: рассрочка, в рассрочку, без переплаты
- credit: кредит, в кредит
- online: онлайн оплата, на сайте

Также ищи:
- Упоминание бюджета
- Готовность к предоплате

Верни JSON:
{
  "method": "способ оплаты",
  "installment_interest": true/false (с процентами или без),
  "budget_confirmed": число или null
}
```

**Схема:**
```json
{
  "method": "string",
  "installment_interest": "boolean",
  "budget_confirmed": "number"
}
```

**Tier:** `nano`

---

### 5. Delivery (Доставка)

**Что извлекаем:** Способ получения

**В свободной форме:**
```
Способы получения:
- Самовывоз из магазина
- Курьерская доставка
- Почта/ТК
```

**Промпт:**
```
Извлеки информацию о желаемом способе получения.

Способы:
- pickup: самовывоз, заберу сам, подъеду
- courier: курьер, доставка, привезите
- transport: СДЭК, транспортная, ТК
- post: почта

Ищи также:
- Город/адрес
- Когда удобно
- Срочность

Верни JSON:
{
  "method": "способ",
  "city": "город",
  "address": "адрес если есть",
  "preferred_time": "когда удобно",
  "urgent": true/false
}
```

**Схема:**
```json
{
  "method": "string",
  "city": "string",
  "address": "string",
  "preferred_time": "string",
  "urgent": "boolean"
}
```

**Tier:** `nano`

---

## SQL: Создание вертикали и context types

```sql
-- 1. Создать вертикаль
INSERT INTO elo_verticals (domain_id, code, name, description, is_active, sort_order)
SELECT id, 'phone_sales', 'Продажа сотовых телефонов',
       'Магазины телефонов, онлайн-магазины, салоны связи', true, 3
FROM elo_domains WHERE code = 'mobile_phones';

-- Получить ID вертикали
SELECT id FROM elo_verticals WHERE code = 'phone_sales';
-- Допустим, id = 12

-- 2. Создать vertical context types
INSERT INTO elo_v_context_types (vertical_id, code, name, description, default_prompt, output_schema, agent_tier, sort_order) VALUES

-- Purchase intent
(12, 'purchase_intent', 'Намерение покупки', 'Что именно хочет клиент',
'Определи намерение покупателя.
Типы: specific_model (конкретная модель), brand_preference (бренд), budget_search (бюджет), feature_search (по характеристикам), comparison (сравнение), just_looking (смотрит), ready_to_buy (готов купить).
Верни JSON: {"intent": "...", "specific_model": "...", "readiness": "high/medium/low", "is_replacement": true/false}',
'{"intent": "string", "specific_model": "string", "readiness": "string", "is_replacement": "boolean"}',
'optima', 1),

-- Requirements
(12, 'requirements', 'Требования', 'Что важно в телефоне',
'Извлеки требования: камера, батарея, производительность, память, экран, компактность, прочность.
Для чего: gaming, photo, work, calls, child, elderly.
Верни JSON: {"priorities": [...], "use_case": "...", "special_features": [...], "excluded": [...]}',
'{"priorities": "array", "use_case": "string", "special_features": "array", "excluded": "array"}',
'optima', 2),

-- Trade in
(12, 'trade_in', 'Трейд-ин', 'Обмен старого телефона',
'Есть ли старый телефон на обмен?
Верни JSON: {"has_trade_in": true/false, "old_device": {"brand": "...", "model": "..."}, "old_condition": "...", "wants_trade_in": true/false}',
'{"has_trade_in": "boolean", "old_device": "object", "old_condition": "string", "wants_trade_in": "boolean"}',
'small', 3),

-- Payment method
(12, 'payment_method', 'Способ оплаты', 'Как планирует платить',
'Способ оплаты: cash, card, installment (рассрочка), credit, online.
Верни JSON: {"method": "...", "installment_interest": true/false, "budget_confirmed": число}',
'{"method": "string", "installment_interest": "boolean", "budget_confirmed": "number"}',
'nano', 4),

-- Delivery
(12, 'delivery', 'Доставка', 'Способ получения',
'Способ: pickup, courier, transport, post.
Верни JSON: {"method": "...", "city": "...", "address": "...", "preferred_time": "...", "urgent": true/false}',
'{"method": "string", "city": "string", "address": "string", "preferred_time": "string", "urgent": "boolean"}',
'nano', 5);
```

---

## Правила нормализации (специфичные для продаж)

```sql
INSERT INTO elo_normalization_rules (field_code, pattern, normalized_value, priority) VALUES
-- Намерения покупки
('intent.type', 'хочу посмотреть', 'just_looking', 100),
('intent.type', 'что есть', 'just_looking', 90),
('intent.type', 'покажите', 'just_looking', 80),
('intent.type', 'хочу купить', 'ready_to_buy', 100),
('intent.type', 'оформляйте', 'ready_to_buy', 100),
('intent.type', 'беру', 'ready_to_buy', 90),
('intent.type', 'что лучше', 'comparison', 100),
('intent.type', 'посоветуйте', 'feature_search', 90),
('intent.type', 'недорогой', 'budget_search', 100),
('intent.type', 'до ', 'budget_search', 80),
('intent.type', 'в пределах', 'budget_search', 80),

-- Требования
('requirements.priority', 'камера', 'camera', 100),
('requirements.priority', 'фото', 'camera', 90),
('requirements.priority', 'батарея', 'battery', 100),
('requirements.priority', 'заряд', 'battery', 90),
('requirements.priority', 'игры', 'performance', 100),
('requirements.priority', 'мощный', 'performance', 90),
('requirements.priority', 'память', 'storage', 100),
('requirements.priority', 'экран', 'screen', 100),
('requirements.priority', 'компактный', 'compact', 100),
('requirements.priority', 'маленький', 'compact', 90),

-- Use case
('requirements.use_case', 'для игр', 'gaming', 100),
('requirements.use_case', 'играть', 'gaming', 90),
('requirements.use_case', 'для работы', 'work', 100),
('requirements.use_case', 'рабочий', 'work', 80),
('requirements.use_case', 'для ребенка', 'child', 100),
('requirements.use_case', 'ребенку', 'child', 100),
('requirements.use_case', 'маме', 'elderly', 90),
('requirements.use_case', 'бабушке', 'elderly', 100),
('requirements.use_case', 'пожилому', 'elderly', 100),

-- Способы оплаты
('payment.method', 'наличные', 'cash', 100),
('payment.method', 'наликом', 'cash', 100),
('payment.method', 'картой', 'card', 100),
('payment.method', 'безнал', 'card', 90),
('payment.method', 'рассрочка', 'installment', 100),
('payment.method', 'без переплаты', 'installment', 90),
('payment.method', 'кредит', 'credit', 100),
('payment.method', 'в кредит', 'credit', 100);
```

---

## Воронка для продажи телефонов

### Этапы

```
1. LEAD (Первый контакт)
   Цель: Понять, что ищет клиент
   Собираем: purchase_intent, device (если конкретная модель)
   Переход: когда понятно намерение

2. NEEDS_ANALYSIS (Выявление потребностей) — специфичный для продаж
   Цель: Понять требования
   Собираем: requirements, price_expectation
   Переход: когда понятны потребности

3. RECOMMENDATION (Рекомендация) — специфичный для продаж
   Цель: Предложить подходящие варианты
   Поведение: present_and_confirm
   Переход: когда клиент выбрал

4. TRADE_IN_CHECK (Проверка трейд-ин) — опционально
   Цель: Оценить старый телефон
   Собираем: trade_in
   Переход: после оценки

5. PRESENTATION (Презентация)
   Цель: Финальная цена с учётом скидок/трейд-ин
   Поведение: present_and_confirm
   Переход: когда клиент согласен

6. PAYMENT (Оплата)
   Цель: Согласовать способ оплаты
   Собираем: payment_method
   Переход: после выбора способа

7. DELIVERY (Доставка)
   Цель: Согласовать доставку
   Собираем: delivery
   Переход: после выбора

8. CONFIRMATION (Подтверждение)
   Цель: Подтвердить заказ
   Поведение: terminal
```

### SQL: Специфичные этапы воронки

```sql
-- Добавить этапы для продажи телефонов
INSERT INTO elo_funnel_stages (code, name, description, behavior_type_id, sort_order, vertical_id)
SELECT 'needs_analysis', 'Выявление потребностей', 'Понимание требований клиента',
       1, 15, id
FROM elo_verticals WHERE code = 'phone_sales';

INSERT INTO elo_funnel_stages (code, name, description, behavior_type_id, sort_order, vertical_id)
SELECT 'recommendation', 'Рекомендация', 'Предложение подходящих вариантов',
       3, 20, id
FROM elo_verticals WHERE code = 'phone_sales';

INSERT INTO elo_funnel_stages (code, name, description, behavior_type_id, sort_order, vertical_id)
SELECT 'trade_in_check', 'Оценка трейд-ин', 'Оценка старого телефона',
       1, 30, id
FROM elo_verticals WHERE code = 'phone_sales';

INSERT INTO elo_funnel_stages (code, name, description, behavior_type_id, sort_order, vertical_id)
SELECT 'payment', 'Оплата', 'Согласование способа оплаты',
       1, 65, id
FROM elo_verticals WHERE code = 'phone_sales';

INSERT INTO elo_funnel_stages (code, name, description, behavior_type_id, sort_order, vertical_id)
SELECT 'delivery', 'Доставка', 'Согласование доставки',
       1, 70, id
FROM elo_verticals WHERE code = 'phone_sales';
```

---

## Примеры диалогов

### Пример 1: Конкретная модель

**Клиент:** Привет! Есть iPhone 15 Pro 256 гб? Сколько стоит?

**Извлечённый контекст:**
```json
{
  "greeting": {"value": true},
  "device": {"brand": "Apple", "model": "iPhone 15 Pro", "storage": 256},
  "purchase_intent": {"intent": "specific_model", "specific_model": "iPhone 15 Pro 256GB", "readiness": "high"}
}
```

### Пример 2: Выбор по бюджету

**Клиент:** Ищу телефон до 30 тысяч с хорошей камерой для мамы, чтобы несложный был

**Извлечённый контекст:**
```json
{
  "purchase_intent": {"intent": "budget_search", "readiness": "medium"},
  "price_expectation": {"max": 30000, "category": "budget"},
  "requirements": {
    "priorities": ["camera"],
    "use_case": "elderly",
    "special_features": ["простой интерфейс"]
  }
}
```

### Пример 3: С трейд-ин

**Клиент:** Хочу поменять свой самсунг S21 на что-то новое, можно в зачёт сдать? Телефон в хорошем состоянии

**Извлечённый контекст:**
```json
{
  "purchase_intent": {"intent": "brand_preference", "readiness": "high", "is_replacement": true},
  "trade_in": {
    "has_trade_in": true,
    "old_device": {"brand": "Samsung", "model": "Galaxy S21"},
    "old_condition": "good",
    "wants_trade_in": true
  }
}
```

### Пример 4: Сравнение

**Клиент:** Что лучше взять — Xiaomi 14 или iPhone 15? Для игр в основном

**Извлечённый контекст:**
```json
{
  "purchase_intent": {"intent": "comparison", "readiness": "medium"},
  "device": {"brand": null, "model": "Xiaomi 14 / iPhone 15"},
  "requirements": {
    "priorities": ["performance"],
    "use_case": "gaming"
  }
}
```

### Пример 5: Рассрочка

**Клиент:** Можно в рассрочку без переплаты? Хочу Galaxy S24 Ultra, доставка в Краснодар

**Извлечённый контекст:**
```json
{
  "device": {"brand": "Samsung", "model": "Galaxy S24 Ultra"},
  "purchase_intent": {"intent": "specific_model", "readiness": "high"},
  "payment_method": {"method": "installment", "installment_interest": false},
  "delivery": {"method": "courier", "city": "Краснодар"}
}
```

---

## Чеклист настройки вертикали

### Структура
- [ ] Домен `mobile_phones` создан
- [ ] Вертикаль `phone_sales` создана в `elo_verticals`
- [ ] Domain context types созданы (device, device_condition, price_expectation)
- [ ] Vertical context types созданы (purchase_intent, requirements, trade_in, payment_method, delivery)
- [ ] Правила нормализации добавлены
- [ ] Этапы воронки добавлены (needs_analysis, recommendation, trade_in_check, payment, delivery)
- [ ] Тенант привязан к домену и вертикали

### Справочники (⚠️ ОБЯЗАТЕЛЬНО)
- [ ] `elo_dict_brands` — проверить наличие брендов которые продаёте
- [ ] `elo_dict_models` — проверить наличие моделей которые продаёте

> См. [00_DOMAIN_MOBILE_PHONES.md](./00_DOMAIN_MOBILE_PHONES.md#справочники-обязательно-для-заполнения)

---

*Вертикаль: phone_sales | Создан: 2026-01-04*

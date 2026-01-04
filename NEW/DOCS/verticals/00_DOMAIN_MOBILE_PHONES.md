# Домен: Сотовые телефоны (mobile_phones)

> Общие настройки для всех вертикалей домена

---

## Описание домена

**Код:** `mobile_phones`
**Название:** Сотовые телефоны
**Вертикали:**
- `phone_repair` — Ремонт сотовых телефонов
- `phone_parts` — Продажа запчастей для телефонов
- `phone_sales` — Продажа сотовых телефонов

---

## SQL: Создание домена

```sql
-- Домен уже может существовать как electronics, но создадим более специфичный
INSERT INTO elo_domains (code, name, description, is_active, sort_order) VALUES
('mobile_phones', 'Сотовые телефоны', 'Ремонт, продажа телефонов и запчастей', true, 10)
ON CONFLICT (code) DO UPDATE SET name = EXCLUDED.name;

-- Получить ID домена
SELECT id FROM elo_domains WHERE code = 'mobile_phones';
-- Допустим, id = 4
```

---

## Domain Context Types (общие для всех вертикалей)

### Что извлекаем на уровне домена

| code | name | Описание | Tier |
|------|------|----------|------|
| device | Устройство | Бренд, модель, цвет, IMEI | small |
| device_condition | Состояние | Новый, б/у, восстановленный | nano |
| price_expectation | Ожидание цены | Бюджет клиента | nano |

### SQL: Создание domain context types

```sql
-- Device (устройство)
INSERT INTO elo_d_context_types (domain_id, code, name, description, default_prompt, output_schema, agent_tier, sort_order) VALUES
(4, 'device', 'Устройство', 'Информация о телефоне клиента',
'Ты эксперт по мобильным телефонам. Извлеки информацию об устройстве из сообщения клиента.

Ищи:
- brand: бренд (Apple, Samsung, Xiaomi, Huawei, Honor, Realme, OPPO, Vivo, Google, OnePlus, Nothing, Poco)
- model: модель (iPhone 14 Pro Max, Galaxy S23 Ultra, Redmi Note 12)
- color: цвет (если упоминается)
- storage: память в ГБ (64, 128, 256, 512, 1024)
- imei: IMEI если есть (15 цифр)

Верни JSON. Если поле не найдено — null.
Только JSON, без объяснений.',
'{"brand": "string", "model": "string", "color": "string", "storage": "number", "imei": "string"}',
'small', 1);

-- Device condition (состояние)
INSERT INTO elo_d_context_types (domain_id, code, name, description, default_prompt, output_schema, agent_tier, sort_order) VALUES
(4, 'device_condition', 'Состояние устройства', 'Новый, б/у, восстановленный',
'Определи состояние устройства из сообщения.

Категории:
- new: новый, запечатанный, в пленке
- like_new: как новый, идеальное состояние, без царапин
- good: хорошее состояние, небольшие следы использования
- fair: удовлетворительное, царапины, потертости
- poor: плохое, трещины, сколы, но работает
- broken: не работает, разбит

Верни JSON: {"condition": "категория", "details": "уточнение если есть"}',
'{"condition": "string", "details": "string"}',
'nano', 2);

-- Price expectation (ожидание цены)
INSERT INTO elo_d_context_types (domain_id, code, name, description, default_prompt, output_schema, agent_tier, sort_order) VALUES
(4, 'price_expectation', 'Ожидание по цене', 'Бюджет или ожидания клиента',
'Найди в сообщении информацию о бюджете или ценовых ожиданиях клиента.

Ищи:
- Конкретную сумму (до 30000, около 50к, в районе 20 тысяч)
- Диапазон (от 20 до 30 тысяч)
- Категорию (недорого, бюджетный, премиум, флагман)

Верни JSON: {"min": число или null, "max": число или null, "category": "budget/mid/premium/flagship или null"}',
'{"min": "number", "max": "number", "category": "string"}',
'nano', 3);
```

---

## Правила нормализации (общие)

```sql
-- Бренды телефонов
INSERT INTO elo_normalization_rules (field_code, pattern, normalized_value, priority) VALUES
-- Apple
('device.brand', 'айфон', 'Apple', 100),
('device.brand', 'iphone', 'Apple', 100),
('device.brand', 'apple', 'Apple', 100),
('device.brand', 'эпл', 'Apple', 90),
('device.brand', 'яблоко', 'Apple', 80),

-- Samsung
('device.brand', 'самсунг', 'Samsung', 100),
('device.brand', 'samsung', 'Samsung', 100),
('device.brand', 'галакси', 'Samsung', 90),
('device.brand', 'galaxy', 'Samsung', 90),
('device.brand', 'самс', 'Samsung', 80),

-- Xiaomi и суббренды
('device.brand', 'сяоми', 'Xiaomi', 100),
('device.brand', 'xiaomi', 'Xiaomi', 100),
('device.brand', 'ксяоми', 'Xiaomi', 90),
('device.brand', 'редми', 'Xiaomi', 100),
('device.brand', 'redmi', 'Xiaomi', 100),
('device.brand', 'поко', 'Xiaomi', 100),
('device.brand', 'poco', 'Xiaomi', 100),
('device.brand', 'ми', 'Xiaomi', 70),

-- Huawei
('device.brand', 'хуавей', 'Huawei', 100),
('device.brand', 'huawei', 'Huawei', 100),
('device.brand', 'хуавэй', 'Huawei', 90),
('device.brand', 'хуавэи', 'Huawei', 90),

-- Honor
('device.brand', 'хонор', 'Honor', 100),
('device.brand', 'honor', 'Honor', 100),
('device.brand', 'онор', 'Honor', 90),

-- Realme
('device.brand', 'реалми', 'Realme', 100),
('device.brand', 'realme', 'Realme', 100),
('device.brand', 'риалми', 'Realme', 90),

-- OPPO
('device.brand', 'оппо', 'OPPO', 100),
('device.brand', 'oppo', 'OPPO', 100),

-- Vivo
('device.brand', 'виво', 'Vivo', 100),
('device.brand', 'vivo', 'Vivo', 100),

-- Google
('device.brand', 'гугл', 'Google', 100),
('device.brand', 'google', 'Google', 100),
('device.brand', 'пиксель', 'Google', 90),
('device.brand', 'pixel', 'Google', 90),

-- OnePlus
('device.brand', 'ванплас', 'OnePlus', 100),
('device.brand', 'oneplus', 'OnePlus', 100),
('device.brand', 'один плюс', 'OnePlus', 90),

-- Nothing
('device.brand', 'насинг', 'Nothing', 100),
('device.brand', 'nothing', 'Nothing', 100);

-- Модели (суффиксы)
INSERT INTO elo_normalization_rules (field_code, pattern, normalized_value, priority) VALUES
('device.model', 'про макс', 'Pro Max', 100),
('device.model', 'pro max', 'Pro Max', 100),
('device.model', 'промакс', 'Pro Max', 90),
('device.model', 'ультра', 'Ultra', 100),
('device.model', 'ultra', 'Ultra', 100),
('device.model', 'плюс', 'Plus', 100),
('device.model', 'plus', 'Plus', 100),
('device.model', 'лайт', 'Lite', 100),
('device.model', 'lite', 'Lite', 100),
('device.model', 'про', 'Pro', 90),
('device.model', 'pro', 'Pro', 90);
```

---

## Справочники (обязательно для заполнения)

> ⚠️ **ВАЖНО:** Перед запуском тенанта необходимо заполнить справочники

### Таблицы справочников

| Таблица | Описание | Статус |
|---------|----------|--------|
| `elo_dict_brands` | Бренды устройств | ⚠️ **Требует проверки** |
| `elo_dict_models` | Модели устройств | ⚠️ **Требует проверки** |
| `elo_symptom_types` | Типы симптомов | ✅ Заполнено (25 записей) |
| `elo_diagnosis_types` | Типы диагнозов | ✅ Заполнено (10 записей) |
| `elo_repair_actions` | Типы ремонтов | ✅ Заполнено (10 записей) |
| `elo_problem_categories` | Категории проблем | ✅ Заполнено (9 записей) |

### Как проверить

```sql
-- Бренды (должно быть минимум для твоего бизнеса)
SELECT code, name FROM elo_dict_brands WHERE is_active = true;

-- Модели (должны быть модели которые чинишь/продаёшь)
SELECT b.name as brand, m.name as model, m.release_year
FROM elo_dict_models m
JOIN elo_dict_brands b ON m.brand_id = b.id
WHERE m.is_active = true
ORDER BY b.name, m.release_year DESC;

-- Симптомы
SELECT code, name, category FROM elo_symptom_types;
```

### Как добавить

```sql
-- Добавить бренд
INSERT INTO elo_dict_brands (code, name, sort_order) VALUES
('new_brand', 'New Brand', 100);

-- Добавить модель
INSERT INTO elo_dict_models (brand_id, code, name, release_year)
SELECT id, 'new_model', 'New Model Name', 2024
FROM elo_dict_brands WHERE code = 'samsung';
```

---

## Вертикали домена

| Вертикаль | Файл конфигурации |
|-----------|-------------------|
| Ремонт телефонов | `01_VERTICAL_PHONE_REPAIR.md` |
| Продажа запчастей | `02_VERTICAL_PHONE_PARTS.md` |
| Продажа телефонов | `03_VERTICAL_PHONE_SALES.md` |

---

*Домен: mobile_phones | Создан: 2026-01-04*
